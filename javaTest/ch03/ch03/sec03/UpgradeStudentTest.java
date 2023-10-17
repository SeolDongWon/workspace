package ch03.sec03;

import java.util.Scanner;

public class UpgradeStudentTest
{
	public static final int PEOPLE_NUMBER = 3;
	public static final String[] FIRST_NAME = { "김", "문", "박", "백", "설", "이", "임", "한" };
	public static final String[] LAST_NAME = { "범", "지", "진", "가", "동", "정", "현", "우" };

	public static void main(String[] args)
	{ // 1 변수선언 및 초기화
		Scanner scan = new Scanner(System.in);
		boolean stopFlag = false, startFlag = false;
		int[] kor = new int[PEOPLE_NUMBER];
		int[] eng = new int[PEOPLE_NUMBER];
		int[] math = new int[PEOPLE_NUMBER];
		int[] total = new int[PEOPLE_NUMBER];
		double[] avr = new double[PEOPLE_NUMBER];
		char[] grade = new char[PEOPLE_NUMBER];
		String[] name = new String[PEOPLE_NUMBER];

		for (; !startFlag;)
		{
			System.out.printf("1.입력, 2.출력, 3.평균, 4,총점계산, 5.등급계산, 6.종료>>");
			int no = scan.nextInt();
			switch (no)
			{
			case 1:
				System.out.printf("입력\n");
				for (int i = 0; i < PEOPLE_NUMBER; i++)
				{
					kor[i] = (int) (Math.random() * (100 - 50 + 1) + 50);
					eng[i] = (int) (Math.random() * (100 - 50 + 1) + 50);
					math[i] = (int) (Math.random() * (100 - 50 + 1) + 50);
					name[i] = createName();
				}
				break;
			case 2:
				System.out.printf("출력\n");
				for (int i = 0; i < PEOPLE_NUMBER; i++)
				{
					System.out.printf(" %s \t %d \t %d \t %d \t", name[i], kor[i], eng[i], math[i]);
					System.out.printf(" %d \t %.2f \t %c등급\n", total[i], avr[i], grade[i]);
				}
				break;
			case 3:
				System.out.printf("평균\n");
				for (int i = 0; i < PEOPLE_NUMBER; i++)
				{
					avr[i] = (double) total[i] / 3;
				}
				break;
			case 4:
				System.out.printf("총점\n");
				for (int i = 0; i < PEOPLE_NUMBER; i++)
				{
					total[i] = kor[i] + eng[i] + math[i];
				}
				break;
			case 5:
				System.out.printf("등급\n");
				for (int i = 0; i < PEOPLE_NUMBER; i++)
				{
					switch ((int) avr[i] / 10)
					{
					case 10:
					case 9:
						grade[i] = 'A';
						break;
					case 8:
						grade[i] = 'B';
						break;
					case 7:
						grade[i] = 'C';
						break;
					case 6:
						grade[i] = 'D';
						break;
					default:
						grade[i] = 'F';
					}
				}
				break;
			case 6:
				System.out.printf("종료\n");
				startFlag = true;
				break;
			default:
				System.out.printf("정확한 값을 입력하세요\n"); // 컨티뉴 브레이크
				stopFlag = true;
				break;
			}
			System.out.printf("\n");
			if (stopFlag)
			{
				stopFlag = false;
				continue;
			}

		}
		scan.close();
		System.out.printf("종료");
	}

	public static String createName()
	{
		String name = FIRST_NAME[(int) (Math.random() * (FIRST_NAME.length - 1 + 0 + 1) + 0)]
				+ LAST_NAME[(int) (Math.random() * (LAST_NAME.length - 1 + 0 + 1) + 0)]
				+ LAST_NAME[(int) (Math.random() * (LAST_NAME.length - 1 + 0 + 1) + 0)];
		return name;
	}
}
