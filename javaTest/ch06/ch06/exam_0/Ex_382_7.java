package ch06.exam_0;

import java.util.Calendar;
import java.util.Random;

public class Ex_382_7
{
	public static void main(String[] args)
	{
		//7
//		String a = "가나다라";
//		System.out.println(a == "가나다라");
//		String b = new String(a);
//		System.out.println(a == b);
		//8
//		String a = new String("    Oh,  Happy    ");
//		String b = a.trim();
//		String c = b.concat("  Day. ");
		//9
//		String a = "Hello";
//		String b = "Hello";
//		String c = "Java";
//		String d = new String("Hello");
//		String e = new String("Java");
//		String f = new String("Java");
//		System.out.println(f.equals(a));
//		System.out.println(f.equals(b));
//		System.out.println(f.equals(c));
//		System.out.println(f.equals(d));
//		System.out.println(f.equals(e));
		//11
//		for(int i=0;i<10;i++) {
//			System.out.print((int)(Math.random()*(255-100+1)+(100)));
//			System.out.print(" ");
//		}
//		Random r = new Random();
//		for(int i=0;i<10;i++) {
//			System.out.print(r.nextInt(156)+100);
//			System.out.print(" ");
//		}
		//12
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(date.YEAR,2020);
		date.set(date.MONTH,11);
		date.set(date.DAY_OF_MONTH, 25);
		System.out.println("약속 날짜는 "+date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+date.get(Calendar.DAY_OF_MONTH)+"일");
		
	}
}
