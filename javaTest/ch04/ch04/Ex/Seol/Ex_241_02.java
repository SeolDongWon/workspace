package ch04.Ex.Seol;

import java.text.DecimalFormat;
import java.util.Scanner;

class Grade
{
	private static double SUBJECT_NUMBER = 3;
	private int math;
	private int science;
	private int english;

	public Grade(int math, int science, int english)
	{
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public String average()
	{
		double avr = (math + science + english) / SUBJECT_NUMBER;
		DecimalFormat df = new DecimalFormat("0");
		return df.format(avr);
	}
}

public class Ex_241_02
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("수학,과학,영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average()); // average는 평균을 계산하여 리턴

		scanner.close();
	}
}
