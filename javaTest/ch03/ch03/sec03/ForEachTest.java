package ch03.sec03;

public class ForEachTest
{
	public static void main(String[] args)
	{
		String[] name = { "홍길동", "말길동", "구길동", "이길동", "저길동" };
		int[] score = {10,20,30,40,50};

		for (int i = 0; i < name.length; i++)
		{
			System.out.printf("%s\n", name[i]);
			System.out.printf("%d\n", score[i]);
		}
		System.out.printf("=============\n");
		for (String data : name)
		{
			System.out.printf("%s\n", data);
		}
		for (int data : score)
		{
			System.out.printf("%s\n", data);
		}
	}
}
