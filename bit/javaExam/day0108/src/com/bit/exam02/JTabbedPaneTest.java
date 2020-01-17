package com.bit.exam02;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame {
	Tab01 tab01;
	Tab02 tab02;

	public JTabbedPaneTest() {
		tab01 = new Tab01();
		tab02 = new Tab02();
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("설정1", tab01);
		tab.addTab("설정2", tab02);

		add(tab);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JTabbedPaneTest();
	}
}
