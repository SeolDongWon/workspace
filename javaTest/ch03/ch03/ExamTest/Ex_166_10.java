package ch03.ExamTest;

public class Ex_166_10
{
	public static final int ROW = 4;
	public static final int COL = 4;

	public static void main(String[] args)
	{
		int[][] Array = new int[ROW][COL];
		int row = 0, col = 0;

		for (int i = 0; i < 10; i++)
		{
			row = (int) (Math.random() * 4);
			col = (int) (Math.random() * 4);

			if (Array[row][col] == 0)
			{
				Array[row][col] = (int) (Math.random() * 10 + 1);
			} else
			{
				i--;
			}
		}

		for (int[] data1 : Array)
		{
			for (int data2 : data1)
			{
				System.out.printf("%d\t", data2);
			}
			System.out.printf("\n");
		}
		System.out.printf("END");
	}
}
