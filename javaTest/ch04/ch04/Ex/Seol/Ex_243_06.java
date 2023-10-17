package ch04.Ex.Seol;

import java.util.Scanner;

class Circle_6
{
	private double x, y;
	private int radius;

	public Circle_6(double x, double y, int radius)
	{
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show()
	{
		System.out.printf("(%.1f,%.1f)%d\n", x, y, radius);
	}

	public int getRadius()
	{
		return radius;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

}

public class Ex_243_06
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Circle_6 c[] = new Circle_6[3];
		for (int i = 0; i < c.length; i++)
		{
			System.out.print("x,y,radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle_6(x, y, radius);
		}

		int max = Integer.MIN_VALUE;
		int cMaxNum = 0;
		for (int i = 0; i < c.length; i++)
		{
			if (max < c[i].getRadius())
			{
				max = c[i].getRadius();
				cMaxNum = i;
			}
		}
		System.out.printf("가장 면적이 큰 원은 ");
		c[cMaxNum].show();
		scanner.close();
	}
}
