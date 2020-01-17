package com.bit.exam01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InsertCustomer extends JFrame {
	JTextField jtf_custid;
	JTextField jtf_name;
	JTextField jtf_address;
	JTextField jtf_phone;

	public InsertCustomer() {
		jtf_custid = new JTextField(10);
		jtf_name = new JTextField(10);
		jtf_address = new JTextField(10);
		jtf_phone = new JTextField(10);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 2));
		p.add(new JLabel("ID"));
		p.add(jtf_custid);
		p.add(new JLabel("성함"));
		p.add(jtf_name);
		p.add(new JLabel("주소"));
		p.add(jtf_address);
		p.add(new JLabel("전화"));
		p.add(jtf_phone);

		JButton btnAdd = new JButton("등록");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. 사용자의 입력값들을 CustomerVO에 담는다.
				// 2. CustomerDAO의 insertCustomer메소드를 출력한다.
				// 3. insert 성공여부에 따라 적합한 메세지를 출력한다.

//				CustomerVO cv = new CustomerVO();
				int custid = Integer.parseInt(jtf_custid.getText());
				String name = jtf_name.getText();
				String addr = jtf_address.getText();
				String phone = jtf_phone.getText();

				CustomerVO cv = new CustomerVO(custid, name, addr, phone);

//				cv.setCustid(custid);
//				cv.setName(name);
//				cv.setAddress(addr);
//				cv.setPhone(phone);

				CustomerDAO dao = new CustomerDAO();
				int re = dao.insertCustomer(cv);
				if (re > 0) {
					JOptionPane.showMessageDialog(null, "고객을 등록하였습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "고객 등록에 실패하였습니다.");
				}
			}
		});

		add(p, BorderLayout.CENTER);
		add(btnAdd, BorderLayout.SOUTH);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new InsertCustomer();
	}
}
