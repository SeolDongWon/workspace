package ch03.sec02;

public class DoubleForTest
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < i+1; j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}
}