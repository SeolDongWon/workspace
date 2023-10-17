package ch04.sec06;

public class ArrayParameterTest
{
	public static void main(String[] args)
	{
		char[] charArray = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		charArrayDisplay(charArray);
		charArrayReplace(charArray);
		charArrayDisplay(charArray);
	}

	public static void charArrayReplace(char[] charArray)
	{
		for (int i = 0; i < charArray.length; i++)
		{
			if (charArray[i] == ' ')
			{
				charArray[i] = ',';
			}
		}
	}

	public static void charArrayDisplay(char[] charArray)
	{
		for (int i = 0; i < charArray.length; i++)
		{
			System.out.printf("%c ", charArray[i]);
		}
		System.out.printf("\n");
	}
}
