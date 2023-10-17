package ch03.examSEOL;

import java.util.Scanner;

public class Ex_164_03
{
	public static void main(String[] args)
	{
		// 1 변수선언&초기화 - 입력객체, 줄수
		Scanner scan = new Scanner(System.in);
		int line = 0;

		// 2 입력 - 줄수
		System.out.printf("정수를 입력하시오>>");
		line = scan.nextInt();

		// 3 연산&출력
		for (int i = line; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		// 4 종료
		scan.close();
		System.out.printf("The End");
	}
}
