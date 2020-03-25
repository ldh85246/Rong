package com.example.demo.controller;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KmaController {
	
	@RequestMapping(value = "/getKma", produces = "application/xml; charset=UTF-8")
	public String kma() {
		String str = "";
		String addr = "http://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";
		try {
			URL url = new URL(addr);			// addr에 있는 url 주소로 URL객체 생성
			InputStream os = url.openStream();	// url객체로 InputStream을 생성
			byte[] data = os.readAllBytes();	// is로 byte[]를 반환
			str = new String(data);				// 문자열로 변환
			
			// 예전 jdk버전이라 readAllBytes()가 없는 경우
//			byte[] data = new byte[100];
//			while (os.read(data) != -1) { // 더이상 읽어들일 데이터가 없다면, -1 : 파일의 끝
//				String s = new String(data, "UTF-8");
//				str += s;
//				Arrays.fill(data, (byte) 0); // byte형 배열이므로 (byte)로 형변환
//			}
//			while (true) {
//				int n = os.read(data);
//				String s = new String(data, 0, n);
//				str += s;
//				Arrays.fill(data, (byte) 0);
//				if (n == -1) {
//					break;
//				}
//			}
//			System.out.println(str);
//			str = str.replace("\" ?>", "\"?>");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return str;
	}
}
