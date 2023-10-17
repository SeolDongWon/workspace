package ch03.exam;

import java.util.Scanner;

public class Ex_164_03
{
	public static void main(String[] args)
	{
		int num = 0;
		Scanner scan = new Scanner(System.in);

		for (; true;)
		{
			System.out.printf("Enter a number: ");
			num = scan.nextInt();

			if (num == -1)
			{
				scan.close();
				System.out.printf("END");
				break;
				
			}

			for (int i = 0; i < num; i++)
			{
				for (int j = 0; j < (num - i); j++)
				{
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
		}
		scan.close();
		System.out.printf("END");
	}
}
