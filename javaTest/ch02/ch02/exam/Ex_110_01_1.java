package ch02.exam;

import java.util.Scanner;

public class Ex_110_01_1
{
	// 클래스상수 - 달러:원 환율 1달러=1100원
	public static final double DOLLAR_CHANGE_RATE = 1100;

	public static void main(String[] args)
	{
		// 1 변수 - 입력객체, 환전할 원화, 환전후 달러
		Scanner scan = new Scanner(System.in);
		int won = 0; // 환전할 원화
		double dollar = 0.0; // 환전후 달러

		int i = 0;
		do
		{
			// 2 입력 - 환전할 원화 입력
			System.out.printf("원화를 입력하세요>>");
			won = scan.nextInt();

			// 3 연산 - 입력한 원화를 환율로 나눠서 달러로 환전
			dollar = won / 1100;

			// 4 출력 - 환전한 달러 출력
			System.out.printf("%d원은 $%.1f입니다.\n", won, dollar);

			i++;
		} while (i < 3);// 반복
		// 5 종료
		scan.close();
		System.out.printf("The End");

	}
}
