class Shape
{
	public void draw()
	{
		System.out.printf("Shape\n");
	}
}

class Circle extends Shape
{
	public void paint()
	{
		this.draw();
		super.draw();
	}

	public void draw()
	{
		System.out.printf("Circle\n");
	}
}

public class TESTarray
{
	public static void main(String[] args)
	{
		Shape s = new Circle();
		s.draw();
		Circle c = new Circle();
		c.paint();

	}
}
