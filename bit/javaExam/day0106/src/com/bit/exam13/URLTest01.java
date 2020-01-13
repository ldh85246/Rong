package com.bit.exam13;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class URLTest01 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.hanbit.co.kr/store/books/new_book_list.html");
//		System.out.println(url);
			InputStream is = url.openStream();
			byte[] data = new byte[100];

			String str = "";
			while (is.read(data) != -1) {
				str = str + new String(data, "utf-8");
				Arrays.fill(data, (byte) 0);
			}
			System.out.println(str);
			is.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
