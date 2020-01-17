package com.bit.exam04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame implements ActionListener {
	int op1;
	int op2;
	String op;

	JTextField display;
	String[] arr = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "C", "0", "=", "/" };
	JButton[] btn;

	public Calc() {
		// 계산결과를 나타낼 텍스트필드
		display = new JTextField(10);

		// 계산기 버튼 16개를 남기위한 패널을 생성
		// 백그라운드 색깔은 노랑
		JPanel p = new JPanel();
		p.setBackground(Color.yellow);

		// 전체 프레임의 레이아웃을 BorderLayout으로 설정하고
		// 화면의 위족에서 계산결과를 표시할 display를 놓고
		// 화면의 가운데에 계산기 버튼이 있는 패널을 생성

		setLayout(new BorderLayout());

		btn = new JButton[arr.length];
		p.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < arr.length; i++) {
			btn[i] = new JButton(arr[i]);
			p.add(btn[i]);
			btn[i].addActionListener(this);
		}

		add(display, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		System.out.println(cmd);

		if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
			op1 = Integer.parseInt(display.getText());
			op = cmd;
			display.setText("");
		} else if (cmd.equals("=")) {
			op2 = Integer.parseInt(display.getText());
			int r = 0;

			switch (op) {
			case "+":
				r = op1 + op2;
				break;
			case "-":
				r = op1 - op2;
				break;
			case "*":
				r = op1 * op2;
				break;
			case "/":
				r = op1 / op2;
				break;
			}
			display.setText(r + "");
		} else if (cmd.equals("C")) {
			op1 = 0;
			op2 = 0;
			display.setText("");
		} else {
			display.setText(display.getText() + cmd);
		}
	}

	public static void main(String[] args) {
		new Calc();
	}
}
