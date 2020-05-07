package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		ArrayList<Student> list = new ArrayList<Student>();
		StudentUtil util = new StudentUtil();
		
		System.out.println("*** 평균 성적 순위 계산기 ***");
		
		while(true) {
			System.out.println("메뉴를 선택하세요. (1. 조회 / 2. 입력 / 3. 순위)");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: util.print(list); break;
			case 2: util.input(list); break;
			case 3: util.sort((ArrayList)list.clone()); break;
			default: System.out.println("존재하지 않는 메뉴입니다.");
			}
		}
	}
}

class Student {
	private int no;
	private double kor;
	private double math;
	private double eng;
	private double tot;
	private double avg;
	
	public Student() {
	}

	public Student(int no, double kor, double math, double eng) {
		this.no = no;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		tot = kor + eng + math;
		avg = tot / 3;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public double getKor() {
		return kor;
	}

	public void setKor(double kor) {
		this.kor = kor;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEng() {
		return eng;
	}

	public void setEng(double eng) {
		this.eng = eng;
	}

	public double getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}
	
}

class StudentUtil {
	
	public void input(ArrayList<Student> list) {
		int no = list.size() + 1;
		Scanner sc = new Scanner(System.in);
		double kor, eng, math;
		
		System.out.print(no + "번 학생의 국어점수 : ");
		kor = sc.nextDouble();
		
		System.out.print(no + "번 학생의 수학점수 : ");
		math = sc.nextDouble();
		
		System.out.print(no + "번 학생의 영어점수 : ");
		eng = sc.nextDouble();
		
		list.add(new Student(no, kor, math, eng));
	}

	public void print(ArrayList<Student> list) {
		
		if (list.size() == 0) {
			System.out.println("입력된 점수가 없습니다.");
			return;
		}
		
		System.out.println("번호\t국어\t수학\t영어\t평균");
		
		for (Student st : list) {
			System.out.print(st.getNo() + "\t");
			System.out.print(st.getKor() + "\t");
			System.out.print(st.getMath() + "\t");
			System.out.print(st.getEng() + "\t");
			System.out.println(st.getAvg());
		}
	}

	public void sort(ArrayList<Student> list) {
		System.out.println("*** 순위 ***");
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j).getAvg() > list.get(i).getAvg()) {
					Student temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		System.out.println("순위\t번호\t평균");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "\t" + list.get(i).getNo()+ "\t" + list.get(i).getAvg());
		}
	}
}
