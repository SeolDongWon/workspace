package ch06.exam_0;

import java.util.Scanner;

public class Ex_386_7{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		String str = null;
		boolean flag = false;
		System.out.printf("문장을 입력하세요\n");
		
		while (!flag){
			System.out.printf(">>");
			str = scan.nextLine();
			
			if (str.equals("그만")){
				flag = true;
				continue;
			}
			String[] strArray = str.split(" ");
			System.out.printf("어절의 개수는 %d\n", strArray.length);
		}
		System.out.printf("종료합니다...");
	}
}
