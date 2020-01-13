package com.bit.exam04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberGuess extends JFrame implements ActionListener {
	int com;
	JTextField jtf_user;
	JTextField jlb_msg;
	JLabel jlb_cnt;
	JButton btn;
	int cnt = 0;

	public NumberGuess() {
		jtf_user = new JTextField(5);
		jlb_msg = new JTextField("");
		jlb_cnt = new JLabel("");

		Random rd = new Random();
		com = rd.nextInt(100) + 1;

		setLayout(new FlowLayout());

		setTitle("숫자 알아맞추기");

		add(new JLabel("알아맞춰 보세요"));
		add(jtf_user);

		btn = new JButton("맞추기");
		add(btn);
		
		JButton btn_newGame = new JButton("새 게임");
		add(btn_newGame);
		btn_newGame.addActionListener(this);

		btn.addActionListener(this);

		JButton btn_finish = new JButton("종료");
		add(btn_finish);
		btn_finish.addActionListener(this);

		add(jlb_msg);
		add(jlb_cnt);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("맞추기")) {
			int user = Integer.parseInt(jtf_user.getText());

			if (com == user) {
				jlb_msg.setText("정답입니다.");
				jlb_msg.setBackground(Color.blue);
			} else if (com > user) {
				jlb_msg.setText("더 큰 수를 시도해주세요.");
				jlb_msg.setBackground(Color.red);
			} else {
				jlb_msg.setText("더 작은 수를 시도해주세요.");
				jlb_msg.setBackground(Color.red);
			}
			cnt++;

			if (cnt >= 10) {
				btn.setEnabled(false);
			}
			jlb_cnt.setText(cnt + "번 시도 했습니다.");
		} else if (cmd.equals("종료")) {
			System.exit(0);
		} else if (cmd.equals("새 게임")) {
			btn.setEnabled(true);
			cnt = 0;
			Random rd = new Random();
			com = rd.nextInt(100) + 1;
			jlb_cnt.setText("");
			jlb_msg.setText("");
			jtf_user.setText("");
		}
	}

	public static void main(String[] args) {
		new NumberGuess();
	}
}
