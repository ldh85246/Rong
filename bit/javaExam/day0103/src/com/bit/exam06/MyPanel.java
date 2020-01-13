package com.bit.exam06;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
	Enemy enemy;
	Missile missile;
	SpaceShip spaceship;

	public MyPanel() {
		addKeyListener(this);
		requestFocus();
		setFocusable(true);

		enemy = new Enemy("enemy.png");
		missile = new Missile("misile.png");
		spaceship = new SpaceShip("player.png");

		class MyThread extends Thread {
			public void run() {
				while (true) {
					enemy.update();
					missile.update();
					spaceship.update();
					repaint();

					try {
						Thread.sleep(50);
					} catch (Exception e) {
					} // end catch
				} // end while
			} // end run
		} // end MyThread

		Thread t = new MyThread();
		t.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		enemy.draw(g);
		missile.draw(g);
		spaceship.draw(g);
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		spaceship.keyPressed(e);
		missile.keyPressed(e, spaceship.x, spaceship.y);
	}

	public void keyReleased(KeyEvent e) {

	}
}
