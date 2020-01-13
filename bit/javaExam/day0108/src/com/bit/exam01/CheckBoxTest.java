package com.bit.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxTest extends JFrame implements ActionListener {
	JCheckBox jcb01;
	JCheckBox jcb02;
	JLabel result;

	public CheckBoxTest() {
		jcb01 = new JCheckBox("사과");
		jcb02 = new JCheckBox("포도");
		result = new JLabel();

		setLayout(new FlowLayout());
		add(jcb01);
		add(jcb02);
		add(result);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jcb01.addActionListener(this);
		jcb02.addActionListener(this);

//		jcb01.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (jcb01.isSelected()) {
//					System.out.println("사과를 선택하였습니다.");
//				}else {
//					System.out.println("사과를 선택해제하였습니다.");
//				}
//			}
//		});
	}

	public static void main(String[] args) {
		new CheckBoxTest();
	}

	public void actionPerformed(ActionEvent e) {
		String str = "아무것도 선택하지 않았습니다.";

		if (jcb01.isSelected() && jcb02.isSelected()) {
			str = "사과, 포도 모두 선택하였습니다.";
			// 이 if문이 밑으로 갈 시 상위 구문에서 걸리기 때문에 이 if문을 최상위 구문으로 해야 한다.

		} else if (jcb01.isSelected()) {
			str = "사과를 선택하였습니다.";
		} else if (jcb02.isSelected()) {
			str = "포도를 선택하였습니다.";
		}

		result.setText(str);
	}
}
