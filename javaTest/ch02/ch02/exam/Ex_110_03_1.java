package ch02.exam;

import java.util.Scanner;

public class Ex_110_03_1
{
	public static final int 오만원 = 50_000;
	public static final int 만원 = 10_000;
	public static final int 천원 = 1000;
	public static final int 백원 = 100;
	public static final int 십원 = 10;
	public static final int 일원 = 1;

	public static void main(String[] args)
	{
//1	변수선언, 초기값(돈, 몫)
		int res = 0, money = 0;

//2 입력(돈입력)
		Scanner scan = new Scanner(System.in);
		System.out.print("input money>>>");
		money = scan.nextInt();

//3	연산
		res = money / 오만원;
		money = money - (오만원 * res);
		System.out.printf("%d권 %d매 \n", 오만원, res); // 오만원권 매수 표시

		res = money / 만원;
		money = money - (만원 * res);
		System.out.printf("%d권 %d매 \n", 만원, res); // 만원 매수 표시
		
		res = money / 천원;
		money = money - (천원 * res);
		System.out.printf("%d권 %d매 \n", 천원, res); // 천원 매수 표시
		
		res = money / 백원;
		money = money - (백원 * res);
		System.out.printf("%d권 %d매 \n", 백원, res); // 백원 매수 표시

		res= money/십원;
		money = money-(십원*res);
		System.out.printf("%d권 %d매 \n", 십원,res); // 십원 매수 표시
		
		res= money/일원;
		money = money-(일원*res);
		System.out.printf("%d권 %d매 \n", 일원,res); // 일원 매수 표시
		
		
		
		
		scan.close();

	}

}
