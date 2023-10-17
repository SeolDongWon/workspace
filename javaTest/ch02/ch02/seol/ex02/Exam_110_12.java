// 계산기
package ch02.seol.ex02;

import java.util.Scanner;

public class Exam_110_12
{
	public static void main(String[] args)
	{
		// 1 변수
		Scanner scan = new Scanner(System.in);
		double number1 = 0.0, number2 = 0.0; // 피연산자1,피연산자2
		double result = 0.0; // 연산결과
		String calculation = null; // 연산자
		String zeroDivision = null; // 0나누기판단, switch에 쓰기위해 boolean이 아니라 문자열을 사용

		// 2 입력 - (실수)피연산자 (문자열)연산자 (실수)피연산자
		zeroDivision = "1"; // 0나누기판단변수에 "1"할당
		System.out.print("연산>>");
		number1 = scan.nextDouble();
		calculation = scan.next();
		number2 = scan.nextDouble();

		// 3_1 연산 - if-else
		if (calculation.equals("+"))
		{
			result = number1 + number2;
		} else if (calculation.equals("-"))
		{
			result = number1 - number2;
		} else if (calculation.equals("*"))
		{
			result = number1 * number2;
		} else if (calculation.equals("/"))
		{
			if (number2 == 0) // 2중 if문, 나누기 연산을 할 때 0으로 나누면
			{
				zeroDivision = "0"; // 0나누기판단변수에 "0" 할당
			} else
			{
				result = number1 / number2;
			}
		} else
		{
			System.out.println("연산오류");
		}

		// 3_2 연산 - switch
//	switch (calculation)
//	{
//	case "+":
//		result = number1 + number2;
//		break;
//	case "-":
//		result = number1 - number2;
//		break;
//	case "*":
//		result = number1 * number2;
//		break;
//	case "/": 					
//		switch ((int) number2)		// 2중 switch문
//		{
//		case 0: 				// 나누기 연산을 할 때 0으로 나누면
//			zeroDivision = "0"; // 0나누기판단변수에 "0" 할당
//			break;
//		}
//		result = number1 / number2;
//		break;
//	default:
//		System.out.println("연산오류");
//		break;
//	}

		// 4_1 출력-if-else, 문제에서 피연산자는 실수지만 출력은 정수로 한다
//	if (zeroDivision.equals("0"))
//	{
//		System.out.printf("0으로 나눌 수 없습니다.");
//	}
//	else
//	{
//		System.out.printf("%d %s %d의 계산 결과는 %d", (int) number1, calculation, (int) number2, (int) result);
//	}

		// 4_2 출력-switch, 문제에서 피연산자는 실수지만 출력은 정수로 한다
		switch (zeroDivision)
		{
		case "0":
			System.out.printf("0으로 나눌 수 없습니다.");
			break;
		default:
			System.out.printf("%d %s %d의 계산 결과는 %d", (int) number1, calculation, (int) number2, (int) result);
		}

		// 5 종료
		scan.close();
		System.out.println("\n종료");
	}
}
