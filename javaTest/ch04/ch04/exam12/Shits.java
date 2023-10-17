package ch04.exam12;

import java.util.Scanner;

public class Shits
{
	private Scanner scan = new Scanner(System.in);
	private String[][] grade = new String[3][];
	private String[] s;
	private String[] a;
	private String[] b;
	private String name; // 예약이름
	private int num; // 좌석 등급 index

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Shits()
	{
		name = null;
		num = 0;
		s = new String[10];
		a = new String[10];
		b = new String[10];
		for (int i = 0; i < a.length; i++)
		{
			s[i] = "---";
			a[i] = "---";
			b[i] = "---";
		}
		grade[0] = s;
		grade[1] = a;
		grade[2] = b;

	}

	public void reserve()
	{
		int shitNum = 0; // 좌석 번호
		System.out.printf("좌석 S(1), A(2), B(3)>>");
		try
		{
			num = scan.nextInt();
			toString(grade[num - 1], num);
			System.out.printf("이름>>");
			name = scan.next();
			System.out.printf("좌석번호>>");
			shitNum = scan.nextInt();
			if (grade[num - 1][shitNum - 1].equals("---"))
			{
				grade[num - 1][shitNum - 1] = name;
				System.out.println("<<<<예약을 완료하였습니다>>>>");

			} else
			{
				System.out.println("이미 예약된 좌석입니다.");
			}
		} catch (Exception e)
		{
			scan.nextLine();
			System.out.println("올바른 숫자를 입력해주세요.");

		}
	}

	public void inquiry()
	{

		for (int i = 0; i < grade.length; i++)
		{
			toString(grade[i], i + 1);
		}
		System.out.println("<<<<조회를 완료하였습니다>>>>");
	}

	public void cancle()
	{
		boolean flag = false;
		System.out.printf("좌석 S(1), A(2), B(3)>>");
		try
		{
			num = scan.nextInt();
			toString(grade[num - 1], num);
		} catch (Exception e)
		{
			scan.nextLine();
			System.out.println("1,2,3 중 하나의 숫자를 입력해주세요");
		}

		System.out.printf("이름>>");
		name = scan.next();
		
		for (int i = 0; i < grade[num - 1].length; i++)
		{
			if (grade[num - 1][i].equals(name))
			{
				grade[num - 1][i] = "---";
				flag = true;
				System.out.println("<<<<취소를 완료하였습니다>>>>");
				break;
			}
		}
		
		if (!flag)
		{
			System.out.printf("%s님은 예약목록에 없습니다.\n", name);
		}
	}
	
	public void toString(String[] str, int num)
	{
		String[] shitsGrade = { "S", "A", "B" };
		System.out.printf("%s>>", shitsGrade[num - 1]);
		for (int i = 0; i < str.length; i++)
		{
			System.out.printf("%s ", str[i]);

		}
		System.out.println();
	}

}