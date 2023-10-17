package ch03.exam;

public class Ex_167_13_1
{
	public static void main(String[] args)
	{
		int ones = 0, tens = 0;
		boolean flag = false;

		for (int i = 0; i < 100; i++)
		{
			ones = i % 10;
			tens = i / 10;
			if (ones != 0 && ones % 3 == 0)
			{
				System.out.printf("%d : 박수", i);
				System.out.print("짝");
				flag = true;
			}
			if (tens != 0 && tens % 3 == 0)
			{
				if (flag)
				{
					System.out.print("짝\n");
				} else
				{
					System.out.printf("%d : 박수", i);
					System.out.print("짝\n");
				}
				flag = false;
			}
			if (flag)
			{
				System.out.printf("\n");
				flag = false;
			}
		}
	}
}
