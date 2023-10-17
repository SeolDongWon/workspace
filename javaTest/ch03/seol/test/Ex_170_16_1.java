package seol.test;

import java.util.Scanner;

public class Ex_170_16_1
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		String human = null, cpu = null, result = null;
		String[] str = { "가위", "바위", "보" };
		boolean flag = true;

		System.out.printf("가위바위보 게임을 시작합니다\n\"그만\" 입력시 종료\n");

		for (; flag;)
		{
			System.out.printf("가위 바위 보!>>");
			human = scan.nextLine();
			cpu = str[(int) (Math.random() * (2 + 0 + 1) + (0))];
			result = "비겼습니다";
			switch (human)
			{
			case "가위":
				if (human.equals(cpu))
				{
				} else if (cpu.equals("바위")) 
				{
					result = "컴퓨터가 이겼습니다.";
				} else
				{
					result = "사용자가 이겼습니다";
				}
				
			case "바위":
				if (human.equals(cpu))
				{
				} else if (cpu.equals("보"))
				{
					result = "컴퓨터가 이겼습니다.";
				} else
				{
					result = "사용자가 이겼습니다";
				}
				
			case "보":
				if (human.equals(cpu))
				{
				} else if (cpu.equals("가위"))
				{
					result = "컴퓨터가 이겼습니다.";
				} else
				{
					result = "사용자가 이겼습니다";
				}
				System.out.printf("사용자 = %s, 컴퓨터 = %s %s\n", human, cpu, result);
				break;
			case "그만":
				flag = false;
				break;
			default:
				System.out.printf("정확히 입력하세요\n");
				break;
			}
		}

		scan.close();
		System.out.printf("게임을 종료합니다...");

	}
}
