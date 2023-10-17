package ch03.sec01;

public class RandomTest
{
	public static void main(String[] args)
	{
		int i = 0;

		for (i = 0; i < 20; i++)
		{
			System.out.printf("%d ", (int) (Math.random()*(5)+101));
		}
	}
}
