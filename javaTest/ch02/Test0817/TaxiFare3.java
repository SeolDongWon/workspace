package Test0817;

import java.util.Scanner;

public class TaxiFare3 {
    public static final int BASICFARE = 10000, ADDFARE = 800;

    public static void main(String[] args) {
	// 1. 변수 선언 (입력객체,날짜,탑승자수,거리,총요금,추가요금,뿜빠이)
	// 2. 변수 초기값 선언
	Scanner scan = new Scanner(System.in);
	String answer1 = null, answer2 = null; // 날짜 확인
	int humanNum = 0, totalFare = 0, month = 0, day = 0; // 탑승자 수 , 총 요금, 월, 일
	int totalIncome=0, totalhuman=0;
	double aloneFare = 0.0, km = 0.0; // 각자낼돈, 거리

	System.out.printf("기본요금 : 5km이내 %d원\n", BASICFARE);
	System.out.printf("추가요금 : 5km부터 %d원 추가, 1km마다 반복\n", ADDFARE);
	System.out.println();

	// 3. 연산, 처리
	answer1 = "n";

	for (int i = 0; i < 10000; i = i + 1) {
	    if (day > 0) {
		System.out.printf("오늘은 23년 %s월 %s일이 맞나요? 예:y 아니오:n\n", month, day);
		answer1 = scan.nextLine();
	    }
	    switch (answer1) {
	    case "y":
		break;

	    case "n":

	    default:
		System.out.print("오늘은 몇월? : ");
		month = scan.nextInt();
		System.out.print("오늘은 몇일? : ");
		day = scan.nextInt();
	    } // end of switch

	    System.out.print("탑승자 수 입력(정수) :");
	    humanNum = scan.nextInt();
	    System.out.print("이동거리 입력(KM단위,실수) :");
	    km = scan.nextDouble();
	    scan.nextLine();

	    if (km > 4.0)
		totalFare = BASICFARE + ((int) km - 4) * 800;
	    else
		totalFare = BASICFARE;

	    aloneFare = totalFare / humanNum;
	    totalIncome = totalIncome+totalFare;
	    totalhuman = totalhuman+humanNum;

	    // 4. 출력
	    System.out.println();
	    System.out.println("영수증");
	    System.out.printf("날짜  	: 23년 %d월 %d일\n", month, day);
	    System.out.printf("탑승자 수	: %d명\n", humanNum);
	    System.out.printf("이동거리	: %.1fKM \n", km);
	    System.out.printf("총 요금	: %d원\n", totalFare);
	    System.out.printf("각자낼돈	: %.0f원\n", aloneFare);
	    System.out.println();
	    
	    System.out.println("영업종료할까요(y/n)");
	    answer2 = scan.nextLine();
	    switch(answer2) {
	    case"y":
		System.out.printf("영업횟수 : %d회\n", i);
		System.out.printf("총수입	  : %d회\n", totalIncome);
		System.out.printf("탑승자 수: %d회\n", totalhuman);
		i = 100000;
		break;
	    case"n": break;
	    default:
	    }
	    
	} // end of for

	// 5. 종료(자원반납)
	scan.close();
	System.out.println("종료");

    }

}
