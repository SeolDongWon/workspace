package ch05.exam_09_1;

import java.util.Scanner;

public class StackAppMain
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.printf("총 스택 저장공간의 크기 입력>>");
		int size = scan.nextInt();
		scan.nextLine();
		StringStack ss = new StringStack(size);

		while (true)
		{
			System.out.printf("문자열입력(종료:그만)>>");
			String val = scan.nextLine().trim();
			if (val.equals("그만"))
			{
				break;
			}
			ss.push(val);

		} // end of while
		int length = ss.length();
		for(int i=0;i<length;i++) {
			System.out.printf("%s ",ss.pop());
		}
		Math.random();
		System.out.printf("\n END");
	}
}
