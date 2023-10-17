package ch05.exam_09;

import java.util.Scanner;

public class StringStack implements Stack
{
	public static Scanner scan = new Scanner(System.in);
	private int count = 0;
	private String[] strArray = null;

	public void createArray()
	{
	}

	public StringStack()
	{
		super();
	}

	public String[] getStrArray()
	{
		return strArray;
	}

	public void setStrArray(int num)
	{
		this.strArray = new String[num];
	}

	@Override
	public int length()
	{
		return count;
	}

	@Override
	public int capacity()
	{
		return strArray.length;
	}

	@Override
	public String pop()
	{
		count--;
		return strArray[count];
	}

	@Override
	public boolean push(String val)
	{
		this.strArray[count] = val;
		count++;
		return false;
	}
}
