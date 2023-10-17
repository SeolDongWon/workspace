package ch02.exam;

import java.util.Scanner;

public class Ex_110_11_2
{
	public static void main(String[] args)
	{ // 1 변수선언 초기화 - 입력객체, 달, 계절,
		Scanner scan = new Scanner(System.in);
		String month = null;
		String season = null;

		for (; true;)
		{
			// 2 입력
			System.out.printf("달을 입력하세요(1~12)>>");
			month = scan.next();
			scan.nextLine();

			if (month.equals("-1"))
			{
				scan.close();
				System.out.printf("END");
				break;
			}
			// 3 연산 - switch
			switch (month)
			{
			case "3":
			case "4":
			case "5":
				season = "봄";
				break;
			case "6":
			case "7":
			case "8":
				season = "여름";
				break;
			case "9":
			case "10":
			case "11":
				season = "가을";
				break;
			case "12":
			case "1":
			case "2":
				season = "겨울";
				break;
			default:
				season = "잘못입력";
			}
			System.out.printf("%s\n", season);
			// 4 출력
		}
		// 5 종료
		scan.close();
		System.out.printf("END");
		return;

		// 3 연산 - if-else
//			if (month == 3 || month == 4 || month == 5)
//			{
//				season = "봄";
//
//			} else if (month == 6 || month == 7 || month == 8)
//			{
//				season = "여름";
//
//			} else if (month == 9 || month == 10 || month == 11)
//			{
//				season = "가을";
//
//			} else if (month == 12 || month == 1 || month == 2)
//			{
//				season = "겨울";
//
//			} else if (month == -1)
//			{
//				scan.close();
//				System.out.printf("END");
//				return;
//			} else
//			{
//				System.out.printf("잘못입력\n");
//				scan.close();
//				System.out.printf("END");
//				return;
//
//			}

	}
}
