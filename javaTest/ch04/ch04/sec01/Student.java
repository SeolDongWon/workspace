package ch04.sec01;
//클래스 안에 들어있는 변수는 클래스멤버변수

import java.text.DecimalFormat;

public class Student
{
	// 멤버변수(이름,번호,나이,국어,영어,수학,총점,평균,등급,과목수)
	String name;
	int no;
	int age;
	int kor;
	int eng;
	int math;
	int total;
	double avr;
	char grade;
	public static final double COUNT = 3;
	DecimalFormat df = new DecimalFormat("0.00");
	// 매개변수 생성자함수
	public Student(String name, int no, int age, int kor, int eng, int math)
	{
		this.name = name;
		this.no = no;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 멤버함수(연산식: 총점,평균,등급)
	public void calTotal()
	{
		total = kor + eng + math;
	}

	public void calAerage()
	{
		
		avr = (total / COUNT);
	}

	public void calGrade()
	{
		switch ((int) avr / 10)
		{
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
	}
	// 멤버함수(함수) 출력함수

	@Override
	public String toString()
	{
		return "Student [name=" + name + ", no=" + no + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", total=" + total + ", avr=" + df.format(avr) + ", grade=" + grade + "]";
	}

}
