package com.bit.exam03;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseEventTest extends JFrame implements MouseListener {
	public MouseEventTest() {
		setSize(400, 300);
		setVisible(true);
		addMouseListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MouseEventTest();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Å¬¸¯");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("´©¸§");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("¶À");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("µé¾î°¨");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("³ª¿È");
	}
}
