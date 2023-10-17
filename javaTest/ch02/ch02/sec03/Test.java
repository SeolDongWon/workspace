package ch02.sec03;

import java.util.Scanner;

public class Test
{
//	클래스상수 - 벌금($) - 0번=0.0 , 1번=1.3 , 2~3번=2.0 , 4~5번=4.0 , 6~7번=6.0 , 8번이상=8.0
	public static final double THROW_1 = 1.3, THROW_2 = 2.0, THROW_3 = 4.0, THROW_4 = 6.0, THROW_5 = 8.0;

	public static void main(String[] args)
	{
//	1 변수 - 이름:name , 전화번호:phone , 주민번호:regisNumber , 벌금:fine , 투기횟수:numSpeculate
		Scanner scan = new Scanner(System.in);
		String name = null, phone = null, regisNumber = null;
		double fine = 0.0;
		int numSpeculate = 0;

		for (int i = 0; i < 3; i++)
		{
//	2 입력 - 이름, 전화번호, 주민번호, 투기횟수
			System.out.printf(" 이 름  입력: ");
			name = scan.nextLine();
			System.out.printf("전화번호 입력: ");
			phone = scan.nextLine();
			System.out.printf("주민번호 입력: ");
			regisNumber = scan.nextLine();
			System.out.printf("투기횟수 입력: ");
			numSpeculate = scan.nextInt();
			scan.nextLine(); // buffer clear

//	3 연산 - 벌금($) - 0번=0.0 , 1번=1.3 , 2~3번=2.0 , 4~5번=4.0 , 6~7번=6.0 , 8번이상=8.0

			switch (numSpeculate)
			{
			case 0:
				fine = 0.0;
				break;
			case 1:
				fine = THROW_1;
				break;
			case 2, 3:
				fine = THROW_2;
				break;
			case 4, 5:
				fine = THROW_3;
				break;
			case 6, 7:
				fine = THROW_4;
				break;
			default:
				fine = THROW_5;
			}

//	4 출력
			System.out.printf("\n 이 름	: %s \n", name);
			System.out.printf("전화번호	: %s \n", phone);
			System.out.printf("주민번호	: %s \n", regisNumber);
			System.out.printf("투기횟수	: %d번 \n", numSpeculate);
			System.out.printf("벌금($)	: %.1f$ \n", fine);
			System.out.printf("===================\n");
		}

//	5 종료
		scan.close();
		System.out.printf("The End");

	}
}
