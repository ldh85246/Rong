package com.bit.exam12;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileTest04 extends JFrame {
	Vector<String> data;
	JList<String> list;
	JTextArea jta;

	public FileTest04() {
		data = new Vector<String>();
		list = new JList<String>(data);
		jta = new JTextArea();

		list.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
				String path = "c:/javastudy/1210";
				String fname = list.getSelectedValue();
				System.out.println(fname);
				try {
					FileReader fr = new FileReader(path + "/" + fname);
					String str = "";
					int ch;
					while ((ch = fr.read()) != -1) {
						str = str + (char) ch;
					}
					jta.setText(str);
					fr.close();
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		loadFileList();

		JScrollPane jsp_list = new JScrollPane(list);
		JScrollPane jsp_jta = new JScrollPane(jta);
		add(jsp_list, BorderLayout.WEST);
		add(jsp_jta, BorderLayout.CENTER);

		setTitle("day1210");
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void loadFileList() {
		String dir = "c:/javastudy/1210";
		File file = new File(dir);
		String[] arr = file.list();
		for (String fname : arr) {
			if (fname.endsWith(".java")) {
				data.add(fname);
			}
		}
		list.updateUI();
	}

	public static void main(String[] args) {
		new FileTest04();
	}
}
