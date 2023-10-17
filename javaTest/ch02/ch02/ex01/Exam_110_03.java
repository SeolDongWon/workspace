package ch02.ex01;

import java.util.Scanner;

public class Exam_110_03
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int won = 0;
		System.out.print("금액을 입력하시오>>");
		won = scan.nextInt();

		if (won >= 50000)
		{
			System.out.printf("오만원권 %d매\n", won / 50000);
			won = won%50000;
		}if (50000 > won && won >= 10000)
		{
			System.out.printf("만원권 %d매\n", won / 10000);
			won = won%10000;
		}if (10000 > won && won >= 1000)
		{
			System.out.printf("천원권 %d매\n", won / 1000);
			won = won%1000;
		}if (1000 > won && won >= 100)
		{
			System.out.printf("백원 %d개\n", won / 100);
			won = won%100;
		}if (100 > won && won >= 50)
		{
			System.out.printf("오십원 %d개\n", won / 50);
			won = won%50;
		}if (50 > won && won >= 10)
		{
			System.out.printf("십원 %d개\n", won / 10);
			won = won%10;
		}if (10 > won && won >= 0)
		{
		System.out.printf("일원 %d개\n", won );
		}

		scan.close();

	}
}
