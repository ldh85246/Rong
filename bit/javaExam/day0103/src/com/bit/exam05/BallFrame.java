package com.bit.exam05;

import javax.swing.JFrame;

public class BallFrame extends JFrame {
	BallPanel bp;
	
	public BallFrame() {
		bp = new BallPanel();
		Thread t = new Thread(bp);
		t.start();
		add(bp);
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BallFrame();
	}
}
