package ch04.sec03;

import java.util.Scanner;

public class main
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		int count = 0;

		//음식 수 입력
		for (; true;)
		{
			System.out.printf("음식수 입력(-1:종료)>>");
			try
			{
				count = scan.nextInt();
				break;
			} catch (Exception e)
			{
			} finally
			{
				scan.nextLine();
			}
		}
		
		// 음식 수에 -1을 입력하면 프로그램 종료
		if (count == -1)
		{
			scan.close();
			System.out.printf("END");
			return;
		}

		
		Circle[] circle = new Circle[count];

		for (int i = 0; i < circle.length; i++)
		{
			// 음식이름, 반지름 입력
			circle[i] = new Circle("name", 0);
			System.out.printf("이름입력>>");
			circle[i].setName(scan.next());
			
			for (; true;)
			{
				System.out.printf("반지름입력>>");
				try
				{
					circle[i].setRadius(scan.nextInt());
					if (circle[i].getRadius() == 0)
					{
						continue;
					}
					break;
				} catch (Exception e)
				{
				} finally
				{
					scan.nextLine();
				}
			}
			// 반지름계산
			circle[i].calArea();
		}

		// 출력
		for (int i = 0; i < circle.length; i++)
		{
			System.out.printf("반지름이 %d인 %s의 면적은 %s\n", circle[i].getRadius(), circle[i].getName(), circle[i].getArea());
		}
		scan.close();
		System.out.printf("\nEND");
	}
}
