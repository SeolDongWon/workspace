package ch03.exam;

public class Ex_167_13
{
	public static void main(String[] args)
	{
		int ones = 0, tens = 0;
		boolean flag = false;

		for (int i = 1; i < 100; i++)
		{
			ones = i % 10;
			tens = i / 10;

			switch (ones % 10)
			{
			case 3:
			case 6:
			case 9:
				System.out.printf("%5d ", i);
				System.out.printf("박수 짝");
				flag = true;
				break;
			default:
				break;
			}
			switch (tens % 10)
			{
			case 3:
			case 6:
			case 9:
				if (flag)
				{
					System.out.printf("짝\n");
				} else
				{
					System.out.printf("%5d ", i);
					System.out.printf("박수 짝\n");
				}
				flag = false;
				break;
			default:
			}
			if (flag)
			{
				System.out.printf("\n");
			}
			flag = false;

		}
	}
}
