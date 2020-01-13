package com.bit.exam01;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListCustomer extends JFrame {
	Vector<Vector<String>> rowData;
	JTable table;

	public ListCustomer() {
		Vector<String> colNames = new Vector<String>();
		colNames.add("ID");
		colNames.add("이름");
		colNames.add("주소");
		colNames.add("전화");

		CustomerDAO dao = new CustomerDAO();
		rowData = dao.listCustomer();

		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ListCustomer();
	}
}
