package ch02.exam;

import java.util.Scanner;

public class Ex_110_04
{

	public static void main(String[] args)
	{
//	1.변수선언, 초기값설정(3개수, 중간값)
		int num1 = 0, num2 = 0, num3 = 0, median = 0;

//	2.입력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력 >>>");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

//	3.연산
		if ((num2 <= num1 && num1 <= num3) || (num3 <= num1 && num1 <= num2))
		{
			median = num1;
		} else if ((num1 <= num2 && num2 <= num3) || (num3 <= num2 && num2 <= num1))
		{
			median = num2;
		} else
		{
			median = num3;
		}

		scan.close();
		System.out.printf("%d %d %d 중간값은 %d \n", num1, num2, num3, median);
	}

}
