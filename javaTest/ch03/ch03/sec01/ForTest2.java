package ch03.sec01;

public class ForTest2
{
	public static void main(String[] args)
	{
		int i = 0, sum = 0;

		while (i < 10)
		{	i++;
			sum = sum + i;
			System.out.print(i);
			System.out.printf((i == 10) ? ("") : ("+"));

			
		}
//		for (i = 1; i < 11; i++)
//		{
//			sum = sum + i;
//			System.out.print(i);
//			System.out.printf((i == 10) ? ("") : ("+"));
//			
//		} end of for

		System.out.printf("=%d", sum);
	}
}
