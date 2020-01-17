package com.bit.exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 사용자로부터 두 수를 입력받아 더하기 한 결과를 출력하는 프로그램
public class AddTest extends JFrame implements ActionListener {
	JTextField jtf_num1;
	JTextField jtf_num2;
	JTextField jtf_result;
	
	public AddTest() {
		setLayout(new FlowLayout());
		jtf_num1 = new JTextField(5);
		jtf_num2 = new JTextField(5);
		jtf_result = new JTextField(5);
		
		add(new JLabel("수 1 : "));
		add(jtf_num1);
		
		add(new JLabel("수 2 : "));
		add(jtf_num2);
		
		JButton btnAdd = new JButton("더하기");
		add(btnAdd);
		
//		MyEvent me = new MyEvent();
		btnAdd.addActionListener(this);
		
		add(new JLabel("결과 : "));
		add(jtf_result);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new AddTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(jtf_num1.getText());
		int b = Integer.parseInt(jtf_num2.getText());
		int r = a + b;
		jtf_result.setText(r + "");
	}
}
