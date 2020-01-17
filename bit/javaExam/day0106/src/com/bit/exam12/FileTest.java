package com.bit.exam12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FileTest extends JFrame {
	public FileTest() {
		setLayout(new FlowLayout());
		JButton button = new JButton("파일 삭제");
		add(button);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				File file = new File("C:/javaExam/day0106");
				file.delete();
				JOptionPane.showMessageDialog(null, "파일을 삭제하였습니다.");

			}
		});
	}

	public static void main(String[] args) {
		new FileTest();
	}
}
