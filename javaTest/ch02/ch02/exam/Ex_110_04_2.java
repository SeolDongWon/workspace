package ch02.exam;

import java.util.Scanner;

public class Ex_110_04_2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		int mid = 0;

		for (int i = 0; i < 3; i++)
		{
			System.out.printf("정수 3개 입력>>");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();

			if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2))
			{
				mid = num1;
			} else if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1))
			{
				mid = num2;
			} else if ((num2 < num3 && num3 < num1) || (num1 < num3 && num3 < num2))
			{
				mid = num3;
			}

			System.out.printf("중간값은 %d\n", mid);
		}
		scan.close();
		System.out.printf("END");
	}
}
