package com.example.demo.contorller;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class WeatherController {

	@RequestMapping(value = "/weatherList", produces = "application/json; charset=UTF-8")
	public String listWeather(int page) {
		System.out.println(page);
		String date = new Date().toLocaleString();
		String key = "";
		try {
			StringBuilder urlBuilder = new StringBuilder(
					"http://apis.data.go.kr/1360000/VilageFcstInfoService/getFcstVersion"); /* URL */
			urlBuilder.append("&" + URLEncoder.encode("ServiceKey", "UTF-8") + "=" + URLEncoder.encode(
					"kTSiCF11%2BM%2BDqQUGt7IhQI%2FJjWaC9rRpnplyqfwTKuqem%2FWaJWO%2Bt%2FDa7%2FVtYGCgZfWMjlfnXCLEeqt5xIKl%2FQ%3D%3D",
					"UTF-8")); /* 공공데이터포털에서 받은 인증키 */
			urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + page); /* 페이지번호 */
			urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
					+ URLEncoder.encode("10", "UTF-8")); /* 한 페이지 결과 수 */
			urlBuilder.append("&" + URLEncoder.encode("dataType", "UTF-8") + "="
					+ URLEncoder.encode("json", "UTF-8")); /* 요청자료형식(XML/JSON)Default: XML */
			urlBuilder.append("&" + URLEncoder.encode("ftype", "UTF-8") + "="
					+ URLEncoder.encode("ODAM", "UTF-8")); /* 파일구분-ODAM: 동네예보실황, -VSRT: 동네예보초단기, -SHRT: 동네예보단기 */
			urlBuilder.append("&" + URLEncoder.encode("basedatetime", "UTF-8") + "="
					+ URLEncoder.encode("", "UTF-8")); /* 각각의 base_time 로 검색 참고자료 참조 */
			System.out.println(urlBuilder.toString());

			URL url = new URL(urlBuilder.toString());
			Gson gson = new Gson();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println(page);
		return key;
	}
}
