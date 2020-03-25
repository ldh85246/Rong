package com.example.demo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.GoodsDao;
import com.example.demo.db.GoodsManager;
import com.example.demo.vo.GoodsVo;

@Controller
public class GoodsController {

	private GoodsDao dao;

	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listGoods.do")
	public ModelAndView listGoods(@RequestParam(value = "pageNUM", defaultValue = "1") int pageNUM) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("title", "상품목록");

		HashMap map = new HashMap();
		int start = (pageNUM - 1) * GoodsDao.pageSIZE + 1;
		int end = start + GoodsDao.pageSIZE - 1;
		map.put("start", start);
		map.put("end", end);
		System.out.println(map);
		mav.addObject("list", dao.listAll(map));

		System.out.println("전체페이수:" + GoodsDao.totalPage);
		mav.addObject("totalPage", GoodsDao.totalPage);
		return mav;
	}

	@RequestMapping(value = "/insertGoods.do", method = RequestMethod.GET)
	public void insertForm() {
	}

	@RequestMapping(value = "/insertGoods.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(GoodsVo g, HttpSession session, HttpServletRequest request) {
		String path = request.getRealPath("img");
		System.out.println("path" + path);
		ModelAndView mav = new ModelAndView("redirect:/listGoods.do");
		String msg = "상품등록에 성공했습니다.";

		MultipartFile uploadFile = g.getUploadFile();
		String fname = uploadFile.getOriginalFilename();
		g.setFname(fname);

		int re = dao.insertGoods(g);
		if (re <= 0) {
			msg = "상품등록에 실패하였습니다.";
		} else {
			try {
				byte[] data = uploadFile.getBytes();
				FileOutputStream fos = new FileOutputStream(path + "/" + fname);
				fos.write(data);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예외발생" + e.getMessage());
			}
		}
		session.setAttribute("msg", msg);
		return mav;
	}

	@RequestMapping("/detailGoods.do")
	public ModelAndView detailGoods(int no) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("g", dao.getGoods(no));
		return mav;
	}

	@RequestMapping(value = "/updateGoods.do", method = RequestMethod.GET)
	public ModelAndView updateForm(int no) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("g", dao.getGoods(no));
		return mav;
	}

	@RequestMapping(value = "/updateGoods.do", method = RequestMethod.POST)
	public ModelAndView updateSubmit(GoodsVo g, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("redirect:/listGoods.do");
		String oldFname = g.getFname();
		String fname = null;

		String path = request.getRealPath("img");
		MultipartFile uploadFile = g.getUploadFile();
		if (uploadFile != null) {
			fname = uploadFile.getOriginalFilename();
			if (fname != null && fname.equals("")) {
				g.setFname(fname);
				try {
					byte[] data = uploadFile.getBytes();
					FileOutputStream fos = new FileOutputStream(path + "/" + fname);
					fos.write(data);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("예외발생" + e.getMessage());
				}
			}
		}

		String msg = "상품수정에 성공했습니다.	";
		int re = dao.updateGoods(g);
		if (re > 0 && fname != null && fname.equals("")) {
			File file = new File(path + "/" + oldFname);
			file.delete();
		}
		return mav;
	}

	@RequestMapping("/deleteGoods.do")
	public ModelAndView deleteGoods(int no, HttpSession session, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("redirect:/listGoods.do");
		String oldFname = dao.getGoods(no).getFname();
		int re = dao.deleteGoods(no);
		String str = "상품 삭제에 실패하였습니다.";
		if (re > 0) {
			try {
				str = "상품 삭제에 성공하였습니다.";
				String path = request.getRealPath("img");
				File file = new File(path + "/" + oldFname);
				file.delete();
				System.out.println("상품을 삭제하였습니다.");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예외발생:" + e.getMessage());
			}
		}
		return mav;
	}
}
