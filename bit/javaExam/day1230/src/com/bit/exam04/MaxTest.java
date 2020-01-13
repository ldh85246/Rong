package com.bit.exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 사용자로부터 두 수를 입력받아 그 중에 큰 수를 구하여 출력하는 프로그램을 GUI로 작성
public class MaxTest extends JFrame implements ActionListener {
	JTextField jtf_num1;
	JTextField jtf_num2;
	JTextField jtf_result;
	
	public MaxTest() {
		setLayout(new FlowLayout());
		jtf_num1 = new JTextField(5);
		jtf_num2 = new JTextField(5);
		jtf_result = new JTextField(5);
		
		setTitle("큰 수 찾기 프로그램");
		
		add(new JLabel("수 1 : "));
		add(jtf_num1);
		
		add(new JLabel("수 2 : "));
		add(jtf_num2);
		
		JButton btnAdd = new JButton("큰 수 찾기");
		add(btnAdd);

		btnAdd.addActionListener(this);
		
		add(new JLabel("결과 : "));
		add(jtf_result);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int n1 = Integer.parseInt(jtf_num1.getText());
		int n2 = Integer.parseInt(jtf_num2.getText());
		int max = 0;
		
		if(n1 > n2) {
			max = n1;
		} else {
			max = n2;
		}
		
		jtf_result.setText(max + "");
	}

	public static void main(String[] args) {
		new MaxTest();
	}
}
