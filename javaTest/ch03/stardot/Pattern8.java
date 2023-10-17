package stardot;

public class Pattern8
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < ((i < 5) ? (4 - i) : (i - 4)); j++)
			{
				System.out.printf("  ");
			}
			for (int j = 0; j < ((i < 5) ? (i + 1) : (9 - i)); j++)
			{
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
	}
}
