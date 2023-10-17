package ch02.exam;

import java.util.Scanner;

public class Ex_110_12
{
	public static void main(String[] args)
	{
		// 1. 변수선언(사칙연산구조,수1,연산자,수2,계산결과값)
		// 2. 변수초기값설정
		double num1 = 0.0, num2 = 0.0, result = 0.0;
		String operator = null;

		// 3. 입력 수1, 연산자, 수2
		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");
		num1 = scan.nextDouble();
		operator = scan.next();
		num2 = scan.nextDouble();

		// 4. 연산, 처리
		switch (operator)
		{
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 == 0.0)
			{
				System.out.printf("0으로 나눌 수 없습니다.\n");
				scan.close();
				System.out.printf("The End");
				return;
			}
			result = num1 / num2;
			break;
		default:
			System.out.printf("없는 산술연산자입니다.\n" + "" + "");
			scan.close();
			System.out.printf("The End");
			return;
		}
		
		// 5. 출력
		System.out.printf("%.2f %s %.2f = %.2f \n", num1, operator, num2, result);

		// 6. 종료
		scan.close();
		System.out.printf("The End");
	}
}
