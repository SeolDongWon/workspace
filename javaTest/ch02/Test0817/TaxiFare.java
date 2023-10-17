package Test0817;

import java.util.Scanner;

public class TaxiFare {
    public static final int BASICFARE = 4000, ADDFARE = 800;

    public static void main(String[] args) {

	// 1. 변수 선언
	// 2. 변수 초기값 선언
	Scanner scan = new Scanner(System.in);

	String date = "0000-00-00";
	int humanNum = 0, totalFare = 0;
	double aloneFare = 0.0, km = 0.0;

	for (int i = 0; i < 3; i = i + 1) {

	    // 3. 연산, 처리
	    System.out.print("YY-MM-DD 형식으로 날짜를 입력하세요 : ");
	    date = scan.nextLine();
	    System.out.print("탑승자 수를 입력하세요 :");
	    humanNum = scan.nextInt();
	    System.out.print("km단위로 이동거리를 입력하세요 :");
	    km = scan.nextInt();
	    scan.nextLine();

	    if (km > 2.0)
		totalFare = BASICFARE + (int) km * 800;
	    else
		totalFare = BASICFARE;

	    aloneFare = totalFare / humanNum;

	    // 4. 출력
	    System.out.println();
	    System.out.println("영수증");
	    System.out.printf("날짜  	: %s\n", date);
	    System.out.printf("탑승자 수	: %d명\n", humanNum);
	    System.out.printf("이동거리	: %.1fKM \n", km);
	    System.out.printf("총 요금	: %d원\n", totalFare);
	    System.out.printf("더치페이	: %.0f원\n", aloneFare);
	    System.out.println();
	} // end of for

	// 5. 종료(자원반납)
	scan.close();
	System.out.println("종료");

    }

}
