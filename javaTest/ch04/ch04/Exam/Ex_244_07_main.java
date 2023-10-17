package ch04.Exam;

import java.util.Scanner;

public class Ex_244_07_main
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		// 변수선언 Day 객체배열
		int no = 0;
		int day = 0;
		String todolist = null;
		Day[] dayArray = new Day[31];
		boolean flag = false;
		// 메소드 작성(필요하면)
		System.out.printf("이번달 스케쥴 관리");

		for (; !flag;)
		{
			System.out.printf("할일(입력:1, 보기:2, 끝내기:3)>>");
			no = scan.nextInt();

			switch (no)
			{
			case 1:
				day = inputDay(1, 30);
				System.out.printf("할일(빈칸없이입력)?");
				todolist = scan.nextLine().trim();
				
				dayArray[day] = new Day();
				dayArray[day].setWork(todolist);
				break;

			case 2:
				day = inputDay(1, 30);
				try {
					System.out.printf("%d일은 ", day);
					dayArray[day].show();
				}catch(NullPointerException e ) {
					System.out.printf("입력하지 않은 Day입니다.\n");
				}

				break;
			case 3:
				flag = true;
				break;
			default:
				System.out.printf("다시 번호선택!!!");
				break;
			}
		} // end of for
		scan.close();
		System.out.printf("\nEND");
	}

	public static int inputDay(int startDay, int endDay)
	{
		int day = 0;
		for (; true;)
		{
			System.out.printf("날짜(%d-%d?)", startDay, endDay);
			day = scan.nextInt();
			scan.nextLine();
			if (startDay <= day && day <= endDay)
			{
				break;
			} 
			System.out.printf("날짜는 %d-%d? 입력바람\n", startDay, endDay);

		}
		return day;
	}
}
