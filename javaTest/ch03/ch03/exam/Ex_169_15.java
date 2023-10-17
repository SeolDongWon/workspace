package ch03.exam;

import java.util.Scanner;

public class Ex_169_15
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		boolean continueFlag = false;

		for (; true;)
		{
			System.out.printf("Enter two integers(ex:12 34)>>");
			try
			{
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				if (num1 == -1 || num2 == -1)
				{scan.close();
					break;
				}
			} catch (Exception e)
			{
				System.out.printf("정수만 입력해주세요");
				continueFlag = true;
				scan.nextLine(); // clear input buffer
			}
			if (continueFlag == true)
			{
				continueFlag = false;
				continue;
			}
			result = num1 * num2;
			System.out.printf("%d * %d = %d \n", num1, num2, result);
		}
		scan.close();
		System.out.printf("END");
	}
}
