package Test0817;

import java.util.Scanner;

public class TaxiFare7
{
	public static final int BASICFARE = 4800, ADDFARE = 100; // 기본요금, 추가요금

	public static void main(String[] args)
	{
		// 1. 변수 선언 (입력,날짜,탑승자수,거리,총요금,추가요금,각자낼돈)
		// 2. 변수 초기값 선언
		Scanner scan = new Scanner(System.in);
		String answer = null;
		int humanNumber = 0, totalhuman = 0, fare = 0, totalIncome = 0;
		int month = 0, day = 0, hour = 0, count = 0;
		double aloneFare = 0.0, km = 0.0, extracharge = 0.0;

		// 3. 입력
		// 정보 출력하기
		System.out.println("-------------------------------------");
		System.out.printf("기본요금 : 1.6km이내 %d원\n", BASICFARE);
		System.out.printf("추가요금 : 1.6km이후 131m마다 %d원 추가\n", ADDFARE);
		System.out.println("-------------------------------------");

		// 날짜 정하기
		for (int i = 0; i < 10000; i = i + 1)
		{ // 날짜 입력하기
			System.out.print("오늘 몇월? : ");
			month = scan.nextInt();
			System.out.print("오늘 몇일? : ");
			day = scan.nextInt();
			scan.nextLine(); //clear input buffer
			// 날짜 확인하기
			System.out.printf("날짜확인 : 23년 %s월 %s일\n", month, day);
			System.out.printf("예(y) 아니오(아무키) :");
			answer = scan.nextLine(); 

			switch (answer)
			{
			case "y":
				i = 10000;
			}
		} // end of for

		System.out.println("-------------------------------------");

		// 영업 시작하기
		for (int i = 0; i < 10000; i = i + 1)
		{
			System.out.print("지금 몇시?(24시간) :");
			hour = scan.nextInt();
			System.out.print("탑승자수 입력(정수) :");
			humanNumber = scan.nextInt();
			System.out.print("이동거리 입력(0.0KM) :");
			km = scan.nextDouble();
			scan.nextLine(); //clear input buffer

			// 4. 연산, 처리
			switch (hour) // 할증 있나 없나 
			{
			case 22, 2, 3, 4: // 22~23시,02~04시 할증 1.2배
				extracharge = 1.2;
				break;
			case 23, 24, 0, 1: // 23~02시 할증 1.4배
				extracharge = 1.4;
				break;
			default:
				extracharge = 1.0;
			}
			// 요금 계산하기
			if (km > 1.6) // 1.6km를 넘어가면 131m마다 100원 추가
				fare = (int) (extracharge * (BASICFARE + (int) ((km - 1.6) / 0.131) * 100));
			else // 1.6km 이내는 기본요금으로 고정
				fare = (int) (extracharge * (BASICFARE));
			
			aloneFare = fare / humanNumber; //각자낼돈 계산하기

			totalIncome = totalIncome + fare;
			totalhuman = totalhuman + humanNumber;
			count = count + 1;

			// 4. 출력
			System.out.println("-------------------------------------");
			System.out.println("                영수증");
			System.out.println();
			System.out.printf("시간  	: 23년 %d월 %d일 %d시\n", month, day, hour);
			System.out.printf("탑승자수	: %d명\n", humanNumber);
			System.out.printf("이동거리	: %.1fKM \n", km);
			System.out.printf("총 요금	: %d원\n", fare);
			System.out.printf("각자낼돈	: %.0f원\n", aloneFare);
			System.out.printf("*할증요금	: %.0f%%\n", (extracharge - 1) * 100);
			System.out.println("-------------------------------------");

			// 입력, 연산, 처리
			System.out.printf("오늘 영업종료 \n예(y) 아니오(아무키) :");
			answer = scan.nextLine();
			System.out.println("-------------------------------------");

			switch (answer)
			{
			case "y":
				i = 100000;
			}
		} // end of for

		// 5. 종료(자원반납)
		scan.close();
		System.out.println("                합계");
		System.out.printf("날짜	: 23년 %d월 %d일\n", month, day);
		System.out.printf("영업수	: %d회\n", count);
		System.out.printf("총수입	: %d원\n", totalIncome);
		System.out.printf("총탑승자수	: %d명\n", totalhuman);
		System.out.println("-------------------------------------");
		System.out.println("종료");
	}
}
//-----------------문제점---------------
//1. 시간을 거슬러 올라갈 수 있다
//		현재 16시 입력하고 다음 번에 15시 입력이 가능하다 == 시간을 거슬러간다
//		16시를 입력하면 다음은 16시 이전을 입력할 수 없어야 정상	
//2. 1번을 구현하면 0시를 넘을 때 다음 날짜로 넘어가야 한다
//3. 2번을 구현하면 날짜가 넘어갈 때 총수입의 날짜 출력도 바꿔야한다.
