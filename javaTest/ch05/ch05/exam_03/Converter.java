package ch05.exam_03;

import java.util.Scanner;

//추상클래스 : 일반클래스와 구조는 같다 + 추상메소드, 스스로 객체 불가, 자식은 객체생성
abstract class Converter
{
	
	
	// 멤버변수
	protected double ratio;

	// 생성자(디폴트생성자+부모디폴트생성자)
	public Converter()
	{
		super();
	}
	// 멤버함수(추상멤버함수)
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	// 멤버함수(연산실행)
	public void run()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.println("변환결과: " + res + getDestString() + "입니다");
		scan.close();
	}
}
