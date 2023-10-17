package ch01.sec05;

import java.util.Scanner;

public class ScannerTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int age = 0;
		int math = 0;
		String name = null;

		System.out.print("당신의 이름 : ");
		name = scan.nextLine();
		System.out.print("당신의 나이는 : ");
		age = scan.nextInt();
		System.out.print("당신의 수학점수 : ");
		math = scan.nextInt();

		System.out.printf("나이는 	: %d \n", age);
		System.out.printf("수학점수	: %d \n", math);
		System.out.printf("이름  	: %10s \n", name);

		scan.close();
		System.out.println("종료");

	}
}
