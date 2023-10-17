package ch03.examSEOL;

import java.util.Scanner;

public class Ex_164_04
{
	public static void main(String[] args)
	{
		// 1 변수선언&초기화 - 입력객체, 소문자알파벳
		Scanner scan = new Scanner(System.in);
		char inputchar = '\u0000';

		for (; true;)
		{
			// 2 입력 - 소문자알파벳
			System.out.printf("소문자 알파벳 하나를 입력하시오>>");
			inputchar = scan.next().toLowerCase().charAt(0);
		
			if (inputchar == '0')
			{	// '
				scan.close();
				break;
			}

			if (!Character.isAlphabetic(inputchar))
			{
				continue;
			}
			// 3 연산&출력
			do
			{
				for (char i = 'a'; i <= inputchar; i++)
				{
					System.out.printf("%c", i);
				}
				inputchar--;
				System.out.printf("\n");
			} while (inputchar >= 'a');
		}

		// 4 종료
		scan.close();
		System.out.printf("End");
	}

}
