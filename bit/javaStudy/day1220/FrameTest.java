import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// 버튼이 눌려졌을 때 일처리담당을 위한 인터페이스가 ActionListener
// 우리가 만든 MyFrame에도 버튼이 눌렸을 때 일처리를 하기 위해 ActionListener를 구현 한다.
// MyFrame은 implements ActionListener 했기 때문에 ActionListener 인터페이스 속에 있는 모든 추상메소드를 나한테 맞도록 재정의 해야한다.

class MyFrame extends Frame implements ActionListener {
	Button ok;
	public MyFrame(String title) {
		super(title);	//	Frame의 생성자를 요구, 첫번째 문장에 와야함

		ok = new Button("Push Push Baby");	//	버튼을 생성자 안에서 생성
		ok.addActionListener(this);	//	이벤트 처리 담당자는 MyFrame이라는 뜻
		add(ok);
		setSize(400, 300);	//	Frame의 아버지인 Window에 있는 setSize를 가져옴
		setVisible(true); //	Frame의 아버지인 Window에 있는 setVisible를 가져옴
		setLayout(new FlowLayout());
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("건들지마라");
	}
}

class FrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("GoogIe");
	}
}
