package com.bit.exam01;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest extends JFrame {
	JButton btn;
	ImageIcon icon01;
	ImageIcon icon02;

	public JButtonTest() {
		icon01 = new ImageIcon("btn01.png");
		icon02 = new ImageIcon("btn02.png");
		btn = new JButton(icon01);
		btn.setRolloverIcon(icon02);

		setLayout(new FlowLayout());
		add(btn);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JButtonTest();
	}
}
