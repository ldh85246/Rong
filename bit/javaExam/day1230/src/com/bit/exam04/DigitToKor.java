package com.bit.exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DigitToKor extends JFrame implements ActionListener {
	JTextField jtf_num;
	JTextField jtf_result;
	
	public DigitToKor() {
		jtf_num = new JTextField(5);
		jtf_result = new JTextField(5);
		
		setLayout(new FlowLayout());
		add(new JLabel("수를 입력하세요"));
		add(jtf_num);
		
		JButton btn = new JButton("한글 변환");
		add(btn);
		
		btn.addActionListener(this);
		
		add(new JLabel("결과"));
		add(jtf_result);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int n = Integer.parseInt(jtf_num.getText());
		
		String[] str = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String kor = str[n];
		jtf_result.setText(kor);
	}

	public static void main(String[] args) {
		new DigitToKor();
	}
}
