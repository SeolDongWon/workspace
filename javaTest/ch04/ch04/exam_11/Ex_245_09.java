package ch04.exam_11;

import java.util.Arrays;

public class Ex_245_09
{
	public static void main(String[] args)
	{
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}

class ArrayUtil
{
	public static int[] concat(int[] a, int[] b)
	{
		int[] ab = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++)
		{
			ab[i] = a[i];
		}
		for (int i = 0; i < b.length; i++)
		{
			ab[a.length + i] = b[i];
		}
		return ab;
	}

	public static void print(int[] ab)
	{
		System.out.printf(Arrays.toString(ab));
	}
}
