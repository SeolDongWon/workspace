package ch03.exam;

import java.util.Scanner;

public class Ex_170_16
{
	public static void main(String[] args)
	{
		String[] order = { "가위", "바위", "보" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터와 가위바위보 게임을합니다.");
		while (true)
		{
			String result = null;
			//
			String computer = order[(int) (Math.random() * 3)];
			System.out.print("가위 바위 보!>>");
			String rockPaper = scanner.next();
			if (rockPaper.equals("그만"))
			{
				System.out.printf("게임을 종료합니다...");
				scanner.close();
				break;

			}
			switch (rockPaper)
			{
			case "가위":
				switch (computer)
				{
				case "가위":
					result = "무승부";
					break;
				case "바위":
					result = "실패";
					break;
				case "보":
					result = "승리";
					break;
				}
				break;
			case "바위":
				switch (computer)
				{
				case "가위":
					result = "승리";
					break;
				case "바위":
					result = "무승부";
					break;
				case "보":
					result = "실패";
					break;
				}
				break;
			case "보":
				switch (computer)
				{
				case "가위":
					result = "실패";
					break;
				case "바위":
					result = "승리";
					break;
				case "보":
					result = "무승부";
					break;
				}
				break;
			default:
				System.out.printf("올바르게입력\n");
				continue;
			}
			System.out.printf("사용자 = %s, 컴퓨터 = %s, 결과:%s\n", rockPaper, computer, result);
		}
		System.out.printf("종료");
	}
}
