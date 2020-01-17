package com.bit.exam01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener {
	
	Button b1;
	Button b2;
	
	public MyFrame(String title) {
		super(title);
		
		b1 = new Button("남자");
		b2 = new Button("여자");
		
		setLayout(new FlowLayout());
		
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 
		String cmd = e.getActionCommand();
		if (cmd.equals("남자")) {
			System.out.println("넌 남자야");
		}
		else {
			System.out.println("넌 여자야");
		}
	}
}
