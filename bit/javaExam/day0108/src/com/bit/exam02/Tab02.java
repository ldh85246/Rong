package com.bit.exam02;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Tab02 extends JPanel {
	public Tab02() {
		setLayout(new FlowLayout());
		add(new JCheckBox("사과"));
		add(new JCheckBox("포도"));
	}
}
