// 실수를 입력하면 예외처리하는 프로그램
package ch03.examSEOL;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_164_15
{
	public static void main(String[] args)
	{
		// 1 변수선언&초기화
		Scanner scan = new Scanner(System.in);
		int n = 0, m = 0;

		for (int i = 0; i < 3; i++)
		{
			try
			{ // 2 입력&출력
				System.out.print("곱하고자 하는 두 수 입력>>");
				n = scan.nextInt();
				m = scan.nextInt();
				System.out.print(n + "x" + m + "=" + n * m);
			} catch (InputMismatchException e)
			{
				System.out.printf("실수는 입력하면 안됩니다.");
				scan.nextLine();
			}
			System.out.printf("\n");
		}

		// 4 종료
		scan.close();
		System.out.printf("ENd");
	}
}
