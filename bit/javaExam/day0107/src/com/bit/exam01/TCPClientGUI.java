package com.bit.exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPClientGUI extends JFrame {
	JTextArea jta; // 대화내용을 누적하여 출력할 테스트 에어리어
	JTextField jtf; // 대화내용을 입력할 텍스트 필드
	OutputStream os; // 서버로 데이터를 내보내기 위햐한 스트림
	InputStream is; // 서버로부터 데이터를 수신하기 위한 스트림

	public TCPClientGUI() {
		String host = "192.168.0.55"; // 통신할 서버의 ip주소
		int port = 9002; // 통신을 위해 약속한 port번호

		try {
			Socket socket = new Socket(host, port);
			// 소켓 객체를 생성하여 서버에 접속한다.

			is = socket.getInputStream();
			// 접속한 소켓을 통해 데이터를 수신하기 위한 스트림을 생성한다.

			os = socket.getOutputStream();
			// 접속한 소켓을 통해 데이터를 내보내기 위한 스트림을 생성한다.

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		jta = new JTextArea();
		jtf = new JTextField();

		// 내가 메시지를 전송하는 것과 별개로
		// 서버가 보내오는 메시지를 계속하여 수신하기 위한
		// 쓰레드를 만든다.
		class ClientThread extends Thread {
			public void run() {
				try {
					byte[] data = new byte[100];
					// 서버로부터 수신된 데이터를 저장하기 위한 배열

					// 계속하여 데이터를 받기 위해 반복문으로 표현한다.
					while (true) {

						// 서버가 보내준 데이터를 받는다.
						is.read(data);

						// 수신된 데이터를 문자열로 만든다.
						String msg = new String(data);

						// 수시된 문자열을 텍스트 에어리어에 추가한다.
						jta.append(msg + "\n");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

		// 서버로부터 수신된 데이터를 계속하여 받기를 수행하는
		// 쓰레드 객체를 생성한다.
		ClientThread ct = new ClientThread();

		// 쓰레드를 가동한다.
		ct.start();

		JButton btn = new JButton("전송");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = jtf.getText();
				byte[] data = msg.getBytes();
				try {
					os.write(data);
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});

		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(jtf, BorderLayout.CENTER);
		p.add(btn, BorderLayout.EAST);

		JScrollPane jsp = new JScrollPane(jta);
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TCPClientGUI();
	}
}
