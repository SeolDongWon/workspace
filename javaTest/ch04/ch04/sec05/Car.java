package ch04.sec05;

public class Car
{
	// 멤버변수(이름,인승,색상)
	private String name;
	private int seats;
	private String color;

	// 생성자(디생)(매생 이름)(매생 이름 인승)(이름 인승 색상)
	public Car()
	{
		this("소나타", 4, "black");
	}

	public Car(String name)
	{
		this(name, 4, "black");
	}

	public Car(String name, int seats)
	{
		this(name, seats, "black");
	}

	public Car(String name, int seats, String color)
	{
		this.name = name;
		this.seats = seats;
		this.color = color;
	}

	// 멤버함수
	// 멤버함수getset
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSeats()
	{
		return seats;
	}

	public void setSeats(int seats)
	{
		this.seats = seats;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	// 출력
	@Override
	public String toString()
	{
		return "Car [name=" + name + ", seats=" + seats + ", color=" + color + "]";
	}
}
