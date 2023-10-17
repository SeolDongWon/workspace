package ch05.exam_09;

import java.util.Scanner;

public class StackApp
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		StringStack stack = new StringStack();

		int size = 0;
		System.out.printf("총 스택 저장 공간의 크기 입력>>");
		size = scan.nextInt();
		scan.nextLine();

		stack.setStrArray(size);

		boolean flag = false;
		String str = null;

		while (!flag)
		{
			System.out.printf("문자열 입력 >> ");
			str = scan.nextLine();

			if (str.equals("그만"))
			{
				flag = true;
				continue;
			}

			try
			{
				stack.push(str);
			} catch (Exception e)
			{
				System.out.printf("스택이 꽉 차서 푸시 불가!\n");
			}
			System.out.printf("저장된 개수 %d\n", stack.length());
			System.out.printf("저장가능한 개수 %d\n", stack.capacity());
		}

		System.out.printf("스택에 저장된 모든 문자열 팝 : ");
		for (int i = stack.getStrArray().length; i > 0; i--)
		{
			System.out.printf("%s ", stack.pop());
		}

		scan.close();
		System.out.printf("\nEND");
	}
}
