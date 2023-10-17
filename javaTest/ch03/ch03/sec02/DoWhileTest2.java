// 임의의 수를 입력받아서 출력해주는 반복문
// 단 입력값이 -1이 계속진행
package ch03.sec02;

import java.util.Scanner;

public class DoWhileTest2
{
	public static void main(String[] args)
	{ // 1 declare, init
		int num = 0;
		Scanner scan = new Scanner(System.in);

		do
		{
			System.out.printf("num=%d\n", num);
			System.out.printf("input number>>>");
			num = scan.nextInt();
		} while (num != -1);
		scan.close();
		System.out.printf("END");
	}
}
