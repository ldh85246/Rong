package com.bit.exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentListTest extends JFrame {
	JTable table;
	Vector<Vector<String>> rowData;

	public StudentListTest() {
		Vector<String> colNames = new Vector<String>();
		colNames.add("이름");
		colNames.add("국어");
		colNames.add("영어");
		colNames.add("수학");

		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		add(jsp, BorderLayout.CENTER);
		JButton btnList = new JButton("학생목록");
		add(btnList, BorderLayout.SOUTH);

		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "select * from student";

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit",
							"bit");
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);

					while (rs.next()) {
						Vector<String> v = new Vector<String>();
						v.add(rs.getString(1));
						v.add(rs.getInt(2) + "");
						v.add(rs.getInt(3) + "");
						v.add(rs.getInt(4) + "");
						rowData.add(v);
					}
					rs.close();
					stmt.close();
					conn.close();

					table.updateUI();

				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		});

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new StudentListTest();
	}
}
