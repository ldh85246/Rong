package com.bit.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JLabelTest extends JFrame {
	ButtonGroup bg;
	String[] fruits = { "사과", "바나나", "포도", "복숭아", "감" };
	String[] fname = { "apple.png", "banana.jpg", "grape.png", "peach.png", "persimmon.jpeg" };
	JRadioButton[] jrb = new JRadioButton[5];
	ImageIcon[] icon = new ImageIcon[5];
	JLabel jlb;

	public JLabelTest() {
		bg = new ButtonGroup();
		setLayout(new FlowLayout());
		for (int i = 0; i < fruits.length; i++) {
			jrb[i] = new JRadioButton(fruits[i]);
			add(jrb[i]);
			bg.add(jrb[i]);
			icon[i] = new ImageIcon(fname[i]);
			jrb[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					switch (cmd) {
					case "사과":
						jlb.setIcon(icon[0]);
						break;
					case "바나나":
						jlb.setIcon(icon[1]);
						break;
					case "포도":
						jlb.setIcon(icon[2]);
						break;
					case "복숭아":
						jlb.setIcon(icon[3]);
						break;
					case "감":
						jlb.setIcon(icon[4]);
						break;
					}
				}
			});
		}
		jlb = new JLabel(icon[0]);
		add(jlb);

		JPanel p1 = new JPanel();
		jrb = new JRadioButton[fruits.length];

		for (int i = 0; i < jrb.length; i++) {
			jrb[i] = new JRadioButton(fruits[i]);
			bg.add(jrb[i]);
			p1.add(jrb[i]);
		}

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JLabelTest();
	}
}
