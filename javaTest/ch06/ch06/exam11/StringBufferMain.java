package ch06.exam11;

import java.util.Arrays;
import java.util.Scanner;

public class StringBufferMain
{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.printf(">>");
		String data = scan.nextLine().trim();
		StringBuffer sb = new StringBuffer(data);
		System.out.printf("%s\n", sb.toString());
		
		while(true) {
			System.out.printf("명령:");
			String value = scan.nextLine().trim();
			if(value.equals("그만")) {
				break;
			}
			
			String[] strArray = value.split("!");
			if(strArray.length!=2) {
				System.out.printf("잘못된 명령입니다!\n");
				continue;
			}
			
			int findIndex = sb.indexOf(strArray[0]);
			if(findIndex==-1) {
				System.out.printf("잘못된 명령입니다!\n");
			}
			
			sb.replace(findIndex, findIndex+strArray[0].length(), strArray[1]);
			System.out.println(sb);
			
		}
		
		
	}
}
