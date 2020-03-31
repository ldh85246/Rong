package com.example.demo.controller;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.vo.EmpVo;
@Controller
public class SalMailController {
	@Autowired
	private JavaMailSender mailSender;
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	@RequestMapping("/salMail.do")
	public String mail(HttpServletRequest request) {
		List<EmpVo> list = (List<EmpVo>)request.getAttribute("list");
		String str = "";
		try {
			for(EmpVo e : list) {
				System.out.println(e.getEname() + "/" + e.getEmail());

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return str;
	}
}
