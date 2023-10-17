// 정수값으로 10번을 입력받는다 반복문 포문을 활용해서 그리고 음수가 입력되면 합계에 들어가지 않는다 총 합계를 구하라
package ch03.sec02;

import java.util.Scanner;

public class ContinueExample
{
	public static void main(String[] args)
	{	// 1 변수선언과 초기화- 입력정수, 합계
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0;
		// 2 입력
		System.out.printf("정수 10개 입력>>");
		for (int i = 0; i < 10; i++)
		{
			num = scan.nextInt();
			if (num < 0) // 입력값이 음수면 아무일도 하지 않는다
			{
			} else	// 입력값이 음수가 아니라면 sum에 더한다
			{
				sum = sum + num;
			}
		}
		// 4 출력
		System.out.printf("양수의 합계는 %d\n", sum);
		// 5 종료
		scan.close();
		System.out.printf("END");
	}
}
