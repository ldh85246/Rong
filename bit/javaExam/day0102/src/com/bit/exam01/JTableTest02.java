package com.bit.exam01;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest02 extends JFrame {
	public JTableTest02() {
		Vector<String> colNames = new Vector<String>();
		Vector<Vector<String>> rowData = new Vector<Vector<String>>();
		
		colNames.add("이름");
		colNames.add("국어");
		colNames.add("영어");
		colNames.add("수학");
		
		Vector<String> s1 = new Vector<String>();
		s1.add("이순신");
		s1.add("100");
		s1.add("100");
		s1.add("100");
		
		Vector<String> s2 = new Vector<String>();
		s2.add("유관순");
		s2.add("100");
		s2.add("100");
		s2.add("100");
		
		Vector<String> s3 = new Vector<String>();
		s3.add("홍길동");
		s3.add("100");
		s3.add("100");
		s3.add("100");
		
		rowData.add(s1);
		rowData.add(s2);
		rowData.add(s3);
		
		JTable table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		add(jsp);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableTest02();
	}
}
