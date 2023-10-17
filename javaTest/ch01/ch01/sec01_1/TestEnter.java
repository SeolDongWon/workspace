package ch01.sec01_1;

import java.io.IOException;

public class TestEnter
{
	public static void main(String[] args) throws IOException
	{
		for (int i = 0; i < 10; i++)
		{
			char num = (char) System.in.read();
			switch (num)
			{
			case 10, 13:
				break;
			default:
				System.out.print(num);
			}
			
		}
	}
}
