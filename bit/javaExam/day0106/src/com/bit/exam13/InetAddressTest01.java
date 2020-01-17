package com.bit.exam13;

import java.net.InetAddress;

public class InetAddressTest01 {

	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println(addr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
