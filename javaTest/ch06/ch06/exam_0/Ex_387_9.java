package ch06.exam_0;

import java.util.Scanner;

public class Ex_387_9
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		boolean flag = false;
		String human = null;
		String cpu = null;
		int select = 0;
		String result = null;
		String[] selectArray = { "널", "가위", "바위", "보" };

		while (!flag)
		{
			result = "비겼습니다";
			System.out.printf("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			try
			{
				select = scan.nextInt();
				scan.nextLine();
			} catch (Exception e)
			{
				System.out.printf("입력오류\n");
				scan.nextLine();
				continue;
			}

			if (select == 4)
			{
				flag = true;
				continue;
			}

			human = selectArray[select];
			cpu = selectArray[(int) (Math.random() * (3 - 1 + 1) + (1))];

			switch (human)
			{
			case "가위":
				if (cpu.equals("바위"))
				{
					result = "컴퓨터가 이겼습니다.";
				} else if (cpu.equals("보"))
				{
					result = "철수가 이겼습니다.";
				}
				break;
			case "바위":
				if (cpu.equals("보"))
				{
					result = "컴퓨터가 이겼습니다.";
				} else if (cpu.equals("가위"))
				{
					result = "철수가 이겼습니다.";
				}
				break;
			case "보":
				if (cpu.equals("가위"))
				{
					result = "컴퓨터가 이겼습니다.";
				} else if (cpu.equals("바위"))
				{
					result = "철수가 이겼습니다.";
				}
				break;
			}
			System.out.printf("철수(%s) : 컴퓨터(%s)\n", human, cpu);
			System.out.printf("%s\n",result);
		}
		System.out.printf("\nEND");
	}

}
