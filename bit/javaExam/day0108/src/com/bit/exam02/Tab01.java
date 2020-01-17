package com.bit.exam02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tab01 extends JPanel {
	public Tab01() {
		JButton btn = new JButton("확인");
		setLayout(new FlowLayout());
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "확인되었습니다.");
			}
		});
	}
}
