package ch02.sec04;

import java.util.Scanner;

public class ArithmeticOperator
{
	public static void main(String[] args)
	{
		// 1 변수 - 입력객체, 시간(초), 시간, 분, 초
		Scanner scan = new Scanner(System.in);
		int time = 0;
		int second = 0;
		int minute = 0;
		int hour = 0;

		// 2 입력 - 시간(초)
		System.out.printf("계산할 초를 입력하세요: ");
		time = scan.nextInt();

		// 3 연산
		second = time % 60; // 시간(초)%60은 초
		minute = time / 60 % 60;// 시간(초)/60%60은 분
		hour = time / 60 / 60; // 시간(초)/60/60은 시

		// 4 출력
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.\n", time, hour, minute, second);

		// 5 종료
		scan.close();
		System.out.printf("The End");
	}
}
