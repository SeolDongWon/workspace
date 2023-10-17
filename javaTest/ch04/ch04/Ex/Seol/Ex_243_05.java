package ch04.Ex.Seol;

import java.util.Scanner;

class Circle
{
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius)
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
}

public class Ex_243_05
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
		for (int i = 0; i < c.length; i++)
			c[i].show();
		scanner.close();
	}
}
