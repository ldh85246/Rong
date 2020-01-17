package com.bit.exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad extends JFrame implements ActionListener {
	JTextArea jta;

	public Notepad() {
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		add(jsp, BorderLayout.CENTER);

		JMenuBar jmb = new JMenuBar();
		JMenu menu_file = new JMenu("파일");
		JMenuItem item_new = new JMenuItem("새파일");
		JMenuItem item_open = new JMenuItem("열기");
		JMenuItem item_save = new JMenuItem("저장");

		menu_file.add(item_new);
		menu_file.add(item_open);
		menu_file.add(item_save);

		jmb.add(menu_file);

		setJMenuBar(jmb);

		item_new.addActionListener(this);
		item_open.addActionListener(this);
		item_save.addActionListener(this);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		if (cmd.equals("새파일")) {
			jta.setText("");
		} else if (cmd.equals("열기")) {
			try {
				FileReader fr = new FileReader("c:/javaExam/day1231/save.txt");
				String str = "";
				int ch;

				while ((ch = fr.read()) != -1) {
					str = str + (char) ch;
				}
				fr.close();
				jta.setText(str);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		} else if (cmd.equals("저장")) {
			String str = jta.getText();

			try {
				FileWriter fw = new FileWriter("c:/javaExam/day1231/save.txt");
				fw.write(str);
				fw.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		new Notepad();
	}
}
