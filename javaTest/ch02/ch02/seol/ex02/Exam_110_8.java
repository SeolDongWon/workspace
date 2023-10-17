// (100,100),(200,200)사각형 안에 임의의 사각형이 들어가는지 판단
package ch02.seol.ex02;

import java.util.Scanner;

public class Exam_110_8
{
	// 상수 - 직사각형을 만드는 두 점의 좌표 (100,100)과 (200,200)
	public static int FIX_X_1 = 100, FIX_Y_1 = 100; // 점 (100,100)
	public static int FIX_X_2 = 200, FIX_Y_2 = 200; // 점 (200,200)
//		힌트메소드 - 점 (x,y)가 직사각형(100,100),(200,200) 안에 있는지 판단

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
	{
		if ((rectx2 >= x && x >= rectx1) && (recty2 >= y && y >= recty1))
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
//		1. 변수
		Scanner scan = new Scanner(System.in);
		int xLocation1 = 0, yLocation1 = 0; // 점 (x1,y1)
		int xLocation2 = 0, yLocation2 = 0; // 점 (x2,y2)
		boolean isIn1 = false; // 점(x1,y1)이 두 점 (100,100), (200,200)으로 만든 직사각형의 면적 안에 들어가는지 판단
		boolean isIn2 = false; // 점(x2,y2)이 두 점 (100,100), (200,200)으로 만든 직사각형의 면적 안에 들어가는지 판단
//		2. 입력
		System.out.print("점 (x1, y1)의 좌표를 정수로 입력\n*x1과 y1사이는 공백으로 구분*\n");
		xLocation1 = scan.nextInt();
		yLocation1 = scan.nextInt();
		System.out.print("점 (x2, y2)의 좌표를 정수로 입력\n*x2과 y2사이는 공백으로 구분*\n");
		xLocation2 = scan.nextInt();
		yLocation2 = scan.nextInt();
		scan.nextLine();
//		3. 연산	- 두 연산이 둘 다 참이거나 둘 다 거짓이면 두 점(x1,y1),(x2,y2)로 만든 직사각형은 두 점 (100,100),(200,200)으로 만든 직사각형과 충돌하지 않는다
		isIn1 = inRect(xLocation1, yLocation1, FIX_X_1, FIX_Y_1, FIX_X_2, FIX_Y_2);
		isIn2 = inRect(xLocation2, yLocation2, FIX_X_1, FIX_Y_1, FIX_X_2, FIX_Y_2);
//		4. 출력
		System.out.printf("두 점 (100,100),(200,200)으로 만든 직사각형과 \n두 점 (%d,%d),(%d,%d)으로 만든 직사각형은 충돌%s", xLocation1,
				yLocation1, xLocation2, yLocation2, (isIn1 ^ isIn2) ? ("한다.") : ("안한다."));
//		5. 종료		
		scan.close();
		System.out.println("\n종료");
	}
}
