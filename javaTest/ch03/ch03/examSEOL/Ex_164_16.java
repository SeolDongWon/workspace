package ch03.examSEOL;

import java.util.Scanner;

public class Ex_164_16
{
	public static void main(String[] args)
	{
		// 1 변수선언 초기화-입력객체, 가위바위보배열, 사람선택, 컴퓨터선택, 결과
		Scanner scan = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		String human = null, cpu = null, result = null;
		System.out.printf("컴퓨터와 가위 바위 보 게임을 합니다\n");

		EXIT: for (; true;)
		{
			// 2 입력 - 사람 가위바위보 선택
			System.out.printf("가위 바위 보!>>");
			human = scan.nextLine();

			// 3 연산 - 승패판정
			switch (human)
			{
			case "가위":
			case "바위":
			case "보": // 입력값이 "가위" "바위" "보" 중 하나면 게임 진행
				// 컴퓨터 가위바위보 랜덤생성
				cpu = str[(int) (Math.random() * 3)];
				if (cpu.equals(human))
				{ // 컴퓨터와 사람의 선택이 같으면
					result = "비겼습니다.";
				} else if ((cpu.equals("가위") && human.equals("바위")) || (cpu.equals("바위") && human.equals("보"))
						|| (cpu.equals("보") && human.equals("가위")))
				{ // 사람이 승리
					result = "사람이 이겼습니다.";
				} else
				{ // 비기지도 않고 사람이 이기지도 않았다면 컴퓨터가 승리
					result = "컴퓨터가 이겼습니다.";
				}
				break;
			case "그만": // "그만"을 입력하면 게임 종료
				break EXIT;
			default:
				continue;
			// "가위" "바위" "보" "그만" 이외를 입력하면 for문 처음으로 돌아간다
			}
			// 4 출력
			System.out.printf("사용자 = %s, 컴퓨터 = %s, %s\n", human, cpu, result);
		}
		// 5 종료
		scan.close();
		System.out.printf("END");
	}
}
