package ch04.sec04;

public class Rectangle
{
	private int width;
	private int height;
	private int area;

	public Rectangle()
	{

	}

	public void calArea()
	{
		this.area = width * height;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getArea()
	{
		return area;
	}

	@Override
	public String toString()
	{
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
	
	

}
