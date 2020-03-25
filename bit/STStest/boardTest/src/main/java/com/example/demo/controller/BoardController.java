package com.example.demo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.BoardDao;
import com.example.demo.vo.BoardVo;

@Controller
public class BoardController {
	public static int pageSIZE = 2;
	public static int totalRecord = 0;
	public static int totalPage = 1;

	@Autowired
	private BoardDao dao;

	public void setDao(BoardDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listBoard.do")
	public ModelAndView listBoard(@RequestParam(value = "pageNUM", defaultValue = "1") int pageNUM) {
		totalRecord = dao.totalRecord();
		totalPage = (int) Math.ceil(totalRecord / (double) pageSIZE);
		int start = (pageNUM - 1) * pageSIZE + 1;
		int end = start + pageSIZE - 1;
		HashMap map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll(map));
		mav.addObject("totalPage", totalPage);
		System.out.println("totalPage:" + totalPage);
		return mav;
	}

	@RequestMapping(value = "/insertBoard.do", method = RequestMethod.GET)
	public ModelAndView insertForm(@RequestParam(value = "no", required = false, defaultValue = "0") int no) {
		ModelAndView mav = new ModelAndView();
		String head = "새 글 작성";
		if (no != 0) {
//			mav.addObject("no", no);
			head = "답글 작성";
			mav.addObject("title", "답글)" + dao.getBoard(no).getTitle());
		}
		mav.addObject("no", no);
		mav.addObject("head", head);
		return mav;
	}

	@RequestMapping(value = "/insertBoard.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(BoardVo b, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("redirect:/listBoard.do");

		int pno = b.getNo();

		int no = dao.nextNo();
		int b_ref = no;
		int b_level = 0;
		int b_step = 0;

		// 만약에 답글쓰기라면
		if (pno != 0) {
			BoardVo p = dao.getBoard(pno);
			b_ref = p.getB_ref();
			b_level = p.getB_level();
			b_step = p.getB_step();

			HashMap map = new HashMap();
			map.put("b_ref", b_ref);
			map.put("b_step", b_step);
			dao.updateStep(map);

			b_level++;
			b_step++;
		}

		b.setNo(no);
		b.setB_ref(b_ref);
		b.setB_level(b_level);
		b.setB_step(b_step);

		b.setIp(request.getRemoteAddr());
		String fname = null;

		String path = request.getRealPath("upload");
		System.out.println("path:" + path);
		MultipartFile uploadFile = b.getUploadFile();
		if (uploadFile != null) {
			fname = uploadFile.getOriginalFilename();
			if (fname != null && !fname.equals("")) {
				try {
					byte[] data = uploadFile.getBytes();
					FileOutputStream fos = new FileOutputStream(path + "/" + fname);
					fos.write(data);
					fos.close();
				} catch (Exception e) {
					System.out.println("예외발생:" + e.getMessage());
				}
			}
		}

		b.setFname(fname);

		int re = dao.insertBoard(b);
		System.out.println("re:" + re);

		return mav;
	}

	@RequestMapping("/detailBoard.do")
	public ModelAndView detailBoard(int no) {
		dao.updateHit(no);
		ModelAndView mav = new ModelAndView();
		mav.addObject("b", dao.getBoard(no));
		return mav;
	}

	@RequestMapping(value = "/updateBoard.do", method = RequestMethod.GET)
	public ModelAndView updateForm(int no) {
		ModelAndView mav = new ModelAndView();
//		mav.addObject("head", "글 수정");
		mav.addObject("b", dao.getBoard(no));
		return mav;
	}

	@RequestMapping(value = "/updateBoard.do", method = RequestMethod.POST)
	public ModelAndView updateSubmit(BoardVo b, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("redirect:/listBoard.do");
		String path = request.getRealPath("upload");
		String oldFname = b.getFname();
		MultipartFile uploadFile = b.getUploadFile();
		String fname = null;
		if (uploadFile != null) {
			fname = uploadFile.getOriginalFilename();
			if (fname != null && !fname.equals("")) {
				b.setFname(fname);
				try {
					FileOutputStream fos = new FileOutputStream(path + "\\" + fname);
					fos.write(uploadFile.getBytes());
					fos.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}

		int re = dao.updateBoard(b);
		if (re > 0 && // 글 수정 성공
				fname != null && !fname.equals("") && // 파일 수정 하고
				oldFname != null && !oldFname.equals("")) { // 원래 파일도 있을 떄
			File file = new File(path + "\\" + oldFname);
			file.delete();
		}
		return mav;
	}

	@RequestMapping(value = "/deleteBoard.do", method = RequestMethod.GET)
	public ModelAndView deleteForm(int no) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("no", no);
		return mav;
	}

	@RequestMapping(value = "/deleteBoard.do", method = RequestMethod.POST)
	public ModelAndView deleteSubmit(int no, String pwd, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String fname = dao.getBoard(no).getFname();
		HashMap map = new HashMap();
		map.put("no", no);
		map.put("pwd", pwd);
		int re = dao.deleteBoard(map);
		if (re > 0 && fname != null && !fname.equals("")) {
			String path = request.getRealPath("upload");
			File file = new File(path + "\\" + fname);
			file.delete();
		}
		return mav;
	}
}