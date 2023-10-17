package ch02.sec03;

import java.util.Scanner;

public class TernaryOperator
{
	public static void main(String[] args)
	{
		// 1 변수선언 초기화
		Scanner scan = new Scanner(System.in);
		int number1 = 0, number2 = 0;

		// 2 입력
		for (int i = 0; i < 3; i++)
		{
			System.out.printf("두 수를 입력하세요\n두 수 사이는 공백으로 구분\n");
			number1 = scan.nextInt();
			number2 = scan.nextInt();
			scan.nextLine();

			// 3-1 if 연산 출력
			if (number1 >= number2)
			{
				System.out.printf("IF연산)두 수의 차는 %d \n", number1 - number2);
			} else
			{
				System.out.printf("IF연산)두 수의 차는 %d \n", number2 - number1);
			}
			// 3-2 swich 연산 출력
			System.out.printf("조건연산)두 수의 차는 %d \n", (number1 > number2) ? (number1 - number2) : (number2 - number1));

		}//end of for

		// 4 종료
		scan.close();
		System.out.printf("The End\n");
	}
}
