package ch03.sec03;

import java.util.Scanner;

public class ExceptionTest
{
	public static void main(String[] args)
	{
		int number1 = 0;
//		int[] iArray = {10,20,30,40,50};
//		System.out.printf("iArray[%d]=%d \n",number, iArray[number]);
		Scanner scan = new Scanner(System.in);

		EXIT: for (; true;)
		{
			System.out.printf("input number>> ");
			try
			{
				number1 = scan.nextInt();
				if (number1 == -1)
				{
					break EXIT;
				}
				System.out.printf("result = %d \n", 100 / number1);
			} catch (Exception e)
			{
				System.out.printf("result = %d \n", 100 / (int) (Math.random() * 20 + 2));
			} finally
			{
				System.out.printf("참 잘했어요 \n");
			}
		} // end of for
		scan.close();
		System.out.printf("종료");
	}
}