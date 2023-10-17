package ch04.exam12_2;

import java.util.InputMismatchException;
import java.util.Scanner;

import ch04.exam12.Shits;

public class ConcertMain
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		int choice = 0;
		boolean flag = false;

		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		Concert concert = new Concert();

		while (!flag)
		{
			System.out.printf("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			try
			{
				choice = scan.nextInt();
			} catch (InputMismatchException e)
			{
				scan.nextLine();
				System.out.println("올바른 숫자를 입력해주세요\n");
				continue;
			}

			switch (choice)
			{
			case 1:
				reserve(concert);
				break;
			case 2:
				inquiry(concert);
				break;
			case 3:
				cancle(concert);
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

	// 예약취소
	private static void cancle(Concert concert)
	{
		System.out.printf("좌석구분 S(1), A(2), B(3)>>");
		int num = scan.nextInt();

		switch (num)
		{
		case 1:
			concert.printS();
			break;
		case 2:
			concert.printA();
			break;
		case 3:
			concert.printB();
			break;
		}

		System.out.printf("이름>>");
		String name = scan.next();
		boolean findFlag = false;

		switch (num)
		{
		case 1:
			String[] s = concert.getS();
			for (int i = 0; i < s.length; i++)
			{
				if (s[i] != null && s[i].equals(name))
				{
					s[i] = null;
					findFlag = true;
				}
			}
			if (findFlag == false)
			{
				System.out.printf("%s 이름이 예약테이블에 없습니다.\n", name);
			}
			findFlag = false;
			break;
		case 2:
			String[] a = concert.getA();
			for (int i = 0; i < a.length; i++)
			{
				if (a[i] != null && a[i].equals(name))
				{
					a[i] = null;
					findFlag = true;
				}
			}
			if (findFlag == false)
			{
				System.out.printf("%s 이름이 예약테이블에 없습니다.\n", name);
			}
			findFlag = false;
			break;
		case 3:
			String[] b = concert.getB();
			for (int i = 0; i < b.length; i++)
			{
				if (b[i] != null && b[i].equals(name))
				{
					b[i] = null;
					findFlag = true;
				}
			}
			if (findFlag == false)
			{
				System.out.printf("%s 이름이 예약테이블에 없습니다.\n", name);
			}
			findFlag = false;
			break;
		}

	}

	// 전좌석 출력
	private static void inquiry(Concert concert)
	{
		concert.printS();
		concert.printA();
		concert.printB();
	}

	public static void reserve(Concert concert)
	{
		try
		{
			System.out.printf("좌석구분 S(1), A(2), B(3)>>");
			int num = scan.nextInt();

			switch (num)
			{
			case 1:
				concert.printS();
				break;
			case 2:
				concert.printA();
				break;
			case 3:
				concert.printB();
				break;
			}

			System.out.printf("이름>>");
			String name = scan.next();
			System.out.printf("좌석번호>>");
			int shitNum = scan.nextInt();

			switch (num)
			{
			case 1:
				String[] s = concert.getS();

				if (s[shitNum - 1] != null)
				{
					System.out.println("이미 예약된 좌석입니다\n.");
				} else
				{
					s[shitNum - 1] = name;
				}
				break;
			case 2:
				String[] a = concert.getA();

				if (a[shitNum - 1] != null)
				{
					System.out.println("이미 예약된 좌석입니다\n.");
				} else
				{
					a[shitNum - 1] = name;
				}
				break;
			case 3:
				String[] b = concert.getB();

				if (b[shitNum - 1] != null)
				{
					System.out.println("이미 예약된 좌석입니다\n.");
				} else
				{
					b[shitNum - 1] = name;
				}

				break;
			default:
				System.out.printf("올바른 번호를 선택해주세요.\n");
				break;
			}

		} catch (Exception e)
		{
			scan.nextLine();
			System.out.println("올바른 숫자를 입력해주세요.\n");

		}
	}
}
