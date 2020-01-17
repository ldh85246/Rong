package com.bit.exam13;

import java.net.InetAddress;

public class InetAddressTest02 {

	public static void main(String[] args) {
		try {
			InetAddress[] addr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress ia : addr) {
				System.out.println(ia);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
