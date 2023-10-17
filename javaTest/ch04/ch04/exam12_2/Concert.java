package ch04.exam12_2;

public class Concert
{
	// 멤버변수
	private String[] s;
	private String[] a;
	private String[] b;


	// 생성자
	public Concert()
	{
		this.s = new String[10];
		this.a = new String[10];
		this.b = new String[10];
	}

	// 메소드(연산)

	// 메소드(게터 세터)

	public String[] getS()
	{
		return s;
	}

	public void setS(String[] s)
	{
		this.s = s;
	}

	public String[] getA()
	{
		return a;
	}

	public void setA(String[] a)
	{
		this.a = a;
	}

	public String[] getB()
	{
		return b;
	}

	public void setB(String[] b)
	{
		this.b = b;
	}

	// 메소드 출력
	public void printS()
	{
		System.out.printf("S>>");
		for (int i = 0; i < s.length; i++)
		{
			if (s[i] == null)
			{
				System.out.printf("---- ");
			} else
			{
				System.out.printf("%s ",s[i]);
			}
		}
		System.out.printf("\n");
	}
	public void printA()
	{
		System.out.printf("A>>");
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == null)
			{
				System.out.printf("---- ");
			} else
			{
				System.out.printf("%s ",a[i]);
			}
		}
		System.out.printf("\n");
	}
	public void printB()
	{
		System.out.printf("B>>");
		for (int i = 0; i < b.length; i++)
		{
			if (b[i] == null)
			{
				System.out.printf("---- ");
			} else
			{
				System.out.printf("%s ",b[i]);
			}
		}
		System.out.printf("\n");
	}
}
