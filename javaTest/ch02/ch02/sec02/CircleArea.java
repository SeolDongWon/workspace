package ch02.sec02;

import java.util.Scanner;

public class CircleArea
{
	public static final double PI = 3.14;

	public static void main(String[] args)
	{
//1	변수 - 입력변수, 반지름길이
		Scanner scan = new Scanner(System.in);
		double radius = 0.0; // 원의 반지름
		double cicleArea = 0.0; // 원의 면적

//2	입력	
		System.out.print("원의 반지름의 길이를 입력하세요 ");
		radius = scan.nextDouble();
		scan.nextLine();

//3 연산 
		cicleArea = radius * radius * PI; // 원의 면적 계산

//4 출력
		System.out.printf("원의 면적 = %.1f\n", cicleArea);

//5 종료
		scan.close();
		System.out.println("END");
	}

}
