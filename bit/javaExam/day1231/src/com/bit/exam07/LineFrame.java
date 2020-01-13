package com.bit.exam07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class LineFrame extends JFrame {
	LinePanel linePanel;
	JFileChooser jfc;
	JColorChooser jcc;

	public LineFrame() {
		jcc = new JColorChooser(Color.black);
		jfc = new JFileChooser("c:/javaExam/day1231");
		linePanel = new LinePanel();
		add(linePanel, BorderLayout.CENTER);

		JMenuBar jmb = new JMenuBar();
		JMenu mn_file = new JMenu("파일");
		JMenu mn_draw = new JMenu("그리기도구");
		JMenu mn_color = new JMenu("색");
		
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");

		JMenuItem draw_line = new JMenuItem("선");
		JMenuItem draw_rect = new JMenuItem("사각형");
		JMenuItem draw_oval = new JMenuItem("원");
		
		JMenuItem color_black = new JMenuItem("검정");
		JMenuItem color_red = new JMenuItem("빨강");
		JMenuItem color_blue = new JMenuItem("파랑");
		JMenuItem color_other = new JMenuItem("다른색");
		
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);

		mn_draw.add(draw_line);
		mn_draw.add(draw_rect);
		mn_draw.add(draw_oval);
		
		mn_color.add(color_black);
		mn_color.add(color_red);
		mn_color.add(color_blue);
		mn_color.add(color_other);
		
		color_black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linePanel.colorType = Color.black;
			}
		});
		
		color_red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linePanel.colorType = Color.red;
			}
		});
		
		color_blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linePanel.colorType = Color.blue;
			}
		});

		color_other.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linePanel.colorType = jcc.showDialog(null, "색상 선택", Color.black);
			}
		});
		
		draw_line.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linePanel.drawType = 0;
			}
		});
		
		draw_rect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linePanel.drawType = 1;
			}
		});
		
		draw_oval.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linePanel.drawType = 2;
			}
		});
		
		jmb.add(mn_file);
		jmb.add(mn_draw);
		jmb.add(mn_color);

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
}
