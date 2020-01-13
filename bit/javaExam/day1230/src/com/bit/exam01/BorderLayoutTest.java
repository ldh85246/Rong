package com.bit.exam01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		setLayout(new BorderLayout());
		
		add(new JButton("이수인"), BorderLayout.NORTH);
		add(new JButton("한주련"), BorderLayout.SOUTH);
		add(new JButton("이원우"), BorderLayout.EAST);
		add(new JButton("이희재"), BorderLayout.WEST);
		add(new JButton("최봉현"), BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();
	}

}
