package ch01.sec01_1;

import java.util.Scanner;

public class IntroduceTest
{
	public static void main(String[] args)
	{
//	1.	변수선언, 초기값설정
		String name = null, bloodType = null, mbti = null;
		String motto = null;
		int age = 0;
		Scanner scan = new Scanner(System.in);

//	2.	입력값받기
		System.out.print("이름입력:");
		name = scan.nextLine();
		System.out.print("나이입력:");
		age = scan.nextInt();
		scan.nextLine(); // 입력버퍼클리어
		System.out.print("혈액형입력:");
		bloodType = scan.nextLine();
		System.out.print("MBTI입력:");
		mbti = scan.nextLine();
		System.out.print("좌우명입력:");
		motto = scan.nextLine();

//	3.	연산처리
//	4.	출력
		System.out.printf("\n저는 %s입니다. 나이는 %d이에요.\n", name, age);
		System.out.printf("혈액형은 %s이구요, MBTI는 %s입니다.\n", bloodType, mbti);
		System.out.printf("\n★★★★ %s ★★★★\n", motto);

//	5.	종료
		scan.close();
		System.out.println("종료");

	}
}
