package ch03.sec03;

public class ArrayMaxTest
{
	public static void main(String[] args)
	{
		int[] intArray = new int[15];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < intArray.length; i++)
		{
			intArray[i] = (int) (Math.random() * (1000 - (-1000) + 1) + (-1000));
			System.out.printf("intArray[%d] = %d\n", i, intArray[i]);
			if (max < intArray[i])
			{
				max = intArray[i];
			}
			if (min > intArray[i])
			{
				min = intArray[i];
			}
		}
		System.out.printf("max = %d  min = %d", max,min);
	}
}
