package ch03.examSEOL;

public class ForTest
{
	public static void main(String[] args)
	{
		int sum = 0, i = 0;
		for (i = 0; i < 100; i = i + 2)
		{
			sum = sum+i;
		}
		System.out.printf("%d",sum);
	}
}