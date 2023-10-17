package ch06.exam10_1;

import java.util.Arrays;

public class Person
{
	private String name;
	private int[] randNum;
	
	public Person(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int[] getRandNum()
	{
		return randNum;
	}

	public void setRandNum(int[] randNum)
	{
		this.randNum = randNum;
	}

	@Override
	public String toString()
	{
		return "Person [randNum=" + Arrays.toString(randNum) + "]";
	}
	
	
}
