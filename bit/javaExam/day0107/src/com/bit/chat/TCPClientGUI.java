package com.bit.chat;

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
	JTextArea jta;
	JTextField jtf;
	OutputStream os;
	InputStream is;

	public TCPClientGUI(String name, String host) {
		int port = 9002;

		try {
			Socket socket = new Socket(host, port);
			is = socket.getInputStream();

			os = socket.getOutputStream();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		jta = new JTextArea();
		jtf = new JTextField();

		class ClientThread extends Thread {
			public void run() {
				try {
					byte[] data = new byte[100];

					while (true) {
						is.read(data);
						String msg = new String(data);
						jta.append(msg + "\n");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		ClientThread ct = new ClientThread();
		ct.start();

		JButton btn = new JButton("Àü¼Û");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = name + "#" + jtf.getText();
				if (jtf.getText().equals("q!")) {
					System.exit(0);
				}
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
		p.add(btn, BorderLayout.EfAST);

		JScrollPane jsp = new JScrollPane(jta);
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
