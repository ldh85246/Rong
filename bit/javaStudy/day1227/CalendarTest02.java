import java.util.Calendar;
import java.awt.Frame;
import java.awt.Label;

class MyFrame extends Frame {
	Label view;
	public MyFrame() {
		view = new Label("여기에 현재시간 표시");
		add(view);
		setSize(400, 300);
		setVisible(true);
	}
}

class CalendarTest02 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		String[] yoil = {"", "일", "월","화","수","목","금","토"};

		while (true) {
			Calendar today = Calendar.getInstance();
			int year = today.get(Calendar.YEAR);
			int month = today.get(Calendar.MONTH) + 1;
			int date = today.get(Calendar.DATE);
			int day = today.get(Calendar.DAY_OF_WEEK);
			int hour = today.get(Calendar.HOUR_OF_DAY);
			int minute = today.get(Calendar.MINUTE);
			int second = today.get(Calendar.SECOND);

			StringBuffer sb = new StringBuffer();
			sb.append(year + "년 ");
			sb.append(month + "월 ");
			sb.append(date + "일 ");
			sb.append(yoil[day] + "요일 ");
			sb.append(hour + "시 ");
			sb.append(minute + "분 ");
			sb.append(second + "초 ");

//			f.view.setText(sb); // 이렇게는 불가능, StringBuffer는 상대하지 않음
			f.view.setText(sb.toString());

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
