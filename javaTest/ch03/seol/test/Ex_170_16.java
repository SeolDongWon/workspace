package seol.test;

import java.util.Scanner;

public class Ex_170_16
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String human = null, cpu = null, result = null;
		String[] str = { "가위", "바위", "보" };

		System.out.printf("컴퓨터와 가위 바위 보 게임을 합니다.\n\"그만\"입력시 종료합니다.\n");

		END: for (; true;){
			System.out.printf("가위 바위 보!>>");
			human = scan.nextLine();
			switch (human){
			case "가위":
			case "바위":
			case "보":
				cpu = str[(int) (Math.random() * 3)];

				if (human.equals(cpu)){
					result = "비겼습니다.";
				} else if ((human.equals("가위") && cpu.equals("바위")) 
						|| (human.equals("바위") && cpu.equals("보"))
						|| (human.equals("보") && cpu.equals("가위"))){
					result = "컴퓨터가 이겼습니다.";
				} else{
					result = "사용자가 이겼습니다.";
				}

				System.out.printf("사용자 = %s , 컴퓨터 = %s , %s\n", human, cpu, result);
				break;
			case "그만":
				break END;
			default:
				System.out.printf("제대로 입력하세요.\n");
			}
		}
		scan.close();
		System.out.printf("게임을 종료합니다...");
	}
}
