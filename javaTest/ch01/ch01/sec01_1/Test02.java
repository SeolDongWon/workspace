package ch01.sec01_1;

import java.io.IOException;
import java.util.Scanner;

public class Test02
{
	public static void main(String[] args) throws IOException
	{
//	변수	이름, 나이, 혈액형, BMTI, 좌우명
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name = null, bloodType = null, mbti = null, motto = null;
		int age = 0;

		System.out.printf("======자기소개 입력하기======\n");
		System.out.printf("이름을 입력하세요: ");
		name = scan.nextLine();
		System.out.printf("나이를 입력하세요: ");
		age = scan.nextInt();
		scan.nextLine(); // 버퍼클리어
		System.out.printf("혈액형을 입력하세요: ");
		bloodType = scan.nextLine();
		System.out.printf("BMTI를 입력하세요: ");
		mbti = scan.nextLine();
		System.out.printf("좌우명을 한 문장으로 입력하세요: ");
		motto = scan.nextLine();
		System.out.printf("======자기소개 입력 완료======\n");

		for (; true;)
		{
			System.out.printf("\n아이엠 그라운드 자기소개 시작! => 시작하려면 엔터키를 누르세요.\n");
			char chr1 = (char) System.in.read();
			char chr2 = (char) System.in.read();
			if (chr1 == 13 && chr2 == 10)
				break;
			else
			{
				scan.nextLine();
				continue;
			}

		}

		System.out.printf("저는 %s입니다. 나이는 %d살 이에요.\n", name, age);
		System.out.printf("혈액형은 %s형 이구요, %s입니다.\n", bloodType, mbti);
		System.out.printf("\n﻿★﻿★﻿★" + "%s﻿" + "!!!!!!!!★﻿★﻿★", motto);
		
		scan.close();

	}
}
