package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DeptDao;
import com.example.demo.vo.DeptVo;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

@RestController // view로 바로 가는 것이 아니라 Ajax통신에 의해서 데이터를 반환하는 컨트롤러로 정의할 경우에 사용한다.
public class DeptController {

	@Autowired
	private DeptDao dao;

	public void setDao(DeptDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/listDeptXML.do", produces = "application/xml; charset=UTF-8")
	public String listDeptXML() {
		String str = "";
		List<DeptVo> list = dao.listAll();
		XStream stream = new XStream(); // 자바 객체를 xml화 해준다.
		stream.alias("dept", DeptVo.class);
		str = stream.toXML(list); // 반환된 문자열을 xml로 변환시켜줘(xml도 문자열이기 때문에 인코딩도 필요함)
		return str;
	}

	@RequestMapping(value = "/listDept.do", produces = "application/json; charset=UTF-8")
	public String Dept() {
		String str = "";
		List<DeptVo> list = dao.listAll();

//		ArrayList<DeptVo> list = new ArrayList<DeptVo>();
//		list.add(new DeptVo(100, "도토리", "서울"));
//		list.add(new DeptVo(200, "하기나름", "부산"));
//		list.add(new DeptVo(300, "출발개발팀", "서울"));
//		list.add(new DeptVo(400, "자바잡아", "광주"));
		Gson gson = new Gson();
		str = gson.toJson(list);
		return str;
	}

	@RequestMapping("/insertDept.do")
	// public String insertDept(int dno, String dname, String dloc) {
	public String insertDept(DeptVo d) {
		System.out.println(d);
		dao.insert(d);
		String str = "ok";
		return str;
	}

	@RequestMapping("/updateDept.do")
	// public String insertDept(int dno, String dname, String dloc) {
	public String updateDept(DeptVo d) {
		System.out.println(d);
		dao.update(d);
		String str = "ok";
		return str;
	}

	@RequestMapping("/deleteDept.do")
	// public String insertDept(int dno, String dname, String dloc) {
	public String deleteDept(DeptVo d) {
		System.out.println(d);
		dao.delete(d);
		String str = "ok";
		return str;
	}
}
