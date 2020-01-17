package com.bit.chat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class TCPChatServer {

	// 접속한 모든 클라이언트와 일대일 통신을 위한 모든 쓰레드들을
	// 담기 위한 리스트를 만든다.
	public static ArrayList<TCPServerThread> list;

	public static void main(String[] args) {
		list = new ArrayList<TCPServerThread>();

		try {
			ServerSocket server = new ServerSocket(9002);
			System.out.println("서버가 연결되었습니다.");

			while (true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 접속하였습니다.");
				TCPServerThread tst = new TCPServerThread(socket);
				tst.start();
				list.add(tst);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
