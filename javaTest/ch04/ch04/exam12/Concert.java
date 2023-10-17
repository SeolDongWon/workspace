package ch04.exam12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Concert
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		boolean flag = false;
		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		Shits shit = new Shits();

		while (!flag)
		{
			System.out.printf("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			try
			{
				choice = scan.nextInt();
			} catch (InputMismatchException e)
			{
				scan.nextLine();
				System.out.println("올바른 숫자를 입력해주세요");
				continue;
			}
			switch (choice)
			{
			case 1:
				shit.reserve();
				break;
			case 2:
				shit.inquiry();
				break;
			case 3:
				shit.cancle();
				break;
			case 4:
				flag = true;
				break;
			default:
				System.out.println("1~4의 숫자를 입력하세요");
			}
		}
		scan.close();
		System.out.println("시스템을 종료합니다");
	}

}
