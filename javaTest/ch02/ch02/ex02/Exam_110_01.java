package ch02.ex02;

import java.util.Scanner;

public class Exam_110_01
{
//	상수 달러환율
	public static final double DOLLAR = 1341.13;

	public static void main(String[] args)
	{
//	1. 변수선언과 초기화 ( 입력변수, 원화, 환전후 액수
		Scanner scan = new Scanner(System.in);
		int won = 0;
		double resultValue = 0.0;

//	2. 입력 원화
		System.out.print("원화를 입력하세요(단위:원)>>>");
		won = scan.nextInt();
		scan.nextLine();

//	3. 연산처리 ( 환전후 액수= 원화/달러환율
		resultValue = (int) won / DOLLAR;

//	4. 출력		
		System.out.printf("%d원은 $%.1f입니다.\n", won, resultValue);

//	5. 종료
		scan.close();
		System.out.println("the end");
	}
}
