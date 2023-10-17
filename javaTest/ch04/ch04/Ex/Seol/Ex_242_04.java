package ch04.Ex.Seol;

class Rectangle
{
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height)
	{
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square()
	{
		return this.width * this.height;
	}

	public void show()
	{
		System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형\n", x, y, width, height);
	}

	public boolean contains(Rectangle r)
	{
		boolean minFlagX = ((this.x < r.x) && (r.x < this.x + this.width));
		boolean minFlagY = ((this.y < r.y) && (r.y < this.y + this.height));
		boolean maxFlagX = ((this.x < r.x + r.width) && (r.x + r.width < this.x + this.width));
		boolean maxFlagY = ((this.y < r.y + r.height) && (r.y + r.height < this.y + this.height));

		if ((minFlagX && minFlagY) && (maxFlagX && maxFlagY))
		{
			return true;
		}
		return false;
	}
}

public class Ex_242_04
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은" + s.square());
		if (t.contains(r))
		{
			System.out.printf("t는 r을 포함합니다.");
		}
		if (t.contains(s))
		{
			System.out.printf("t는 s을 포함합니다.");
		}
	}
}
