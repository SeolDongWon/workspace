package ch03.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_167_9
{
	public static final int ROW = 4;
	public static final int COL = 4;

	public static int randomGenerator()
	{
		return (int) (Math.random() * (10 - 1 + 1) + 1);
	}

	public static void main(String[] args)
	{
		int[][] intArray = new int[ROW][COL];

		for (int i = 0; i < intArray.length; i++)
		{
			for (int j = 0; j < intArray[i].length; j++)
			{
				intArray[i][j] = randomGenerator();
			}
		}

		for (int k = 0; k < intArray.length; k++)
		{
			for (int l = 0; l < intArray[k].length; l++)
			{
				System.out.printf("%-5d ", intArray[k][l]);
			}
			System.out.println();
		}
	}
}
