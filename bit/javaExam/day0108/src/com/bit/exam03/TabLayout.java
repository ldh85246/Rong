package com.bit.exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TabLayout extends JPanel {
	JComboBox<String> jcb;
	Vector<String> data;
	JTextField jtf;

	public TabLayout() {
		setLayout(new FlowLayout());
		data = new Vector<String>();
		data.add("FlowLayout");
		data.add("GridLayout");
		data.add("BorderLayout");
		data.add("CardLayout");

		jcb = new JComboBox<String>(data);
		add(jcb);
		jtf = new JTextField(20);
		add(jtf);

		jcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = (String) jcb.getSelectedItem();
				jtf.setText(item);
			}
		});
	}
}
