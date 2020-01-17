package com.bit.exam05;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BallPanel extends JPanel implements Runnable {
	int x = 10;
	int y = 250;
	int x1 = 10;
	int y1 = -10;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(x, y, 50, 50);
	}

	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			
			x = x + x1;
			y = y + y1;
			
			if (x <= 0 || x >= 500) {
				x1 = x1 * -1;
			}
			
			if (y <= 0 || x >= 250) {
				y1 = y1 * -1;
			}
			repaint();
		}
	}
}
