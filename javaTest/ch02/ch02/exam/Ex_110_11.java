package ch02.exam;

import java.util.Scanner;

public class Ex_110_11
{
//	클래스상수, 정적멤버상수, 글로벌 상수
	public static final String SPRING = "봄", SUMMER = "여름", FALL = "가을", WINTER = "겨울";

	public static void main(String[] args)
	{
//	1 변수선언 초기값 - 달
		int month = 0;
//	2 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요>>>");
		month = scan.nextInt();
//	3 연산
		switch (month)
		{
		case 3:
		case 4:
		case 5:
			System.out.printf("3~5월 %s %n", SPRING);
			break;
		case 6:
		case 7:
		case 8:
			System.out.printf("6~8월 %s %n", SUMMER);
			break;
		case 9:
		case 10:
		case 11:
			System.out.printf("9~11월 %s %n", FALL);
			break;
		case 12:
		case 1:
		case 2:
			System.out.printf("12~2월 %s %n", WINTER);
			break;
		default:			
			System.out.printf("%d월 %s %n", month, "잘못입력");
			break;
		}

//	5 종료
		scan.close();
		System.out.println("The End");

		
		
	}
}
