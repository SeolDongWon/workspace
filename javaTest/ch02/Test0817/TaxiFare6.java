package Test0817;

import java.util.Scanner;

public class TaxiFare6
{
	public static final int BASICFARE = 4800, ADDFARE = 100; // 기본요금, 추가요금
	public static final double EXTRA_CHARGE1 = 1.2, EXTRA_CHARGE2 = 1.4; // 22~23,02~04할증 1.2, 23~02할증 1.4

	public static void main(String[] args)
	{
		// 1. 변수 선언 (입력,날짜,탑승자수,거리,총요금,추가요금,각자낼돈)
		// 2. 변수 초기값 선언
		Scanner scan = new Scanner(System.in);
		String answer = null;
		int humanNumber = 0, totalhuman = 0;
		int fare = 0, totalIncome = 0;
		int month = 0, day = 0, hour = 0, count = 0;
		double aloneFare = 0.0, km = 0.0, totalKm = 0.0;

		// 3. 입력, 연산, 처리
		System.out.println("-------------------------------------");
		System.out.printf("기본요금 : 1.6km이내 %d원\n", BASICFARE);
		System.out.printf("추가요금 : 1.6km이후 131m마다 %d원 추가\n", ADDFARE);
		System.out.println("-------------------------------------");

		answer = "n";

		for (int i = 0; i < 10000; i = i + 1)
		{
			System.out.print("오늘은 몇월? : ");
			month = scan.nextInt();
			System.out.print("오늘은 몇일? : ");
			day = scan.nextInt();
			scan.nextLine();

			System.out.printf("오늘은 23년 %s월 %s일이 맞나요? \n", month, day);
			System.out.printf("예(y) 아니오(n) :");
			answer = scan.nextLine();

			switch (answer)
			{
			case "y":
				i = 100000;
				break;
			case "n":
				break;
			default:
			}
		}

		System.out.println("-------------------------------------");

		for (int i = 0; i < 10000; i = i + 1)
		{
			System.out.print("지금은 몇시?(24시간) :");
			hour = scan.nextInt();
			System.out.print("탑승자수 입력(정수) :");
			humanNumber = scan.nextInt();
			System.out.print("이동거리 입력(0.0KM) :");
			km = scan.nextDouble();
			scan.nextLine();

			if (km > 1.6)
				fare = BASICFARE + (int) ((km - 1.6) / 0.131) * 100;
			else
				fare = BASICFARE;

			switch (hour)
			{
			case 22, 2, 3, 4:
				fare = (int) (fare * EXTRA_CHARGE1); // 할증 1.2배
				break;
			case 23, 24, 0, 1:
				fare = (int) (fare * EXTRA_CHARGE2); // 할증 1.4배
				break;
			default:
			}

			aloneFare = fare / humanNumber;
			totalIncome = totalIncome + fare;
			totalhuman = totalhuman + humanNumber;
			count = count + 1;
			totalKm = totalKm + km;

			// 4. 출력
			System.out.println("-------------------------------------");
			System.out.println("                영수증");
			System.out.println();
			System.out.printf("시간  	: 23년 %d월 %d일 %d시\n", month, day, hour);
			System.out.printf("탑승자수	: %d명\n", humanNumber);
			System.out.printf("이동거리	: %.1fKM \n", km);
			System.out.printf("총 요금	: %d원\n", fare);
			System.out.printf("각자낼돈	: %.0f원\n", aloneFare);
			switch (hour)
			{
			case 22, 2, 3, 4:
				System.out.println("	*할증요금 1.2배");
				break;
			case 23, 24, 0, 1:
				System.out.println("	*할증요금 1.4배");
				break;
			default:
			}
			System.out.println("-------------------------------------");

			// 입력, 연산, 처리
			System.out.printf("영업을 끝낼까요(y/n) :");
			answer = scan.nextLine();
			System.out.println("-------------------------------------");

			switch (answer)
			{
			case "y":
				i = 100000;
				break;
			case "n":
				break;
			default:
			}
		} // end of for

		// 5. 종료(자원반납)
		scan.close();
		System.out.println("                합계");
		System.out.printf("날짜	: 23년 %d월 %d일\n", month, day);
		System.out.printf("영업수	: %d회\n", count);
		System.out.printf("총수입	: %d회\n", totalIncome);
		System.out.printf("총탑승자수	: %d회\n", totalhuman);
		System.out.printf("총이동거리	: %.2fkm\n", totalKm);
		System.out.println("-------------------------------------");
		System.out.println("종료");

	}
}
