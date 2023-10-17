package ch06.exam10_1;

import java.util.Scanner;

public class PerseonMain
{
	public static int COUNT = 3;
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		Person[] player = new Person[COUNT];
		
		for(int i=0;i>player.length;i++) {
			System.out.printf("%d번째 선수 이름>>",i+1);
			String name = scan.nextLine().trim();
			player[i] = new Person(name);
		}
		
		int i=0;
		while(true) {
			System.out.printf("[%s]:<Enter>\n",player[i%COUNT].getName());
			
			
		}
	}
}
