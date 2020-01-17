package com.bit.exam02;

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

import com.bit.exam01.CustomerDAO;
import com.bit.exam01.CustomerVO;

public class InsertBook extends JFrame {
	JTextField jtf_bookid;
	JTextField jtf_bookname;
	JTextField jtf_publisher;
	JTextField jtf_price;

	public InsertBook() {
		jtf_bookid = new JTextField(10);
		jtf_bookname = new JTextField(10);
		jtf_publisher = new JTextField(10);
		jtf_price = new JTextField(10);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 2));
		p.add(new JLabel("도서 ID"));
		p.add(jtf_bookid);
		p.add(new JLabel("도서명"));
		p.add(jtf_bookname);
		p.add(new JLabel("출판사"));
		p.add(jtf_publisher);
		p.add(new JLabel("가격"));
		p.add(jtf_price);

		JButton btnAdd = new JButton("등록");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bookid = Integer.parseInt(jtf_bookid.getText());
				String bookname = jtf_bookname.getText();
				String publisher = jtf_publisher.getText();
				String price = jtf_price.getText();

				BookVO bv = new BookVO(bookid, bookname, publisher, price);

				BookDAO dao = new BookDAO();
				int r = dao.insertBook(bv);
				if (r > 0) {
					JOptionPane.showMessageDialog(null, "도서를 등록하였습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "도서 등록에 실패하였습니다.");
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
		new InsertBook();
	}
}
