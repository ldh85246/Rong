///*1~100 사이의 숫자 중에 컴퓨터가 생각하고 있는 숫자를 알아 맞추는 프로그램을 작성
// * 화면 구성이나 클래스명, 변수명 등은 자유롭게
// * 
// * 만약, 입력숫자가 맞다면 "맞았습니다"
// * 틀리다면 "더 큰 수를 시도하세요"와 "더 작은 수를 시도하세요"
// * 메시지를 출력
// */
//
//package com.bit.exam04;
//
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//public class CorrectTest extends JFrame implements ActionListener {
//	Random rd = new Random();
//	JTextField jtf_tryNum;
//	JTextField jtf_result;
//	
//	public CorrectTest() {
//		jtf_num = new JTextField(5);
//		jtf_result = new JTextField(5);
//		
//		setTitle("숫자게임");
//		
//		setLayout(new FlowLayout());
//		add(new JLabel("숫자를 추측하시오"));
//		add(jtf_tryNum);
//		
//		JButton btn = new JButton("확인!");
//		add(btn);
//		
//		btn.addActionListener(this);
//		
//		add(new JLabel(""));
//		add(jtf_result);
//		
//		setSize(400, 300);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		int n = Integer.parseInt(jtf_num.getText());
//		
//		if(tryNum < ) {
//			
//		}
//	}
//
//	public static void main(String[] args) {
//		new CorrectTest();
//	}
//}
