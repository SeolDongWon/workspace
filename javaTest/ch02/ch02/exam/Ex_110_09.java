package ch02.exam;

import java.util.Scanner;

public class Ex_110_09
{
	public static void main(String[] args)
	{
//	1 변수선언 및 초기값
		int x1 = 0, y1 = 0, radius = 0, x2 = 0, y2 = 0;
		double distance = 0.0;

//	2 입력
		Scanner scan = new Scanner(System.in);
		System.out.printf("원의 중심과 반지름 입력:");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		radius = scan.nextInt();
		System.out.printf("다른 점 입력:");
		x2 = scan.nextInt();
		y2 = scan.nextInt();

//	3 연산 두 점 사이 거리
		distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		if (distance < radius)
		{
			System.out.printf("점(%d,%d)는 %s\n",x2,y2,"원안에 점이 있다.");
		} else
		{
			System.out.printf("점(%d,%d)는 %s\n",x2,y2,"원안에 점이 없다.");
		}

//	5 종료
		scan.close();
		System.out.println("The End");
	}
}
