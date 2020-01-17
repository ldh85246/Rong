package com.bit.exam07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class LinePanel extends JPanel implements MouseListener {
	int x1, y1, x2, y2;
	int drawType;
	Color colorType;
	ArrayList<GraphicInfo> list;

	public LinePanel() {
		colorType = Color.black;
		list = new ArrayList<GraphicInfo>();
		addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		for (GraphicInfo info : list) {
			
			g.setColor(info.getColorType());
			
			int x = info.getX1();
			int y = info.getY1();
			int width = info.getX2() - info.getX1();
			int height = info.getY2() - info.getY1();
			if (info.getX1() > info.getX2()) {
				x = info.getX2();
				width = info.getX1() - info.getX2();
			}

			if (info.getY1() > info.getY2()) {
				y = info.getY2();
				height = info.getY1() - info.getY2();
			}

			switch (info.getDrawType()) {
			case 0:
				g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());
				break;
			case 1:
				g.drawRect(x, y, width, height);
				break;
			case 2:
				g.drawOval(x, y, width, height);
				break;
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();

		list.add(new GraphicInfo(x1, y1, x2, y2, drawType, colorType));

		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}
