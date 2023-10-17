package ch06.exam10;

import java.util.Arrays;

public class Person
{
	// 멤버변수
	private String name;
	private int[] randNumber;

	// 생성자
	public Person(String name)
	{
		super();
		this.name = name;
	}

	// 멤버함수(연산,겟셋,오버,toString,equals)
	public void setRandNumber()
	{
		for (int i = 0; i < randNumber.length; i++)
		{
			randNumber[i] = (int) (Math.random() * (3 - 1 + 1) + (1));
		}
	}
	
	public boolean calEqualsRandNumber() {
		if(randNumber[1]==randNumber[0]&&randNumber[1]==randNumber[2]) {
			return true;
		}
		
		return false;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int[] getRandNumber()
	{
		return randNumber;
	}

	public void setRandNumber(int[] randNumber)
	{
		this.randNumber = randNumber;
	}

	@Override
	public String toString()
	{
		return "Person [randNumber=" + Arrays.toString(randNumber) + "]";
	}
	
}
