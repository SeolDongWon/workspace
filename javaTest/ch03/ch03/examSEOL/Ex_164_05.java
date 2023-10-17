//입력한 정수 중 3의 배수를 출력하는 프로그램
package ch03.examSEOL;

import java.util.Scanner;

public class Ex_164_05
{
	public static void main(String[] args)
	{
		//1 변수선언&초기화 - 정수배열
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[10];

		//2 입력 - 정수 10개
		System.out.printf("양의 정수 10개를 입력하시오>>");
		for (int i = 0; i < intArray.length; i++)
		{
			intArray[i] = scan.nextInt();
		}

		//3 연산&출력
		System.out.printf("3의 배수는 ");
		for (int i = 0; i < intArray.length; i++)
		{
			System.out.printf((intArray[i]%3==0)?(intArray[i]+" "):(""));
		}
		
		//4 종료
		scan.close();
		System.out.printf("\nEND");
	}
}
