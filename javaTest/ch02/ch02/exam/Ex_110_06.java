// 문제6번 369 박수짝짝
package ch02.exam;

import java.util.Scanner;

public class Ex_110_06
{
	public static void main(String[] args)
	{

//	1.변수선언, 초기값설정(정수입력)
		int number = 0, tensDigit = 0, onesDigit = 0, count = 0;

//	2.입력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력(1~99) >>>");
		number = scan.nextInt();

//	3.연산
		if (1 <= number && number <= 99)
		{
			onesDigit = number % 10; // 1의자리
			tensDigit = number / 10; // 10의자리
			if (onesDigit != 0 && onesDigit % 3 == 0)
			{
				count = count + 1;
			}
			if (tensDigit != 0 && tensDigit % 3 == 0)
			{
				count = count + 1;
			}

//	4.출력
			if (count == 0)
			{
				System.out.printf("박수\n");
			} else
			{
				System.out.printf("박수%s \n", (count == 1) ? ("짝") : ("짝짝"));
			}

		} else
		{
			System.out.println("숫자 범위를 벗어났습니다.");
		}

//	5.종료
		scan.close();
		System.out.println("the end");
	}
}
