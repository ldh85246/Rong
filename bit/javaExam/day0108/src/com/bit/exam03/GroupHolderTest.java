package com.bit.exam03;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class GroupHolderTest extends JFrame {
	public GroupHolderTest() {
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("Text", new TabText());
		tab.addTab("Swing", new TabSwing());
		tab.addTab("Layout", new TabLayout());
		tab.addTab("Java", new TabJava());

		add(tab);

		setTitle("GroupHolder Test");
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GroupHolderTest();
	}
}
