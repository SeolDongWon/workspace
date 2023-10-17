package ch06.exam_0;

import java.util.Scanner;

public class Ex_386_8{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
//		String str = null;
//		String strSpin = null;
//		System.out.printf("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.\n");
//		str = scan.nextLine();
//		
//		for(int i=0;i<str.length();i++) {
//			strSpin=str.substring(i);
//			System.out.printf("%s",strSpin);
//			for(int j=0;j<i;j++) {
//				System.out.printf("%c",str.toCharArray()[j]);	
//			}
//			System.out.printf("\n");
//		}
//		System.out.printf("%s\n",str);
//=================================================위 내가한거
		System.out.printf("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.\n");
		String data = scan.nextLine().trim();
		
		for(int i=0;i<data.length();i++) {
			String first = data.substring(0, 1);
			String last = data.substring(1);
			data = last.concat(first);
			System.out.println(data);
		}
	}
}
