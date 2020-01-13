package com.bit.exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌러짐");
	}
}
