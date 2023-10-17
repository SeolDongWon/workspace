package ch04.Ex.Seol;

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
		int aL = a.length;
		int bL = b.length;
		int[] c = new int[aL + bL];

		for (int i = 0; i < c.length; i++)
		{
			if (i < a.length)
			{
				c[i] = a[i];
			} else
			{
				c[i] = b[i - a.length];
			}
		}
		return c;
	}

	public static void print(int[] a)
	{
		System.out.println(Arrays.toString(a));
	}
}
