package ch02.sec03;

import java.util.Scanner;

public class GradeSwitch
{
	public static void main(String[] args)
	{
		//	1 변수선언&초기화 - 점수, 학점
		Scanner scan = new Scanner(System.in);
		int score = 0;
		char grade = 0;

		//	2 입력 - 점수
		for (int i = 0; i < 3; i++)
		{
			System.out.printf("점수를 입력하세요(0~100)");
			score = scan.nextInt();

			//	3-1 if-else연산
			switch (score / 10) // 점수를 10으로 나눈 몫
			{
			case 10: // 100점
			case 9:
				grade = 'A'; // 90~99점
				break;
			case 8:
				grade = 'B'; // 80~89점
				break;
			case 7:
				grade = 'C'; // 70~79점
				break;
			case 6:
				grade = 'D'; // 60~69점
				break;
			default:
				grade = 'F'; // 59점 이하
			}

			//	3-2 switch연산
			if (90 <= score)
			{
				grade = 'A'; // 90~99점
			} else if (80 <= score)
			{
				grade = 'B'; // 80~89점
			} else if (70 <= score)
			{
				grade = 'C'; // 70~79점
			} else if (60 <= score)
			{
				grade = 'D'; // 60~69점
			} else
			{
				grade = 'F'; // 59점 이하
			}

			//	4 출력
			System.out.printf("학점은 %s \n", grade);
		} // end of for
		
		//	5 종료
		scan.close();
		System.out.printf("The End");
	}
}
