package ch01.sec01_1;

import java.util.Scanner;

public class ScannerTest
{
	public static void main(String[] args)
	{
		// 문자열 입력
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("이름입력	:");
		String name = scan.nextLine();
		System.out.print("나이입력	:");
		int age = scan.nextInt();
		System.out.print("몸무게입력	:");
		double weight = scan.nextDouble();

		// 문자열 출력
		System.out.printf("이 름	:%s \n", name);
		System.out.printf("나 이	:%d살 \n", age);
		System.out.printf("몸무게	:%.2fKg \n", weight);
	}
}
