// 계산기 switch
package ch02.seol.ex02;

import java.util.Scanner;

public class Exam_110_12_switch
{
	public static void main(String[] args)
	{
//	1 변수
		Scanner scan = new Scanner(System.in);
		double number1 = 0.0, number2 = 0.0;
		double result = 0.0;
		String calculation = null;

//	2 입력
		System.out.print("연산>>");
		number1 = scan.nextDouble();
		calculation = scan.next();
		number2 = scan.nextDouble();

//	3 연산
		switch (calculation)
		{
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;
		default:
			System.out.println("연산오류");
			break;
		}

//	4 출력
		System.out.printf("%.0f%s%.0f의 계산 결과는 %.0f", number1, calculation, number2, result);

//	5 종료
		scan.close();
		System.out.println("\n종료");
	}
}
