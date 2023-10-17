package ch01.sec01_1;

import java.io.IOException;

public class EnterTest
{
	public static void main(String[] args) throws IOException
	{
		System.out.printf("\n아이엠 그라운드 자기소개 시작! => 시작하려면 엔터키를 누르세요.\n");

		char chr1 = (char) System.in.read();
		char chr2 = (char) System.in.read();
		System.out.println((int) chr1);
		System.out.println((int) chr2);
		if (chr1 == 13 && chr2 == 10)
		{
			System.out.printf("올바르게 엔터를 입력했어요.ch1=%d chr2=%d \n", (int) chr1, (int) chr2);
		} else
		{
			System.out.println("엔터를 입력안했어요.\n");
		}
		System.out.println("종료");
	}
}
