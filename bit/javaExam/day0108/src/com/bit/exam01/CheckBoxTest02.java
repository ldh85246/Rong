package com.bit.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxTest02 extends JFrame implements ActionListener {
	String[] fruits = { "사과", "포도", "딸기", "수박", "바나나" };
	JCheckBox[] jcb;
	JLabel result;

	public CheckBoxTest02() {
		jcb = new JCheckBox[fruits.length];
		// 체크박스 개수가 fruit배열의 개수만큼 증가

		result = new JLabel("아무것도 선택하지 않았습니다.");

		setLayout(new FlowLayout());

		// for문을 통해 fruits배열의 길이까지 체크박스 추가
		for (int i = 0; i < fruits.length; i++) {
			jcb[i] = new JCheckBox(fruits[i]);
			add(jcb[i]);
			jcb[i].addActionListener(this);
		}
		add(result);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CheckBoxTest02();
	}

	public void actionPerformed(ActionEvent e) {
		String str = "";

		// for문을 통해 jcb배열의 길이까지 if문으로 버튼 클릭시 str스트링에 ", " 추가
		for (int i = 0; i < jcb.length; i++) {
			if (jcb[i].isSelected()) {
				str = str + fruits[i] + ",";
			}
		}

		// str스트링에 선택시 문구 if문을 통해 추가
		if (str.equals("")) {
			str = "아무것도 선택하지 않았습니다.";
		} else {
			str = str.substring(0, str.length() - 1);
			str = str + "를 선택하였습니다.";
		}

		result.setText(str);
		// result라벨에 str문 입력
	}
}
