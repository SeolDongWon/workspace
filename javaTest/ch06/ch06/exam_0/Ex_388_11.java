package ch06.exam_0;

import java.util.Scanner;

public class Ex_388_11{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		System.out.printf(">>");
		StringBuffer sb = new StringBuffer(scan.nextLine());

		String str = null;
		String[] strArray = new String[2];
		boolean flag = false;
		int indexStart = 0;
		int indexEnd = 0;

		while (!flag){
			System.out.printf("명령: ");
			str = scan.next();
			scan.nextLine();
			
			if (str.equals("그만")){
				flag = true;
				continue;
			}
			
			try{
				strArray = str.split("!");
				indexStart = sb.indexOf(strArray[0]);
				indexEnd = indexStart + strArray[0].length();

				if (indexStart == indexEnd || strArray.length == 1){
					System.out.printf("잘못된 명령입니다!\n");
					continue;
				}
				sb.replace(indexStart, indexEnd, strArray[1]);
			} catch (Exception e){
				System.out.printf("찾을 수 없습니다!\n");
				continue;
			}
			System.out.printf("\n");
			System.out.println(sb);
		}
		System.out.printf("종료합니다\n");
		System.out.printf("\nEND");
	}
}
