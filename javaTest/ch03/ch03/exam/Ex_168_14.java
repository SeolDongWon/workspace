// 배열작성 정수형배열, 문자열객체배열
package ch03.exam;

import java.util.Scanner;

public class Ex_168_14
{

	public static void main(String[] args)
	{
		final String Course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		final int Score[] = { 95, 88, 76, 62, 55 };

		Scanner scan = new Scanner(System.in);
		while (true)
		{
			String sub = null;
			boolean subFlag = false;

			System.out.printf("과목이름>>");

			sub = scan.next();
			if (sub.equals("그만"))
			{
				break;
			}

			for (int i = 0; i < Course.length; i++)
			{
				if (Course[i].equals(sub))
				{
					System.out.printf("%s의 점수는 %d\n", Course[i], Score[i]);
					subFlag = true;
					break;
				}
			}
			if (subFlag != true)
			{
				System.out.printf("없는과목입니다.\n");
			}

		}
		scan.close();
		System.out.println("The end");

	}
}
