package ch01.sec07;

import java.util.Scanner;

public class ConditionTest
{
	public static void main(String[] args)
	{
		// 1. 변수 선언
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String passResult = null;

		// 2. 변수 초기값 선언
		System.out.print("점수입력 : ");
		score = scan.nextInt();

		// 3. 연산, 처리
		if (score >= 60)
		{
			passResult = "합격";
		}
		else
		{
			passResult = "불합격";
		}
		// 4. 출력
		System.out.printf("점수 : %d\n", score);
		System.out.printf("합격상태 : %s\n", passResult);

		// 5. 종료
		scan.close();
		System.out.println("종료");

	}
}
