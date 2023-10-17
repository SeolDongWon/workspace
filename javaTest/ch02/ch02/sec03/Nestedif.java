package ch02.sec03;

import java.util.Scanner;

public class Nestedif
{
	public static void main(String[] args)
	{
		// 1 변수선언 초기값 - 점수, 학년, 패스
		Scanner scan = new Scanner(System.in);
		int score = 0, grade = 0;
		boolean pass = false;

		for (int i = 0; i < 3; i++)
		{
			// 2 입력 - 학년, 점수
			System.out.printf("학년 입력(1~4): ");
			grade = scan.nextInt();
			System.out.printf("점수 입력(0~100): ");
			score = scan.nextInt();

			// 3 연산 - 1,2,3학년은 60점 이상이면 합격 , 4학년은 70점 이상이면 합격
			if (score >= 70 && grade == 4)
			{
				pass = true;
			} else if (score >= 60 && grade != 4)
			{
				pass = true;
			} else
			{
				pass = false;
			}

			// 4 출력
			System.out.printf("%s \n", (pass) ? ("합격") : ("불합격"));
		}
		// 5 종료
		scan.close();
		System.out.printf("The End\n");

	}
}
