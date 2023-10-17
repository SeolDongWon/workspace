package ch03.sec01;

import java.util.Scanner;

public class WhileSample1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = 0;

		for (; true;)
		{
			System.out.printf("입력>>");
			num = scan.nextInt();
			if (num == -1)
			{
				scan.close();
				break;
			}
			if (num != 0 && num % 3 == 0)
			{
				System.out.printf("%d은 3의 배수\n", num);
			}
		}

		scan.close();
		System.out.printf("END");
	}
}
