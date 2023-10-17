package ch04.sec01;

import java.util.Scanner;

public class JinHan
{
	public static void main(String[] args)
	{
		// 1. 변수선언, 초기값설정

		// 2. 입력
		Student student = new Student("설동원", 6, 33, 71, 83, 90);

		// 3. 연산
		student.calTotal();
		student.calAerage();
		student.calGrade();

		// 4. 출력
		System.out.printf(student.toString());

		// 5. 종료
		System.out.printf("\nEND");

	}

}
