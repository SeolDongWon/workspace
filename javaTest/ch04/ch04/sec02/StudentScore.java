package ch04.sec02;

import java.text.DecimalFormat;
import java.util.Objects;

public class StudentScore
{
	// 멤버변수(=필드)(이름,번호,나이,국어,영어,수학,총점,평균,등급,상수:과목수=3)
	private String name; // 인스턴스 멤버변수
	private int no; 
	private int age; // static int age 처럼 static이 붙으면 클래스멤버변수,정적변수
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private char grade;
	private static final double SUB_NUM = 3;

	public StudentScore(String name, int no, int age, int kor, int eng, int math)
	{
		super();
		this.name = name;
		this.no = no;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// setter,getter 함수
	public void setKor(int kor)
	{

		if (0 <= kor && kor <= 100)
		{
			this.kor = kor;
		} else
		{
			System.out.printf("0~100점을 입력\n");
		}
	}

	public int getKor()
	{
		return kor;
	}

	// 멤버함수(=메소드)(연산과 제어구조)(연산식:총점,평균,등급)
	public void calTotal()
	{
		total = kor + eng + math;
	}

	public void calAverage()
	{
		avg = total / SUB_NUM;
	}

	public void calGrade()
	{
		switch ((int) avg / 10)
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

	@Override
	public boolean equals(Object obj)
	{
		StudentScore ss = (StudentScore)obj;
		
		if(name.equals(ss.name)&&no==ss.no) {
			return true;
		}
		return false;
	}
	
	// 출력
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("0.00");
		return "StudentScore[\t" + name + "\t" + no + "\t" + age + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total
				+ "\t" + df.format(avg) + "\t" + grade + "  ]";
	}

}
