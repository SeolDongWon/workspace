package ch04.Ex.Seol;

import java.util.Scanner;
//좌석 클래스 Sseat, Aseat, Bseat
//메뉴 클래스 Book, Search, Cancel

class Sseat
{
	private String name = "---";

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

class Aseat
{
	private String name = "---";

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

class Bseat
{
	private String name = "---";

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

class Book
{
	private String select = null;
	public static Scanner scan = new Scanner(System.in);

	public void run(Sseat[] sseat, Aseat[] aseat, Bseat[] bseat, Search search)
	{
		boolean flag = false;

		for (; !flag;)
		{
			System.out.printf("좌석구분 S(1) A(2) B(3)>>");
			select = scan.next();

			switch (select)
			{
			case "1":
				search.searchS(sseat);
				flag = true;
				break;
			case "2":
				search.searchA(aseat);
				flag = true;
				break;
			case "3":
				search.searchB(bseat);
				flag = true;
				break;
			default:
				System.out.printf("없는 좌석등급입니다.\n");
				break;
			}
		}

		this.inputNameNum(sseat, aseat, bseat);
	}

	public void inputNameNum(Sseat[] sseat, Aseat[] aseat, Bseat[] bseat)
	{
		String name = null;
		int num = 0;
		boolean flag = false;

		for (; !flag;)
		{
			System.out.printf("이름>>");
			name = scan.next();
			System.out.printf("번호>>");
			try
			{
				num = scan.nextInt();
			} catch (Exception e)
			{
				System.out.printf("없는 좌석번호입니다.\n");
				continue;
			} finally
			{
				scan.nextLine();
			}

			switch (select)
			{
			case "1":
				if (!(0 < num && num < sseat.length))
				{
					System.out.printf("없는 좌석번호입니다.\n");
					break;
				}
				if (sseat[num-1].getName().equals("---"))
				{
					sseat[num-1].setName(name);
					flag = true;
				} else
				{
					System.out.printf("이미 예약한 좌석\n");
				}
				break;
			case "2":
				if (!(0 < num && num < aseat.length))
				{
					System.out.printf("없는 좌석번호입니다.\n");
					break;
				}
				if (aseat[num-1].getName().equals("---"))
				{
					aseat[num-1].setName(name);
					flag = true;
				} else
				{
					System.out.printf("이미 예약한 좌석\n");
				}
				break;
			case "3":
				if (!(0 < num && num < bseat.length))
				{
					System.out.printf("없는 좌석번호입니다.\n");
					break;
				}
				if (bseat[num-1].getName().equals("---"))
				{
					bseat[num-1].setName(name);
					flag = true;
				} else
				{
					System.out.printf("이미 예약한 좌석\n");
				}
				break;
			default:

				break;
			}
			if (flag)
			{
				System.out.printf("%s님 %d번 좌석에 예약하셨습니다.\n", name, num);
			}
		}
	}
}

class Search
{
	public void run(Sseat[] sseat, Aseat[] aseat, Bseat[] bseat)
	{
		searchLine();
		searchS(sseat);
		searchA(aseat);
		searchB(bseat);
		System.out.printf("\n<<조회를 완료하였습니다.>>\n");
	}

	public void searchLine()
	{
		System.out.printf("번호 ");
		for (int i = 0; i < 10; i++)
		{
			System.out.printf("-%d- ",i+1);
		}
		System.out.printf("\n");
	}

	public void searchS(Sseat[] sseat)
	{
	
		System.out.printf("S>> ");
		for (int i = 0; i < sseat.length; i++)
		{
			System.out.printf("%s ", sseat[i].getName());
		}
		System.out.printf("\n");
	}

	public void searchA(Aseat[] aseat)
	{
		
		System.out.printf("A>> ");
		for (int i = 0; i < aseat.length; i++)
		{
			System.out.printf("%s ", aseat[i].getName());
		}
		System.out.printf("\n");

	}

	public void searchB(Bseat[] bseat)
	{
		
		System.out.printf("B>> ");
		for (int i = 0; i < bseat.length; i++)
		{
			System.out.printf("%s ", bseat[i].getName());
		}
	}

}

class Cancel
{
	private String select = null;
	public static Scanner scan = new Scanner(System.in);

	public void run(Sseat[] sseat, Aseat[] aseat, Bseat[] bseat, Search search)
	{
		boolean flag = false;

		for (; !flag;)
		{
			System.out.printf("좌석구분 S(1) A(2) B(3)>>");
			select = scan.next();

			switch (select)
			{
			case "1":
				search.searchS(sseat);
				flag = true;
				break;
			case "2":
				search.searchA(aseat);
				flag = true;
				break;
			case "3":
				search.searchB(bseat);
				flag = true;
				break;
			default:
				System.out.printf("없는 좌석등급입니다.\n");
				break;
			}
		}

		inputName(sseat, aseat, bseat);
	}

	public void inputName(Sseat[] sseat, Aseat[] aseat, Bseat[] bseat)
	{

		String name = null;
		boolean flag = false;

		for (; !flag;)
		{
			System.out.printf("이름>>");
			name = scan.next();

			switch (select)
			{
			case "1":
				for (int i = 0; i < sseat.length; i++)
				{
					if (sseat[i].getName().equals(name))
					{
						sseat[i].setName("---");
						flag = true;
						break;
					}
				}

				break;
			case "2":
				for (int i = 0; i < aseat.length; i++)
				{
					if (aseat[i].getName().equals(name))
					{
						aseat[i].setName("---");
						flag = true;
						break;
					}
				}
				break;
			case "3":
				for (int i = 0; i < bseat.length; i++)
				{
					if (bseat[i].getName().equals(name))
					{
						bseat[i].setName("---");
						flag = true;
						break;
					}
				}
				break;
			default:
				break;
			}
			if (!flag)
			{
				System.out.printf("없는 이름입니다.\n");
			}
		}
	}
}

public class Ex_247_12
{
	public static Scanner scan = new Scanner(System.in);
	// 좌석 클래스 Sseat, Aseat, Bseat
	// 메뉴 클래스 Book, Search, Cancel

	public static void main(String[] args)
	{
		// S좌석클래스 A좌석클래스 B좌석클래스
		// 예약클래스 조회클래스 취소클래스 끝내기클래스
		Sseat[] sseat = new Sseat[10];
		Aseat[] aseat = new Aseat[10];
		Bseat[] bseat = new Bseat[10];
		Book book = new Book();
		Search search = new Search();
		Cancel cancel = new Cancel();

		for (int i = 0; i < sseat.length; i++)
		{
			sseat[i] = new Sseat();
		}
		for (int i = 0; i < aseat.length; i++)
		{
			aseat[i] = new Aseat();
		}
		for (int i = 0; i < bseat.length; i++)
		{
			bseat[i] = new Bseat();
		}

//=====================================================================

		String select = null;
		boolean flag = false;

		System.out.printf("명품콘서트홀 예약 시스템입니다.\n");

		for (; !flag;)
		{
			System.out.printf("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			select = scan.next();

			switch (select)
			{
			case "1":
				book.run(sseat, aseat, bseat, search);
				break;
			case "2":
				search.run(sseat, aseat, bseat);
				break;
			case "3":
				cancel.run(sseat, aseat, bseat, search);
				break;
			case "4":
				flag = true;
				break;
			default:
				System.out.printf("없는 메뉴번호입니다.\n");
				break;

			}
		}
		scan.close();
		System.out.printf("\n예약시스템 종료\n");
	}
}
