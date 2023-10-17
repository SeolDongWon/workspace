package ch04.exam_11;

import java.util.Scanner;

public class Ex_244_07
{
	public static void main(String[] args)
	{
		MonthSchedule april = new MonthSchedule(30);
		april.run();

	}
}

class Day
{
	private String work;

	public void set(String work)
	{
		this.work = work;
	}

	public String get()
	{
		return work;
	}

	public void show()
	{
		if (work == null)
		{
			System.out.printf("없습니다.\n");
		} else
		{
			System.out.printf("%s입니다.\n", this.work);
		}
	}
}

class MonthSchedule
{
	private boolean flag;
	public static Scanner scan = new Scanner(System.in);
	Day[] day;

	public MonthSchedule(int days)
	{
		this.day = new Day[days+1];
		for (int i = 0; i < day.length; i++)
		{
			day[i] = new Day();
		}
		day[0].set("자바");
	}

	public void input()
	{
		int daySelect = 0;
		String work = null;
		System.out.printf("날짜(1~30)?");
		daySelect = scan.nextInt();
		System.out.printf("할일(빈칸없이입력)");
		work = scan.next();
		day[daySelect].set(work);
	}

	public void view()
	{
		int daySelect = 0;
		System.out.printf("날짜(1~30)?");
		daySelect = scan.nextInt();
		System.out.printf("%d일의 할일은 ",daySelect);
		day[daySelect].show();

	}

	public void finish()
	{
		this.flag = true;
	}

	public void run()
	{
		this.flag = false;
		String menuSelect = null;
		System.out.printf("이번달 스케쥴 관리 프로그램\n");

		while (!this.flag)
		{
			System.out.printf("할일(입력:1, 보기:2, 끝내기:3)>>");
			menuSelect = scan.next();

			switch (menuSelect)
			{
			case "1":
				input();
				break;
			case "2":
				view();
				break;
			case "3":
				finish();
				break;
			default:
				break;

			}
		}
		scan.close();
		System.out.printf("프로그램을 종료합니다.");
	}
}
