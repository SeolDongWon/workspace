// 임의의 점이 임의의 원 내부에 있는지 확인
package ch02.seol.ex02;

import java.util.Scanner;

public class Exam_110_9
{
	public static void main(String[] args)
	{
//	1. 변수
		Scanner scan = new Scanner(System.in);
		double circleCenterX = 0.0, circleCenterY = 0.0, radius = 0.0; // 원의 중심 x좌표, 원의 중심 y좌표, 원의 반지름
		double locationX = 0, locationY = 0; // 점의 x좌표, 점의 y좌표
		double lengthX = 0.0, lengthY = 0.0, lengthLine = 0.0; // x좌표의 거리, y좌표의 거리, (x,y)좌표의 거리
		boolean isIn = false; // 원 안에 있는지 밖에 있는지 판단
//	2. 입력
		System.out.print("원의 중심과 반지름 입력>> ");
		circleCenterX = scan.nextDouble();
		circleCenterY = scan.nextDouble();
		radius = scan.nextDouble();
		System.out.print("점 입력>>");
		locationX = scan.nextDouble();
		locationY = scan.nextDouble();
		scan.nextLine();
//	3. 연산
		lengthX = circleCenterX - locationX; // 원과 중심과 점의 x좌표의 거리
		lengthY = circleCenterY - locationY; // 원의 중심과 점의 y좌표의 거리
		lengthLine = Math.sqrt(lengthX * lengthX + lengthY * lengthY); // 원의 중심과 점의 거리를 피타고라스 정리를 이용해 구한다
		if (lengthLine <= radius) // 원의 중심과 점 사이의 거리가 원의 반지름보다 작다면
		{
			isIn = true; // 점은 원의 점위 안에 들어간다
		} else
		{
			isIn = false; // 그렇지 않으면 점은 원의 점위 안에 안들어간다
		}
//	4. 출력
		System.out.printf("점 (%.1f, %.1f)는 원 안에 %s\n", locationX, locationY, (isIn) ? ("있다.") : ("없다."));
//	5. 종료
		scan.close();
		System.out.println("\n종료");
	}
}
