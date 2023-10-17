package ch07.sec01;

import java.util.ArrayList;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		String[] message = new String[7];
		message[0]="Hello";
		message[1]="Hi";
		message[2]="Java";
		message[3]="사과";
		
		for(int i=0;i<message.length;i++) {
			System.out.printf("message[%d]=%s \n", i, message[i]);
		}
		System.out.printf("====================\n");
		//==============================
		ArrayList<String> alMesssage = new ArrayList<String>();
		alMesssage.add(0,"Hello");
		alMesssage.add(1,"Hi");
		alMesssage.add(2,"Java");
		alMesssage.add(3,"사과");
		
		for(int i=0;i<alMesssage.size();i++) {
			System.out.printf("alMesssage[%d]=%s \n", i, alMesssage.get(i));
		}
//		System.out.printf("\nalMessage size = %d",alMesssage.);
		
		System.out.printf("\nEND");
	}
}
