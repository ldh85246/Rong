package com.bit.exam13;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class URLTest02 extends JFrame {
	JTextField jtf;
	JTextArea jta;
	JFileChooser jfc;

	public URLTest02() {
		jtf = new JTextField(80);
		jta = new JTextArea(20, 80);
		jfc = new JFileChooser("c:/javaExam");

		JPanel p_up = new JPanel();
		p_up.setLayout(new BorderLayout());
		JButton btn_open = new JButton("열기");
		JButton btn_save = new JButton("저장");

		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int re = jfc.showSaveDialog(null);
				if (re == 0) {
					String str = jta.getText();
					try {
						FileOutputStream fos = new FileOutputStream(jfc.getSelectedFile());
						fos.write(str.getBytes());
						fos.close();
						JOptionPane.showMessageDialog(null, "파일로 저장하였습니다.");
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		});

		btn_open.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String addr = jtf.getText();
				try {
					URL url = new URL(addr);
					InputStream is = url.openStream();
					byte[] data = new byte[100];
					String str = "";
					while (is.read(data) != -1) {
						str = str + new String(data, "utf-8");
						Arrays.fill(data, (byte) 0);
					}
					is.close();
					jta.setText(str);
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		});

		p_up.add(jtf, BorderLayout.CENTER);

		JPanel p_btn = new JPanel();

		p_btn.add(btn_open);
		p_btn.add(btn_save);

		p_up.add(p_btn, BorderLayout.EAST);

		JScrollPane jsp = new JScrollPane(jta);
		add(p_up, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new URLTest02();

//		try {
//			URL url = new URL("http://www.hanbit.co.kr/store/books/new_book_list.html");
////		System.out.println(url);
//			InputStream is = url.openStream();
//			byte[] data = new byte[100];
//
//			String str = "";
//			while (is.read(data) != -1) {
//				str = str + new String(data, "utf-8");
//				Arrays.fill(data, (byte) 0);
//			}
//			System.out.println(str);
//			is.close();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}
}
