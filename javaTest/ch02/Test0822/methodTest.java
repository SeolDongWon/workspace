package Test0822;

public class methodTest
{

	public static int sum(int n, int m)
	{

		int d = n + m;
		return d + 10;
	}

	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;

		int c = sum(a, b);

		System.out.println(c);

	}

}
