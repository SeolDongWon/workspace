//문제 : 삼각형이 되는 조건 프로그램
package ch02.exam;

import java.util.Scanner;

public class Ex_110_05
{
	public static void main(String[] args)
	{

//	1.변수선언, 초기값설정(3개수, 중간값)
		int num1 = 0, num2 = 0, num3 = 0;
		boolean isTriangle = false;

//	2.입력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력 >>>");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

//	3.연산
		if (((num1 + num2) < num3)||((num1 + num3) < num2)||((num2 + num2) < num1)) {
			isTriangle = false;
		} else {
			isTriangle = true;
		}
		
//	4.출력
		System.out.printf("%d %d %d 삼각형이 %s\n", num1, num2, num3, (isTriangle)?("된다"):("안된다"));

//	5.종료
			scan.close();
		System.out.println("the end");
	}
}
