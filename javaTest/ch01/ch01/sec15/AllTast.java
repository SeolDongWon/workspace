package ch01.sec15;

//문제내용: 매장 인스타에서 팔로우를 체크하는데 할인받을 금액을 준다. 기본적인 매장 팔로우 수(10_000명)인데 
//매장 팔로우 수 보다 많으면, 많아진수에 (매장팔로우수 - 개인팔로우수) 팔로우 수의 30%를 할인 이벤트.
//(단! 5명제한)
import java.util.Scanner;

public class AllTast {
    // 상수선언(클래스변수)
    public static final double DISCOUNT_RATE = 0.3;
    public static final int STORE_FOLLOW = 10_000;

    public static void main(String[] args) {
	// 1. 변수선언 (name, age, yourfollow, STORE_FOLLOW, prize, discount)
	// 2. 변수초기값설정
	// 지역변수는 무조건 초기값을 설정한다(자바 가상머신이 지역변수는 초기화시키지 않는다.)
	Scanner scan = new Scanner(System.in);
	int age = 0;
	int yourFollow = 0;
	int margin = 0;
	double discount;
	String name = null, prize = null;

	// 3. 연산, 처리(이름,나이,개인팔로우입력,버퍼클리어,마진계산,상품당첨결정내용)
	for (int i = 0; i < 5; i++) {
	    System.out.print("이름 : ");
	    name = scan.nextLine();
	    System.out.print("나이 : ");
	    age = scan.nextInt();
	    System.out.print("개인 팔로우 : ");
	    yourFollow = scan.nextInt();
	    // 입력버퍼를 클리어
	    scan.nextLine();

	    margin = yourFollow - STORE_FOLLOW;
	    if (margin > 0) {
		prize = "당첨되었습니다!";
		discount = margin * DISCOUNT_RATE;
	    } else {
		prize = "다음기회에~";
		discount = 0;
	    }

	    // 4. 출력
	    System.out.printf("이름    : %s \n", name);
	    System.out.printf("나이    : %d \n", age);
	    System.out.printf("개인팔로 : %d \n", yourFollow);
	    System.out.printf("팔로우차 : %d \n", margin);
	    System.out.printf("담첨유무 : %s \n", prize);
	    System.out.printf("할인금액 : %f 원\f", discount);
	    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
	} // end of for
	  // 5. 종료
	  // systm.out.println("종료");
	scan.close();
	System.out.println("end");

    }
}
