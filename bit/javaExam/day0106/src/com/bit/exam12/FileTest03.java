package com.bit.exam12;

import java.io.File;

public class FileTest03 {

	public static void main(String[] args) {
		File file = new File("c:/javaExam");
		String[] arr = file.list();
		for (String f : arr) {
			System.out.println(f);
		}
	}
}
