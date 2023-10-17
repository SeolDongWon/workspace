package ch01.sec01_1;

import java.util.Scanner;

public class ScannerTest1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
//입력
		System.out.printf("당신의 가족 수를 입력하세요 ");
		int familyNumber = scan.nextInt();
		scan.nextLine(); // buffer clear
		System.out.printf("당신의 본을 입력하세요 ");
		String familyClan = scan.nextLine();
		System.out.printf("당신의 키를 입력하세요 ");
		double height = scan.nextDouble();
//출력
		System.out.printf("당신의 가족 수는 %d명 입니다.\n", familyNumber);
		System.out.printf("당신의 본은 %s입니다.\n", familyClan);
		System.out.printf("당신의 키는 %.2f입니다.\n", height);

		scan.close();
	}
}
