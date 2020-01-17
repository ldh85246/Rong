/* 사용자로부터 임의의 수 n을 입력받아 1부터 n까지의 합을
 * 누적하여 출력하는 프로그램을 GUI로 작성합니다.
 * 화면 구성 및 클래스 이름 등은 자유롭게 합니다.
 */

package com.bit.exam04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SumTest extends JFrame implements ActionListener{
	JTextField jtf_num;
	JTextField jtf_result;
	
	public SumTest() {
		setLayout(new FlowLayout());
		jtf_num = new JTextField(5);
		jtf_result = new JTextField(5);
		
		add(new JLabel("어디까지 더할까요?"));
		add(jtf_num);

		JButton btn = new JButton("n까지의 합");
		add(btn);
		
		btn.addActionListener(this);
		
		add(new JLabel("결과 : "));
		add(jtf_result);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SumTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int n = Integer.parseInt(jtf_num.getText());
		int tot = 0;
		for (int i = 1; i <= n ; i++) {
			tot += i;
		}
		jtf_result.setText(tot + "");
	}
}
