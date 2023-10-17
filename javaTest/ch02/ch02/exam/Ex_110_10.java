package ch02.exam;

import java.util.Scanner;

public class Ex_110_10
{
	public static void main(String[] args)
	{
//	1 변수선언 및 초기값
		int x1 = 0, y1 = 0, radius1 = 0, x2 = 0, y2 = 0, radius2 = 0;
		double distance = 0.0;

//	2 입력
		Scanner scan = new Scanner(System.in);
		System.out.printf("원의 1번 중심과 반지름 입력:");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		radius1 = scan.nextInt();

		System.out.printf("원의 2번 중심과 반지름 입력:");
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		radius2 = scan.nextInt();

//	3 연산 - 두 원의 중심점으로 거리구하기
		distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		if (distance < (radius1 + radius2))
		{
			System.out.printf("%s\n", "두 원은 겹친다.");
		} else
		{
			System.out.printf("%s\n", "두 원은 겹치지 않는다.");
		}

//	5 종료
		scan.close();
		System.out.println("The End");
	}
}
