package com.bit.exam04;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaTest extends JFrame {

	public JTextAreaTest() {
		JTextArea jta = new JTextArea(10, 60);
		JScrollPane jsp = new JScrollPane(jta);
		setLayout(new FlowLayout());
		add(jsp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
