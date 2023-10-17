package ch04.sec03;

public class Circle
{
	// 멤버변수
	private int radius;
	private String name;
	private double area;

	public Circle(String name, int radius)
	{
		super();
		this.radius = radius;
		this.name = name;
	}

	// get set
	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		if (5 <= radius && radius <= 30)
		{
			this.radius = radius;
		} else
		{
			System.out.printf("반지름 범위는 5~30cm입니다\n");
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getArea()
	{
		return this.area;
	}

	// 멤버함수 - 면적계산
	public void calArea()
	{
		this.area = 3.14 * radius * radius;
	}

	// 멤버함수의 equals 오버라이딩
	@Override
	public boolean equals(Object obj)
	{
		Circle c = (Circle) obj;
		if (this.radius == c.radius && this.area == c.area && this.name.equals(c.name))
		{
			return true;
		}
			return false;
	}

	// 멤버함수 출력함수(toString())
	@Override
	public String toString()
	{
		return "Circle [radius=" + radius + ", name=" + name + ", area=" + area + "]";
	}

}
