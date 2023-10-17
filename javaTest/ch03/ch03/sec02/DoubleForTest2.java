package ch03.sec02;

import java.util.Scanner;

public class DoubleForTest2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int line = 0;
		int middle = 0;

		System.out.printf("줄 수 입력>>");
		line = scan.nextInt();

		middle = (line) / 2;

		for (int i = 0; i < line; i++)
		{
			for (int j = 0; j < ((i < middle) ? (i + 1) : (line - i)); j++)
			{ // > 모양
				System.out.printf("* ");
			}
			for (int k = 0; k < ((i < middle) ? (line - 2 * (i + 1)) : (2 * i - line)); k++)
			{
				System.out.printf("0 ");
			}
			for (int l = 0; l < ((i < middle) ? (i + 1) : (line - i)); l++)
			{ // > 모양
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}

		scan.close();
		System.out.printf("END");
	}
}
