package com.example.demo.controller;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.NewsVo;
import com.google.gson.Gson;

@RestController
public class NaverController {
	
	@RequestMapping(value = "/news.do", produces = "application/json; charset=UTF-8")
	public String news() {
		// #main_content > div.list_body.newsflash_body > ul.type06_headline > li:nth-child(1) > dl > dt:nth-child(2) > a
		String str = "";
		ArrayList<NewsVo> newsList = new ArrayList<NewsVo>();
		try {
			for(int i = 1; i <= 22; i++) {
				Document doc = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LS2D&sid2=230&sid1=105&mid=shm&date=20200319&page=" + i).get();
				//Document doc = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LS2D&mid=shm&sid1=105&sid2=230").get();
				Elements list = doc.select("#main_content li a");	// >는 직계자식만,  띄어쓰기는 후손 모두
				for(Element news : list) {
					String title = news.text();
					String url = news.attr("href");
					if(!title.equals("")) {
						NewsVo n = new NewsVo(title, url);
						if(!newsList.contains(n)) {
							newsList.add(n);
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		Gson gson = new Gson();
		str = gson.toJson(newsList);
		return str;
	}
	
	@RequestMapping("/rate.do")
	public String rate() {
		String str = "";
		String addr = "https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=환율";
		try {
			// #_cs_foreigninfo > div > div.contents03_sub > div > div.c_rate > div.rate_bx
			// > div.rate_spot._rate_spot > div.rate_tlt > h3 > a > span.spt_con.up > strong
			Document doc = Jsoup.connect(addr).get();
			str = doc.select("#_cs_foreigninfo > div > div.contents03_sub > div > div.c_rate > div.rate_bx > div.rate_spot._rate_spot > div.rate_tlt > h3 > a > span.spt_con.up > strong").html();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return str;
	}
	
	@RequestMapping("/gold.do")
	public String gold() {
		String str = "";
		try {
			Document doc = Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=금시세").get();
			str = doc.select("#cs_priceinfo_single_locationtab > div.tab_cont2.panels > div.present > p > strong").text();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return str;
	}
}
