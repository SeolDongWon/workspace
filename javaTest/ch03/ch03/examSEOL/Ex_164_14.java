// 과목명을 입력하면 점수가 나오는 프로그램
package ch03.examSEOL;

import java.util.Scanner;

public class Ex_164_14
{
	public static void main(String[] args)
	{ // 1 변수선언과 초기화- 입력과목, 출력점수
		Scanner scan = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		String inputCourse = null;
		int outputScore = 0;

		for (; true;)
		{ // 2 입력
			outputScore = -1;
			System.out.printf("과목이름>>");
			inputCourse = scan.nextLine();

			// 3 연산 - "그만" 입력시 루프탈출
			if ("그만".equals(inputCourse))
			{scan.close();
				break;
			}
			// 배열의 문자열과 입력값을 비교
			for (int i = 0; i < 5; i++)
			{
				if (course[i].equals(inputCourse)) // 일치하는 과목명이 있다면
				{
					outputScore = score[i]; // 점수를 할당
					break;
				}
			}
			// 4 출력
			if (outputScore == -1) // 일치하는 과목명이 없어서 점수가 -1이면
			{
				System.out.printf("없는 과목입니다.\n");
			} else
			{
				System.out.printf("%s의 점수는 %d\n", inputCourse, outputScore);
			}
		}
		// 5 종료
		scan.close();
		System.out.printf("END");
	}
}
