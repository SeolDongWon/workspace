package ch04.Exam;

public class ArrayUtil
{
	// 인스터스멤버변수

	// 정적멤버변수

	// 생성자

	public ArrayUtil()
	{
	}
	// 인스턴스멤버함수(연산)

	// 정적멤버함수(연산)
	public static int[] concatenate(int[] a, int[] b) // 객체타입 리턴
	{
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++)
		{
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++)
		{
			c[a.length+i] = b[i];
		}

		return c;
	}

	public static void print(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.printf("%d\t", a[i]);
		}
		System.out.printf("\n");
	}
}
