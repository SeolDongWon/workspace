package ch01.sec20;

import java.util.Scanner;

public class FruitCalculate
{ // 상수(클래스상수,정적멤버상수)
//	public static final int APPLE_PRICE = 1000, PEAR_PRICE = 1500, BANANA_PRICE = 3000, GRAPE_PRICE = 4000,WATERMELON_PRICE = 10000;
	public static final String[] FRUIT_NAME = { "사과", "배", "바나나", "포도", "수박" };
	public static final int[] PRICE = { 1000, 1500, 3000, 4000, 10000 };

	public static void main(String[] args)
	{
		// 1. 변수선언 이름, 전화번호, 구매유무, 품목추가, 가격합계
		Scanner scan = new Scanner(System.in);
		String name = null, number = null, answer = null;
		String fruitItem = null;
		int sumPrice = 0;
		fruitItem = "";

		// 2. 입력 이름과 전화번호 입력
		for (int i = 0; i < 2; i++)
		{

			System.out.printf("이름을 입력하세요");
			name = scan.nextLine();
			System.out.printf("전화번호를 입력하세요");
			number = scan.nextLine();

			for (int j = 0; j < 5; j++)
			{
				// 사과 구입여부
				System.out.printf("%s를 구입하시겠습니까?(Y/N)", FRUIT_NAME[j]);
				answer = scan.next();
				answer = answer.toUpperCase();

				if (answer.equals("Y"))
				{
					sumPrice = sumPrice + PRICE[j];
					fruitItem = fruitItem + FRUIT_NAME[j] + ",";
					System.out.printf("%s를 구입하셨습니다.", FRUIT_NAME[j]);
				} else
				{
					System.out.printf("%s를 구입하지 않으셨습니다.", FRUIT_NAME[j]);
				}
				System.out.printf("누적금액:%d\n", sumPrice);
			}//end of for j
			// 사과 구입여부
//		System.out.printf("사과를 구입하시겠습니까?(Y/N)");
//		answer = scan.next();
//		answer = answer.toUpperCase();
//
//		if (answer.equals("Y"))
//		{
//			sumPrice = sumPrice + APPLE_PRICE;
//			fruitItem = fruitItem + "사과,";
//			System.out.printf("%s를 구입하셨습니다.", "사과");
//		} else
//		{
//			System.out.printf("%s를 구입하지 않으셨습니다.", "사과");
//		}
//		System.out.printf("누적금액:%d\n", sumPrice);
//
//		// 배 구입여부
//
//		System.out.printf("배를 구입하시겠습니까?(Y/N)");
//		answer = scan.next();
//		answer = answer.toUpperCase();
//
//		if (answer.equals("Y"))
//		{
//			sumPrice = sumPrice + PEAR_PRICE;
//			fruitItem = fruitItem + "배,";
//			System.out.printf("%s를 구입하셨습니다.", "배");
//		} else
//		{
//			System.out.printf("%s를 구입하지 않으셨습니다.", "배");
//		}
//		System.out.printf("누적금액:%d\n", sumPrice);
//
//		// 바나나 구입여부
//		System.out.printf("바나나를 구입하시겠습니까?(Y/N)");
//		answer = scan.next();
//		answer = answer.toUpperCase();
//
//		if (answer.equals("Y"))
//		{
//			sumPrice = sumPrice + BANANA_PRICE;
//			fruitItem = fruitItem + "바나나,";
//			System.out.printf("%s를 구입하셨습니다.", "바나나");
//		} else
//		{
//			System.out.printf("%s를 구입하지 않으셨습니다.", "바나나");
//		}
//		System.out.printf("누적금액:%d\n", sumPrice);
//
//		// 포도 구입여부
//		System.out.printf("포도를 구입하시겠습니까?(Y/N)");
//		answer = scan.next();
//		answer = answer.toUpperCase();
//
//		if (answer.equals("Y"))
//		{
//			sumPrice = sumPrice + GRAPE_PRICE;
//			fruitItem = fruitItem + "포도,";
//			System.out.printf("%s를 구입하셨습니다.", "포도");
//		} else
//		{
//			System.out.printf("%s를 구입하지 않으셨습니다.", "포도");
//		}
//		System.out.printf("누적금액:%d\n", sumPrice);
//
//		// 수박 구입여부
//		System.out.printf("수박을 구입하시겠습니까?(Y/N)");
//		answer = scan.next();
//		answer = answer.toUpperCase();
//
//		if (answer.equals("Y"))
//		{
//			sumPrice = sumPrice + WATERMELON_PRICE;
//			fruitItem = fruitItem + "수박,";
//			System.out.printf("%s를 구입하셨습니다.", "수박");
//		} else
//		{
//			System.out.printf("%s를 구입하지 않으셨습니다.", "수박");
//		}
//		System.out.printf("누적금액:%d\n", sumPrice);

			// 버퍼지우기
			scan.nextLine();

			// 출력

			System.out.printf("고객%d 이름: %s ", 1, name);
			System.out.printf("고객번호: %s ", number);
			System.out.printf("산 품목: %s ", fruitItem);
			System.out.printf("총 가격: %d원 ", sumPrice);
			System.out.println("\n******************************************************************************");
		}//end of for i
		// 종료
		scan.close();
		System.out.println("종료");

	}
}
