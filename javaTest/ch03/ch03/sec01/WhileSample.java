package ch03.sec01;

import java.util.Scanner;

public class WhileSample
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0;

		for (; true;)
		{
			System.out.printf("입력>>");
			num = scan.nextInt();
			if (num == -1)
			{
				scan.close();
				break;
			}
			sum += num;
		}
		System.out.printf("합계 %d\n", sum);

		scan.close();
		System.out.printf("END");
	}
}
