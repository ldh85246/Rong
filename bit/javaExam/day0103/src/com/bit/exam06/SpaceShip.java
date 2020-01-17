package com.bit.exam06;

import java.awt.event.KeyEvent;

public class SpaceShip extends GraphicObject {
	public SpaceShip(String name) {
		super(name);
		x = 150;
		y = 350;
	}

	public void keyPressed(KeyEvent event) {
		switch (event.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			x -= 10;
			break;
		case KeyEvent.VK_RIGHT:
			x += 10;
			break;
		case KeyEvent.VK_UP:
			y -= 10;
			break;
		case KeyEvent.VK_DOWN:
			x += 10;
			break;
		}
	}
}
