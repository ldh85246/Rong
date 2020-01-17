package com.bit.exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HanTest extends JFrame implements ActionListener {
	JTextField jtf_num;
	JTextField jtf_conversion;
	
	public HanTest() {
		setLayout(new FlowLayout());
		jtf_num = new JTextField(2);
		jtf_conversion = new JTextField(10);
		
		setTitle("한글표기식 출력 프로그램");
		
		add(new JLabel("0~9 사이의 정수 : "));
		add(jtf_num);
		
		JButton btn = new JButton("한글로 변환!");
		add(btn);
		
		add(new JLabel("해당 숫자를 한글로 변환시 : "));
		add(jtf_conversion);
		
		btn.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int n = Integer.parseInt(jtf_num.getText());
			
			if(n >= 0 && n < 10) {
				String[] han = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
				jtf_conversion.setText(han[n]);
			} else {
				jtf_conversion.setText("0~9 사이 숫자만!");
			}
		} catch(Exception ex){
			jtf_conversion.setText("숫자만 입력가능!");
		}
	}

	public static void main(String[] args) {
		new HanTest();
	}
}
