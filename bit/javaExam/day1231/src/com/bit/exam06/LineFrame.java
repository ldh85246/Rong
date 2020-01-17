package com.bit.exam06;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class LineFrame extends JFrame {
	LinePanel linePanel;
	JFileChooser jfc;

	public LineFrame() {
		jfc = new JFileChooser("c:/javaExam/day1231");
		linePanel = new LinePanel();
		add(linePanel, BorderLayout.CENTER);

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

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				linePanel.list.clear();
				linePanel.repaint();
			}
		});

		file_open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int re = jfc.showOpenDialog(null);
				if (re == 0) {
					try {
						File file = jfc.getSelectedFile();
						ObjectInputStream ois = new ObjectInputStream(
								new FileInputStream("c:/javaExam/day1231/my.pan"));
						linePanel.list = (ArrayList<GraphicInfo>) ois.readObject();
						linePanel.repaint();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		});

		file_save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int re = jfc.showSaveDialog(null);
				if (re == 0) {
					try {
						ObjectOutputStream oos = new ObjectOutputStream(
								new FileOutputStream("c:/javaExam/day1231/my.pan"));
						oos.writeObject(linePanel.list);
						oos.close();
					} catch (Exception ex) {
					}
				}
			}
		});

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new LineFrame();
	}

	public void actionPerformed(ActionEvent e) {

	}
}
