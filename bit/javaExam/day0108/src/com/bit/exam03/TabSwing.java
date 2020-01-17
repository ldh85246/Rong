package com.bit.exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;	

public class TabSwing extends JPanel {
	String[] str = { "JCheckBox", "JButton", "JComboBox", "JLabel" };
	JRadioButton[] jrb = new JRadioButton[str.length];
	JTextField jtf;
	ButtonGroup bg;

	public TabSwing() {
		setLayout(new FlowLayout());
		bg = new ButtonGroup();
		for (int i = 0; i < str.length; i++) {
			jrb[i] = new JRadioButton(str[i]);
			jrb[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					jtf.setText(cmd);
				}
			});
			bg.add(jrb[i]);
			add(jrb[i]);
		}

		jtf = new JTextField(20);
		add(jtf);
	}
}
