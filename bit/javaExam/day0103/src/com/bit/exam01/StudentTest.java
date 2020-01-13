package com.bit.exam01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StudentTest extends JFrame {
	int idx;
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;

	JTable table;
	Vector<Vector<String>> rowData;

	public void listStudent() {
		rowData.clear();

		String sql = "select * from student";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit", "bit");
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

			table.updateUI();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public StudentTest() {
		jtf_name = new JTextField();
		jtf_kor = new JTextField();
		jtf_eng = new JTextField();
		jtf_math = new JTextField();

		Vector<String> colNames = new Vector<String>();
		colNames.add("이름");
		colNames.add("국어");
		colNames.add("영어");
		colNames.add("수학");

		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);

		table.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				idx = table.getSelectedRow();
				Vector<String> v = rowData.get(idx);
				jtf_name.setText(v.get(0));
				jtf_kor.setText(v.get(1));
				jtf_eng.setText(v.get(2));
				jtf_math.setText(v.get(3));
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}
		});

		JPanel p_up = new JPanel();
		JPanel p_btn = new JPanel();
		p_up.setLayout(new GridLayout(4, 2));

		p_up.add(new JLabel("이름"));
		p_up.add(jtf_name);
		p_up.add(new JLabel("국어"));
		p_up.add(jtf_kor);
		p_up.add(new JLabel("영어"));
		p_up.add(jtf_eng);
		p_up.add(new JLabel("수학"));
		p_up.add(jtf_math);

		JButton btn_Add = new JButton("추가");
		p_btn.add(btn_Add);

		JButton btn_list = new JButton("학생목록");
		p_btn.add(btn_list);

		JButton btn_update = new JButton("수정");
		p_btn.add(btn_update);

		JButton btn_delete = new JButton("삭제");
		p_btn.add(btn_delete);

		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				String sql = "delete student where name = '" + name + "'";
				Connection conn = null;
				Statement stmt = null;

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit", "bit");
					stmt = conn.createStatement();
					int re = stmt.executeUpdate(sql); // db 자체에 변동이 있는 명령어를 실행할 때 execute를 사용한다.

					if (re > 0) {
						JOptionPane.showMessageDialog(null, "학생의 정보를 삭제하였습니다.");
					}

					listStudent();
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				} finally {
					try {
						if (stmt != null) {
							stmt.close();
						}
					} catch (Exception ex2) {
						System.out.println(ex2.getMessage());
					}

					if (conn != null) {
						try {
							conn.close();
						} catch (Exception ex2) {
							System.out.println(ex2.getMessage());
						}
					}
				}

				listStudent();
			}
		});

		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());

				try {
					String sql = "update student set kor = " + kor + ", eng = " + eng + ", math = " + math
							+ "where name = '" + name + "'";

					// 1. jdbc 드라이버를 메모리로 로드한다.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. db Server로 연결한다.
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit",
							"bit");

					// 3. 데이터베이스 명령어 실행을 위한 Statement 객체를 생성한다.
					Statement stmt = conn.createStatement();

					// 4. 데이터베이스 명령을 실행한다.
					// executeUpdate insert, update, delete
					// executeQuery select
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "학생의 정보를 수정하였습니다.");
					stmt.close();
					conn.close();

					listStudent();
				} catch (Exception ex) {

				}
			}
		});

		btn_list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listStudent();
			}
		});

		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				String sql = "insert into student values('" + name + "', " + kor + ", " + eng + ", " + math + ")";
				System.out.println(sql);

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit",
							"bit");
					Statement stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "학생의 정보를 등록하였습니다.");
					stmt.close();
					conn.close();
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}

				listStudent();
			}
		});

		JPanel p_input = new JPanel();
		p_input.setLayout(new BorderLayout());

		p_input.add(p_up, BorderLayout.CENTER);
		p_input.add(p_btn, BorderLayout.SOUTH);

		add(p_input, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new StudentTest();
	}
}
