package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.example.demo.db.DBManager;
import com.example.demo.vo.EmpVo;

//@Service
@Controller
public class SchedulingController {
	// 초 분 시 일 월 요일 년
//	@Scheduled(cron = "* * * * * * *")
//	@Scheduled(cron = "0 40 12 30 * *")
//	public void pro() {
//		Date today = new Date();
//		System.out.println(today);
//	}
	@Autowired
	private JavaMailSender mailSender;

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Scheduled(cron = "0 0 * * * *")
	public void pro() {
		Date today = new Date();
		System.out.println(today);

		List<EmpVo> list = DBManager.listEmp();

		for (EmpVo e : list) {
			sendMail(e);
		}
	}

	private void sendMail(EmpVo e) {
		mailSender.send(new MimeMessagePreparator() {
			public void prepare(MimeMessage mimeMessage) throws MessagingException {
				MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				String contents = "<h2>" + e.getEname() + "님의 이번달 급여는 " + e.getSal() + "원 입니다.</h2>";
				message.setFrom("");
				message.setTo(e.getEmail());
				message.setSubject("급여명세서");
				message.setText(contents, true);
				message.addInline("myLogo", new ClassPathResource("/static/man.gif"));
//				message.addAttachment("", new ClassPathResource(""));
			}
		});
	}
}
