/*
현재 시각은 2019년 12월 27일 금요일 14시 51분 30초
*/

import java.util.Date;

class Now {
	public String toString() {
		Date d = new Date();

		int year = d.getYear() + 1900;
		int month = d.getMonth()+1;
		int date = d.getDate();
		int day = d.getDay();
		int hours = d.getHours();
		int minutes = d.getMinutes();
		int seconds = d.getSeconds();

		String[] yoil = {"일", "월", "화", "수", "목", "금", "토"};
		String str = year + "년 " + month + "월 " + date + "일 " + yoil[day] + "요일 " + hours + "시 " + minutes + "분 " + seconds + "초 ";

		return str;
	}
}

class NowTest03 {
	public static void main(String[] args) {
		while(true) {
			System.out.println(new Now());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
