package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main_Socket {
	public static void main(String[] args) {
		
		Socket socket = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		InputStream is = null;
		DataInputStream dis = null;
		
		Scanner sc = null;
		
		try {
			
			// 소켓 객체 생성
			socket = new Socket("localhost", 9000);	// 127.0.0.1 : localhost라고도 함
//			System.out.println("서버 연결~");
//			System.out.println("socket : " + socket);
			
			System.out.println("서버 연결 완료~");
			
			os = socket.getOutputStream();	// 소켓으로부터 OutputStream을 받아온다.
			dos = new DataOutputStream(os);	// 받아온 OutputStream을 DataOutputStream으로 확장
			
			is = socket.getInputStream();	// 소켓으로부터 InputStream을 받아온다.
			dis = new DataInputStream(is);	// InputStream을 문자단위로 확장하기 위해 DataInputStream으로 확장
			
			sc = new Scanner(System.in);
			
			while(true) {	// true면 무한반복
				System.out.println("메시지 입력~");
				String outMessage = sc.nextLine();
				dos.writeUTF(outMessage);	// 서버쪽으로 outMessage을 보낸다.
				dos.flush();				// 데이터를 비우기 위해 사용
				
				String inMessage = dis.readUTF();	// 서버에서 보낸 clientMessage를 받는다.
				System.out.println("inMessage : " + inMessage);
				
				if (outMessage.equals("STOP")) break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
