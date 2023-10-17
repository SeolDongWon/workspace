package ch04.sec05;

import java.util.Scanner;

public class MainBook
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		Book[] book = new Book[4];
		bookArrayInput(book);
		bookArrayDisplay(book);
	}

	private static void bookArrayDisplay(Book[] book)
	{
		for (int i = 0; i < book.length; i++)
		{
			System.out.printf("%s \n", book[i].toString());
		}
	}

	private static void bookArrayInput(Book[] book)
	{
		book[0] = new Book();
		book[1] = new Book("이것이자바다");
		book[2] = new Book("신용권2", false);
		book[3] = new Book("이것이자바다", "신용권");
	}
}
