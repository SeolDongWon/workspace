package ch04.sec05;

public class Coffe
{
	// 멤버변수
	private String coffeName;
	private String capacity;
	private int capacityML;
	private String source;

	// 생성자
	public Coffe() // 디폴트
	{
	}

	public Coffe(String name) // 매개변수생성자
	{
		this(name,"중","콜롬비아");
	}

	public Coffe(String name, String capacity)// 매개변수생성자
	{
		this(name,capacity,"콜롬비아");
	}

	public Coffe(String name, String capacity, String source)// 매개변수생성자
	{
		this.coffeName = name;
		switch (capacity)
		{
		case "소":
			this.capacityML = 300;
			break;
		case "대":
			this.capacityML = 600;
			break;
		case "중":
		default:
			this.capacityML = 450;
			break;
		}
		this.source = source;
	}

	// 맴버함수
	public void drink(int ml)
	{
		if (this.capacityML > 0)
		{
			this.capacityML = this.capacityML - ml;
			System.out.printf("커피맛있다");
		} else if (this.capacityML <= 0)
		{
			this.capacityML = 0;
			System.out.printf("커피는없다");
		}
	}
	// 맴버함수get,set

	public String getName()
	{
		return coffeName;
	}

	public void setName(String name)
	{
		this.coffeName = name;
	}

	public int getMl()
	{
		return capacityML;
	}

	public void setMl(int ml)
	{
		this.capacityML = ml;
	}

	public String getSource()
	{
		return source;
	}

	public void setSource(String source)
	{
		this.source = source;
	}

	// 출력
	@Override
	public String toString()
	{
		return "Coffe [name=" + coffeName + ", ml=" + capacityML + ", source=" + source + "]";
	}

}
