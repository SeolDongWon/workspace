package ch04.sec06;

import java.util.Scanner;

public class Ex_165_4
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		char alpha = 0;
		String inputchar = null;
		boolean flag = true;

		for (; flag;)
		{
			System.out.printf("소문자 알파벳 하나를 입력하시오>>\n\"그만\"입력시 종료>>");
			try
			{
				inputchar = scan.next();
			} catch (Exception e)
			{
				System.out.printf("다시입력하세요\n");
				continue;
			} finally
			{
				scan.nextLine();
			}

			if (inputchar.equals("그만"))
			{
				flag = false;
				continue;
			}
			
			alpha = inputchar.toLowerCase().charAt(0);
			
			if (!('a' <= alpha && alpha <= 'z'))
			{
				System.out.printf("다시입력하세요\n");
				continue;
			}

			for (char i = alpha; i > 'a'-1; i--)
			{
				for (char j = 'a'; j < i + 1; j++)
				{
					System.out.printf("%c", j);
				}
				System.out.printf("\n");
			}
		}
		scan.close();
		System.out.printf("END");

	}
}
