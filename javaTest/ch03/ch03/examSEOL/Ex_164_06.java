//환산 프로그램
package ch03.examSEOL;

import java.util.Scanner;

public class Ex_164_06
{
	public static void main(String[] args)
	{
		//1 변수선언&초기화
		Scanner scan = new Scanner(System.in);
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // 환산할 돈의 종류
		int money = 0, count = 0;

		//2 입력
		System.out.printf("금액을 입력하시오>>");
		money = scan.nextInt();

		//3 연산&출력
		for (int i = 0; i < unit.length; i++)
		{
			count = money / unit[i];	//변환 수
			if (count == 0)	// 변환 수가 0이면 아무것도 안함 
			{
			} else
			{
				money = money - count * unit[i];	// 환산한만큼 빼기
				System.out.printf("%d원 짜리 : %d개\n", unit[i], count);
			}
		}

		//4 결과
		scan.close();
		System.out.printf("END");

	}
}
