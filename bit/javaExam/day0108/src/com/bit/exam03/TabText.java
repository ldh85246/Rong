package com.bit.exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TabText extends JPanel {
	JTextField jtf;
	JTextArea jta;

	public TabText() {
		setLayout(new FlowLayout());
		jtf = new JTextField(20);
		jta = new JTextArea(5, 20);
		JScrollPane jsp = new JScrollPane(jta);

		jtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jta.append(jtf.getText() + "\n");
				jtf.setText("");
			}
		});

		add(jtf);
		add(jsp);
	}
}
