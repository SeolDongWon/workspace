package ch06.exam10;

import java.util.Scanner;

public class PersonMain
{
	public static Scanner scan = new Scanner(System.in);
	public static final int COUNT = 3;

	public static void main(String[] args)
	{
		Person[] personArray = new Person[COUNT];
		for (int i = 0; i < personArray.length; i++)
		{
			System.out.printf("%d번째선수이름>>", i + 1);
			String name = scan.nextLine();
			personArray[i] = new Person(name);
		}

		int i = 0;
		while (true)
		{
			System.out.printf("[%s]:<Enter>", personArray[i % COUNT].getName());
			scan.nextLine();// 엔터키
			personArray[i % COUNT].setRandNumber();
			System.out.printf("%s ", personArray[i % COUNT]);
			if (personArray[i % COUNT].calEqualsRandNumber())
			{
				System.out.printf("%s님 이겼습니다", personArray[i % COUNT].getName());
				break;
			}
			System.out.printf("아쉽군요");
			i++;
		}
	}
}
