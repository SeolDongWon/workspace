package ch04.sec01;

import java.text.DecimalFormat;

public class DoubleTest
{
	public static void main(String[] args)
	{
		double avg = 12334.4365465455;
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.printf("avr="+df.format(avg));
	}
}
