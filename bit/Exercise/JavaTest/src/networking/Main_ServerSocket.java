package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main_ServerSocket {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		InputStream is = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			serverSocket = new ServerSocket(9000);	// 서버소켓 객체 생성
			System.out.println("클라이언트 맞을 준비 완료~");
			
			socket = serverSocket.accept();	// writeUTF
//			System.out.println("클라이언트 연결 완료!");
			System.out.println("클라이언트 연결~");
			System.out.println("socket : " + socket);
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			while(true) {
				String clientMessage = dis.readUTF();	// 클라이언트가 OutputStream으로 서버쪽으로 보낸 outMessage를 readUTF()로 받는다.
				System.out.println("clientMessage : " + clientMessage);
				
				dos.writeUTF("메시지 전송 완료~");
				dos.flush();
				
				if(clientMessage.equals("STOP")) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
