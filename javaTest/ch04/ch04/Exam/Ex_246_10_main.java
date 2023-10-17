package ch04.Exam;

import java.util.Scanner;

public class Ex_246_10_main
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.printf("한영단어프로그램\n");
		for (; true;)
		{
			System.out.printf("한글단어?");
			String word = scan.nextLine().trim();
			if (word.equals("그만"))
			{
				break;
			}
			
			String returnValue = Dictionary.korToEng(word);
			
			if (returnValue == null)
			{
				System.out.printf("%s는 사전없음\n", word);
			} else
			{
				System.out.printf("%s는 %s\n", word, returnValue);
			}
		} // end for
		scan.close();
		System.out.printf("\nEND");
	}
}
