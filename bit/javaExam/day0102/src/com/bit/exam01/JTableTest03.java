package com.bit.exam01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JTableTest03 extends JFrame {
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	JFileChooser jfc;

	Vector<Vector<String>> rowData;
	JTable table;
	int idx;

	public void saveStudent() {
		int re = jfc.showSaveDialog(null);
		if (re == 0) {
			try {
				File file = jfc.getSelectedFile();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(rowData);
				oos.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public JTableTest03() {
		Vector<String> colNames = new Vector<String>();
		jfc = new JFileChooser("c:/javaExam/day0102");
		colNames.add("이름");
		colNames.add("국어");
		colNames.add("영어");
		colNames.add("수학");
		colNames.add("총점");
		colNames.add("평균");
		colNames.add("합격여부");

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

		jtf_name = new JTextField(10);
		jtf_kor = new JTextField(10);
		jtf_eng = new JTextField(10);
		jtf_math = new JTextField(10);

		p_up.setLayout(new BorderLayout());

		JPanel p_input = new JPanel();
		JPanel p_btn = new JPanel();

		p_input.setLayout(new GridLayout(4, 2));

		p_input.add(new JLabel("이름 : "));
		p_input.add(jtf_name);

		p_input.add(new JLabel("국어 : "));
		p_input.add(jtf_kor);

		p_input.add(new JLabel("영어 : "));
		p_input.add(jtf_eng);

		p_input.add(new JLabel("수학 : "));
		p_input.add(jtf_math);

		JButton btnAdd = new JButton("추가");
		p_btn.add(btnAdd);

		JButton btnDel = new JButton("삭제");
		p_btn.add(btnDel);

		JButton btnEdit = new JButton("수정");
		p_btn.add(btnEdit);

		JButton btnSort = new JButton("정렬");
		p_btn.add(btnSort);

		JButton btnReset = new JButton("리셋");
		p_btn.add(btnReset);

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<String> v = new Vector<String>();
				String name = jtf_name.getText();
				String kor = jtf_kor.getText();
				String eng = jtf_eng.getText();
				String math = jtf_math.getText();

				v.add(name);
				v.add(kor);
				v.add(eng);
				v.add(math);

				int tot = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
				int avg = tot / 3;

				v.add(tot + "");
				v.add(avg + "");

				String pass = "";
				if (avg >= 80) {
					v.add(pass + "P");
				} else if (avg < 80) {
					v.add(pass + "N");
				}

				rowData.add(v);
				table.updateUI();
			}
		});

		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx = table.getSelectedRow();
				rowData.remove(idx);
				table.updateUI();
			}
		});

		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<String> v = new Vector<String>();
				String name = jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				int tot = kor + eng + math;
				int avg = tot / 3;
				String pass = "P";
				if (avg < 80) {
					pass = "N";
				}

				v.add(name);
				v.add(kor + "");
				v.add(eng + "");
				v.add(math + "");
				v.add(tot + "");
				v.add(avg + "");
				v.add(pass);

				rowData.set(idx, v);
				table.updateUI();
			}
		});

		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < rowData.size(); i++) {
					for (int j = i + 1; j < rowData.size(); j++) {
						if (Integer.parseInt(rowData.get(j).get(4)) > Integer.parseInt(rowData.get(i).get(4))) {
							Vector<String> tmp = rowData.get(i);
							rowData.set(i, rowData.get(j));
							rowData.set(j, tmp);
						}
					}
				}
				table.updateUI();
			}
		});

		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_name.setText("");
				jtf_kor.setText("");
				jtf_eng.setText("");
				jtf_math.setText("");
			}
		});

		p_up.add(p_input, BorderLayout.CENTER);
		p_up.add(p_btn, BorderLayout.SOUTH);

		add(p_up, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		JMenuBar jmb = new JMenuBar();
		JMenu mn_file = new JMenu("파일");
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");

		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);

		jmb.add(mn_file);

		setJMenuBar(jmb);

		file_new.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_name.setText("");
	            jtf_kor.setText("");
	            jtf_eng.setText("");
	            jtf_math.setText("");
	            rowData.removeAllElements();
	            table.updateUI();
			}
		});

		file_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rowData.size() > 0) {
					int re = JOptionPane.showConfirmDialog(null, "저장하시겠어요?");
					if(re == JOptionPane.YES_OPTION) {
					// if(re == 0) { 로도 가능
						saveStudent();
					}
				}
				
				rowData.clear();
				
				int re = jfc.showOpenDialog(null);
				if (re == 0) {
					try {
						File file = jfc.getSelectedFile();
						ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
						Vector<Vector<String>> list = (Vector<Vector<String>>) ois.readObject();
						for (Vector<String> v : list) {
							rowData.add(v);
						}
						
						// rowData = (Vector<Vector<String>>) ois.readObject();
						
						table.updateUI();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		});

		file_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int re = jfc.showSaveDialog(null);
				if(re == 0) {
					try {
						File file = jfc.getSelectedFile();
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
						oos.writeObject(rowData);
						oos.close();
					}catch(Exception e2) {
						System.out.println(e2.getMessage());
					}
				}
			}
		});

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JTableTest03();
	}
}
