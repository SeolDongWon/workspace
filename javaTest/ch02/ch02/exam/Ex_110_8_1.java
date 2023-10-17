// 입력한 두 점이 사각형 안에 있으면 충돌로 판정한다. 또한 한점만 있어도 충돌로 판정한다.
// 두점 모두가 사각형 안에 없으면 충돌이 아니라고 판정한다.
package ch02.exam;

import java.util.Scanner;

public class Ex_110_8_1
{
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
	{
		if ((rectx1 <= x && x <= rectx2) && (recty1 <= y && y <= recty2))
		{
			return true;
		} else
		{
			return false;
		}
	}

	public static final int RECTX1 = 100, RECTY1 = 100, RECTX2 = 200, RECTY2 = 200;

	public static void main(String[] args)
	{
		// 1 변수선언 - (x1,y1),(x2,y2)
		// 2 변수초기값설정
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		boolean result1 = false, result2 = false;

		// 2 입력
		Scanner scan = new Scanner(System.in);
		System.out.printf("x1 y1 x2 y2 >>");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();

		// 3 연산, 처리
		result1 = inRect(x1, y1, RECTX1, RECTY1, RECTX2, RECTY2);
		result2 = inRect(x2, y2, RECTX1, RECTY1, RECTX2, RECTY2);
		
		// 4 출력
		if (result1 || result2)
		{
			System.out.printf("충돌발생");
		} else
		{
			System.out.printf("충돌발생안함");
		}

		// 5 종료
		scan.close();
		System.out.printf("\nEND");
	}
}
