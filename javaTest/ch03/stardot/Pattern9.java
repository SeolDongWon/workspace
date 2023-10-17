package stardot;

public class Pattern9
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < ((i < 5) ? (i + 1) : (9 - i)); j++)
			{
				System.out.printf("0 ");
			}
			for (int j = 0; j < ((i < 5) ? (9-2*i) : (i-2)); j++)
			{
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
	}
}
