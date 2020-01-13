package com.bit.exam03;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class LineFrame extends JFrame {
	public LineFrame() {
		add(new LinePanel(), BorderLayout.CENTER);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LineFrame();
	}
}
