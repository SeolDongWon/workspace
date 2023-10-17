package ch04.sec04;

import java.util.Scanner;

public class Main
{
	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		int num = 0;
		for (; true;)
		{
			System.out.printf("계산할 수 입력(-1은 종료, 최대10)");
			try
			{
				num = scan.nextInt();
			} catch (Exception e)
			{
			} finally
			{
				scan.nextLine();
			}
			if (num == -1)
			{
				scan.close();
				System.out.printf("종료");
				return;
			} else if (0 < num && num < 11)
			{
				break;
			}
		}

		Rectangle[] rectangle = new Rectangle[num];

		for (int i = 0; i < rectangle.length; i++)
		{
			rectangle[i] = new Rectangle();
			System.out.printf("%d번째 사각형\n", i + 1);
			for (; true;)
			{
				System.out.printf("높이 입력(0~100)>>");
				try
				{
					rectangle[i].setHeight(scan.nextInt());
					if (0 < rectangle[i].getHeight() && rectangle[i].getHeight() < 11)
					{
						break;
					}
				} catch (Exception e)
				{

				} finally
				{
					scan.nextLine();
				}
			}
			for (; true;)
			{
				System.out.printf("너비 입력(0~100)>>");
				try
				{
					rectangle[i].setWidth(scan.nextInt());
					if (0 < rectangle[i].getWidth() && rectangle[i].getWidth() < 11)
					{
						break;
					}
				} catch (Exception e)
				{

				} finally
				{
					scan.nextLine();
				}
			}

			rectangle[i].calArea();
		}
		for (int i = 0; i < rectangle.length; i++)
		{
			System.out.printf("%d번째 도형의 넓이는 %s\n", i + 1, rectangle[i].getArea());
		}

		scan.close();
		System.out.printf("종료");
	}
}
