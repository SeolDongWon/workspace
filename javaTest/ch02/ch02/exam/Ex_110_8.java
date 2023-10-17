// 입력한 두 점이 사각형 안에 있으면 충돌로 판정한다. 또한 한점도 있어도 충돌로 판정한다.
// 두점 모두가 사각형 안에 없으면 충돌이 아니라고 판정한다.
package ch02.exam;

import java.util.Scanner;

public class Ex_110_8
{
//	상수
	public static final int RECT_X1 = 100, RECT_Y1 = RECT_X1, REXT_X2 = 200, REXT_Y2 = REXT_X2;

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

	public static void main(String[] args)
	{
//	1	변수선언 초기값
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		boolean isCheck1 = false, isCheck2 = false, isCheck3 = false, isCheck4 = false;

//	2 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("x1 y1 x2 y2 :>>>");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();

//	3 연산
		isCheck1 = inRect(x1, y1, RECT_X1, RECT_Y1, REXT_X2, REXT_Y2);
		isCheck2 = inRect(x2, y2, RECT_X1, RECT_Y1, REXT_X2, REXT_Y2);
		isCheck3 = inRect(x1, y2, RECT_X1, RECT_Y1, REXT_X2, REXT_Y2);
		isCheck4 = inRect(x2, y1, RECT_X1, RECT_Y1, REXT_X2, REXT_Y2);

		// System.out.printf("isChek1 = %b %n",isCheck1);

		if (isCheck1 || isCheck2 || isCheck3 || isCheck4)
		{
			System.out.println("충돌이 났음을 판명한다.");
		} else
		{
			System.out.println("충돌이 나지 않았다.");
		}

//	4 종료
		scan.close();
		System.out.println("The End");

	}
}
