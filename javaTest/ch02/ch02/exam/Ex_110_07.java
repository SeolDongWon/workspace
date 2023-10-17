// (x,y)가 (100,100)과 (200,200)사이에 존재하는지 조사하는 프로그램
package ch02.exam;

import java.util.Scanner;

public class Ex_110_07
{
	public static void main(String[] args)
	{
		// 1. 변수 선언 입력받을 x,y좌표 사각형안에 있는지 확인 checkBox
		int x = 0, y = 0;
		String checkBox = "사각형 안에 없습니다.";

		// 2. 입력 및 연산처리
		Scanner scan = new Scanner(System.in);
		System.out.printf("점 x,y의 좌표를 입력하시오");
		x = scan.nextInt();
		y = scan.nextInt();

		// 3 연산처리
		if (x <= 200 && x >= 100)
		{
			if (y <= 200 && y >= 100)
			{
				checkBox = "사각형 안에 있습니다";
			}
		}

		// 4 출력
		System.out.printf("(%d,%d)는 %s\n", x, y, checkBox);
		// 3. 종료
		scan.close();
		System.out.println("종료");

	}
}
