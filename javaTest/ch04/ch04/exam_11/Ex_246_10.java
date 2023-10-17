package ch04.exam_11;

import java.util.Scanner;

public class Ex_246_10
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		String korWord = null;
		String engWord = null;
		boolean flag = false;
		Dictionary dictionary = new Dictionary();

		System.out.printf("한영 단어 검색 프로그램입니다.\n");

		while (!flag)
		{
			System.out.printf("한글단어?(\"그만\"입력시 종료)");
			korWord = scan.next();
			scan.nextLine();
			if(korWord.equals("그만")) {
				flag = true;
				continue;
			}
			
			engWord = dictionary.kor2Eng(korWord);

			if (engWord == null)
			{
				System.out.printf("%s 단어는 사전에 없습니다.\n", korWord);
			} else
			{
				System.out.printf("%s 단어는 영어로 %s입니다.\n", korWord, engWord);
			}
		}
		scan.close();
		System.out.printf("\nEND");
	}
}

class Dictionary
{
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String korWord)
	{
		String searchResult = null;
		for (int i = 0; i < kor.length; i++)
		{
			if (kor[i].equals(korWord))
			{
				searchResult = eng[i];
				break;
			}
		}
		return searchResult;
	}
}
