package com.bit.exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9002);
			// TCP방식의 통신을 위해 서버소켓을 생선한다.
			// 다른 네트워크 프로그램과 구별하기 위하여 포트번호를 9002번으로 설정한다.

			System.out.println("서버가 연결되었습니다.");
			while (true) { // 클라이어트의 접속을 대기한다.
				Socket socket = server.accept();
				// 클라이언트 접속 시에 접속을 수락하기 위한
				// accept메소드가 호출되고 그 그 클라이언트와 데이터를 주고 받기 위한
				// 소켓이 생성된다.

				System.out.println("클라이언트가 접속하였습니다.");
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				// 연결된 클라이언트와 데이터를 주고 받기 위한 소켓을 통해 스트림을 생성한다.

				byte[] data = new byte[100];
				// 클라이언트로부터 수신된 데이터를 저장하기 휘한 배열을 만든다.
				// 접속한 클라이언트와 계속해서 데이터를 주고 받기 위해 반복문으로 표현한다.
				while (true) { // <- 이부분이 여러명의 클라이언트를 상대하려면 Thread를 표현해야 한다.
					is.read(data); // 클라이언트가 보내온 데이터를 받는다.
					os.write(data); // 받은 데이터를 그대로 내보낸다 ==> 메아리
					String msg = new String(data); // 받은 데이터를 문자열로 만든다.
					System.out.println("수신된 메시지 : " + msg);
					Arrays.fill(data, (byte) 0); // 다음 수신될 데이터를 위하여 배열을 초기화 시킨다.
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
