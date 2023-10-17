package ch01.sec05;

import java.util.Scanner;

public class ScannerTest2
{
	public static void main(String[] args)
	{
		// 1. 변수 선언
		Scanner scan = new Scanner(System.in);
		int age = 0;
		int math = 0;
		String name = null;
		
		// 2. 변수 초기값 선언

		System.out.print("당신의 나이는 : ");
		age = scan.nextInt();
		System.out.print("당신의 수학점수 : ");
		math = scan.nextInt();
		scan.nextLine();
		System.out.print("당신의 이름 : ");
		name = scan.nextLine();
		
		// 3. 연산, 처리

		// 4. 출력
		System.out.printf("나이는 	: %d \n", age);
		System.out.printf("수학점수	: %d \n", math);
		System.out.printf("이름  	: %10s \n", name);
		
		// 5. 종료, 객체참조반납
		scan.close();
		System.out.println("종료");

	}
}
