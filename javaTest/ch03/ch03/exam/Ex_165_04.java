package ch03.exam;

import java.util.Scanner;

public class Ex_165_04
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String input = null;
		char inputChar = 0;

		for (; true;)
		{
			System.out.println("Enter a letter of the alphabet: ");
			input = scan.nextLine();
			input = input.toLowerCase();
			inputChar = input.charAt(0);

			// 알파벳이 아니면 !false == ture
			if (!Character.isAlphabetic(inputChar))
			{scan.close();
				break;
			}

			for (int i = 'a' - 1; i < inputChar; i++)
			{
				for (int j = 0; j < inputChar - i; j++)
				{
					System.out.printf("%c", 'a' + j);
				}
				System.out.printf("\n");
			}
		}
		scan.close();
		System.out.println("END");
	}
}
