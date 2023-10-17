package ch01.sec10;

import java.util.Scanner;

public class GradeTest
{
	// 멤버변수
	public static final int COUNT = 3;

	// 멤버함수
	public static void main(String[] args)
	{

		// 1. 변수 선언(국어,영어,수학,총점,평균,패스,등급,이름, 입력장치객체)
		// 정수 : 국어 영어 수학 총점
		// 실수 : 평균
		// 문자열 : 패스 등급 이름
		// 2. 변수 초기값 선언
		int kor = 0, eng = 0, math = 0, total = 0;
		double avr = 0.0;
		String pass = null, grade = null, name = null;
		Scanner scan = new Scanner(System.in);

		// 3. 연산, 처리(입력 : 국어,영어,수학,이름)
		System.out.print("국어입력 : ");
		kor = scan.nextInt();
		System.out.print("영어입력 : ");
		eng = scan.nextInt();
		System.out.print("수학입력 : ");
		math = scan.nextInt();
		scan.nextLine();	//입력버퍼클린
		System.out.print("이름입력 : ");
		name = scan.nextLine();

		// 3. 연산(총점, 평균, 등급, 패스)
		total = kor + eng + math;
		avr = total / (double) COUNT;
		pass = "합격";

		if (100.0 >= avr && avr >= 90.0)grade = "A등급";
		if (89.0 >= avr && avr >= 80.0) grade = "B등급";
		if (79.0 >= avr && avr >= 70.0) grade = "C등급";
		if (69.0 >= avr && avr >= 60.0) grade = "D등급";
		if (59.0 >= avr && avr >= 0.0)
		{
			grade = "F등급";
			pass = "불합격";
		}

		// 4. 출력(이름, 국어, 영어, 수학, 총점, 평균, 등급, 패스)
		System.out.printf("이름 : %10s \n",name);
		System.out.printf("국어 : %10d\n",kor);
		System.out.printf("영어 : %10d\n",eng);
		System.out.printf("수학 : %10d\n",math);
		System.out.printf("총점 : %10d\n",total);
		System.out.printf("평균 : %10.2f\n",avr);
		System.out.printf("등급 : %10s\n",grade);
		System.out.printf("패스 : %10s\n",pass);
	
		
		// 5. 종료(자원반납)
		scan.close();
		System.out.println("종료");
	}
}
