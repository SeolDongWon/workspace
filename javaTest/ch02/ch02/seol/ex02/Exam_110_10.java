// 두 개의 원이 서로 겹치는지 판단
package ch02.seol.ex02;

import java.util.Scanner;

public class Exam_110_10
{
	public static void main(String[] args)
	{
//	1 변수
		Scanner scan = new Scanner(System.in);
		double circleCenterX1 = 0.0, circleCenterY1 = 0.0, radius1 = 0.0; // 원1의 중심 x좌표, 원1의 중심 y좌표, 원1의 반지름
		double circleCenterX2 = 0.0, circleCenterY2 = 0.0, radius2 = 0.0; // 원2의 중심 x좌표, 원2의 중심 y좌표, 원2의 반지름
		double lengthX = 0.0, lengthY = 0.0, lengthLine = 0.0; // x좌표의 거리, y좌표의 거리, (x,y)좌표의 거리
		boolean isIn = false; // 두 개의 원이 서로 겹치는지 판단
//	2 입력
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		circleCenterX1 = scan.nextDouble();
		circleCenterY1 = scan.nextDouble();
		radius1 = scan.nextDouble();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		circleCenterX2 = scan.nextDouble();
		circleCenterY2 = scan.nextDouble();
		radius2 = scan.nextDouble();
		scan.nextLine();
//	3 연산
		lengthX = circleCenterX1 - circleCenterX2; // 두 원의 중심의 x좌표상의 거리
		lengthY = circleCenterY1 - circleCenterY2; // 두 원의 중심의 y좌표상의 거리
		lengthLine = Math.sqrt(lengthX * lengthX + lengthY * lengthY); // 두 원의 중심의 직선거리를 피타고라스 정리를 이용해 구한다
		if (lengthLine < radius1 + radius2) // 두 원의 중심 사이의 직선거리가 두 원의 반지름의 합보다 작다면
		{
			isIn = true; // 두 원은 겹친다
		}
		else
		{
			isIn = false; // 그렇지 않으면 두 원은 안겹친다
		}
//	4 출력
		System.out.printf("두 원은 서로 %s", (isIn) ? ("겹친다") : ("안겹친다"));
//	5 종료
		scan.close();
		System.out.println("\n종료");
	}
}

