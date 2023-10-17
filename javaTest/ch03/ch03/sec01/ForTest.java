package ch03.sec01;

public class ForTest
{
	public static void main(String[] args)
	{
		int i = 0, sum;
		for (i = 0,sum=0; i < 100 + 1; i++)
		{
			sum = sum + i;

		}
		System.out.printf("%d",sum);
	}
}
