package ch04.Ex.Seol;

import java.util.Scanner;

class Dictionary
{
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word)
	{
		boolean flag = true;
		for (int i = 0; i < kor.length; i++)
		{
			if (word.equals(kor[i]))
			{
				System.out.printf("%s은 %s\n", kor[i], eng[i]);
				flag = false;
				break;
			}
		}
		if (flag)
		{
			System.out.printf("%s는 저의 사전에 없습니다.\n", word);
		}
		return null;
	}
}

class DicApp
{
	Scanner scan = new Scanner(System.in);
	private String kword;

	public void run()
	{
		System.out.printf("한영 단어 검색 프로그램입니다.\n");
		for (; true;)
		{
			System.out.printf("한글단어?");
			kword = scan.next();
			scan.nextLine();
			if (kword.equals("그만"))
			{
				return;
			}
			Dictionary.kor2Eng(kword);
		}
	}

}

public class Ex_246_10
{
	public static void main(String[] args)
	{
		DicApp dicapp = new DicApp();
		dicapp.run();
	}
}
