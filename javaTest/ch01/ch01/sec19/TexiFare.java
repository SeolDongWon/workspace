package ch01.sec19;

import java.util.Scanner;

public class TexiFare
{ // 상수(클래스변수,정적멤버변수,클래스상수)
	public static final int BASIC_FARE = 4800/* 기본요금 */, ADD_FARE = 100/* 추가요금 */;

	public static void main(String[] args)
	{
		// 1. 변수 선언 (입력,날짜,탑승자수,거리,총요금,추가요금,각자낼돈,계속유무,)
		// 인원수, 요금, 달, 일, 시간,운행횟수, 각자요금, 총거리, 할증요
		// 2. 변수 초기값 선언
		Scanner scan = new Scanner(System.in);
		String answer = null;
		int humanNumber = 0, totalhuman = 0, fare = 0, totalFare = 0;
		int month = 0, day = 0, hour = 0, count = 0;
		double aloneFare = 0.0, km = 0.0, extracharge = 0.0;

		// 3. 입력
		// 정보 출력하기
		for (; true;)
		{

			System.out.println("-------------------------------------");
			System.out.printf("기본요금 : 1.6km이내 %d원\n", BASIC_FARE);
			System.out.printf("추가요금 : 1.6km이후 131m마다 %d원 추가\n", ADD_FARE);
			System.out.println("-------------------------------------");

			// 날짜 정하기
			// 날짜 입력하기
			for (; true;)
			{
				System.out.print("오늘 몇월? : ");
				month = scan.nextInt();
				System.out.print("오늘 몇일? : ");
				day = scan.nextInt();
				scan.nextLine(); // clear input buffer
				// 날짜 확인하기
				System.out.printf("날짜확인 : 23년 %s월 %s일\n", month, day);
				System.out.printf("맞아요(yes) 틀려요(no) :");
				answer = scan.nextLine();
				answer = answer.toUpperCase();
				if (answer.equals("YES"))
				{
					break;
				}
			} // end of for

			System.out.println("-------------------------------------");

			// 영업 시작하기

			System.out.print("지금 몇시?(24시간) :");
			hour = scan.nextInt();
			System.out.print("탑승자수 입력(정수) :");
			humanNumber = scan.nextInt();
			System.out.print("이동거리 입력(0.0KM) :");
			km = scan.nextDouble();
			scan.nextLine(); // clear input buffer

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
				fare = (int) (extracharge * (BASIC_FARE + (int) ((km - 1.6) / 0.131) * 100));
			else // 1.6km 이내는 기본요금으로 고정
				fare = (int) (extracharge * (BASIC_FARE));

			aloneFare = fare / humanNumber; // 각자낼돈 계산하기

			totalFare = totalFare + fare; // 요금누적
			totalhuman = totalhuman + humanNumber; // 인원수누적
			count = count + 1; // 운행횟수 누적

			// 4. 출력
			System.out.println("-------------------------------------");
			System.out.println("                영수증");
			System.out.println();
			System.out.printf("시간  	: 23년 %d월 %d일 %d시\n", month, day, hour);
			System.out.printf("탑승자수	: %d명\n", humanNumber);
			System.out.printf("이동거리	: %.1fKM \n", km);
			System.out.printf("개인총요금	: %d원\n", fare);
			System.out.printf("각자낼돈	: %.0f원\n", aloneFare);
			System.out.printf("*할증요금	: %.0f%%\n", (extracharge - 1) * 100);
			System.out.println("-------------------------------------");

			// 입력, 연산, 처리
			System.out.printf("오늘 영업종료 \n예(yes) 아니오(no) :");
			answer = scan.nextLine();
			System.out.println("-------------------------------------");

			if (answer.equals("YES"))
			{
				break;
			}

		} // end of for

		// 5. 종료(자원반납)
		System.out.println("                합계");
		System.out.printf("날짜	: 23년 %d월 %d일\n", month, day);
		System.out.printf("영업수	: %d회\n", count);
		System.out.printf("총수입	: %d원\n", totalFare);
		System.out.printf("총탑승자수	: %d명\n", totalhuman);
		System.out.println("-------------------------------------");
		scan.close();
		System.out.println("종료");
	}
}
