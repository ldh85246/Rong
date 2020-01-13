package com.bit.chat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class TCPServerThread extends Thread {
	Socket socket;
	OutputStream os;
	InputStream is;

	// 나한테 수신된 메시지를 서버에 연결된 모든 클라이언트들에게 송출한다.
	public void broadCast(byte[] data) {
		for (TCPServerThread tst : TCPChatServer.list) {
			tst.send(data);
		}
	}

	// 나와 연결된 클라이언트 한명에게 데이터를 발송하기 위한 메소드
	public void send(byte[] data) {
		try {
			os.write(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public TCPServerThread(Socket socket) {
		try {
			this.socket = socket;
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void run() {
		try {
			byte[] data = new byte[100];
			while (true) {
				is.read(data);
				broadCast(data);
				// os.write(data);
				String msg = new String(data);
				System.out.println("수신된 메시지 : " + msg);
				Arrays.fill(data, (byte) 0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
