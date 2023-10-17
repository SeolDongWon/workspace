// 5명의 학생정보를 입력해서 출력해라.
package ch04.sec02;

import java.util.Scanner;

public class MainArrayTest
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		// 배열선언
		// String[] name = new String[5];
		// int[] kor = new int[5];
		System.out.printf("입력할 학생수(-1 : 종료)>>");
		
		int count = scan.nextInt();
		if (count == -1)
		{
			scan.close();
			System.out.printf("END");
			return;
		}
		StudentScore[] ssArray = new StudentScore[count];
		// ssArray 인스턴스

		// 5명의 학생정보를 이름, 번호, 나이 입력, 랜덤(국영수)(for), 총점, 평균, 등급 계산함수
		for (int i = 0; i < ssArray.length; i++)
		{
			ssArray[i] = new StudentScore(createName(), i + 1, autoAge(), autoScore(), autoScore(), autoScore());
			ssArray[i].setKor(99);
			System.out.printf("국어점수 %d\n",ssArray[i].getKor());
			ssArray[i].calTotal();
			ssArray[i].calAverage();
			ssArray[i].calGrade();
		}

		// 5명의 학생정보를 출력(for)
		System.out.printf("\t\t이름\t번호\t나이\t국어점수\t영어점수\t수학점수\t총점\t평균\t등급\n");
		for (StudentScore data : ssArray)
		{
			System.out.printf("%s\n", data);
		}
		
		// 6 종료
		scan.close();
		System.out.printf("=========================================END========================================");

	}

	public static int autoAge()
	{
		return (int) (Math.random() * (30 - 19 + 1) + (19));
	}

	public static int autoScore()
	{
		return (int) (Math.random() * (100 - 50 + 1) + (50));
	}

	public static String createName()
	{
		final String[] FIRST_NAME = { "김", "문", "박", "백", "설", "이", "임", "한" };
		final String[] LAST_NAME = { "범", "지", "진", "가", "동", "정", "현", "우" };
		String name = FIRST_NAME[(int) (Math.random() * (FIRST_NAME.length - 1 + 0 + 1) + 0)]
				+ LAST_NAME[(int) (Math.random() * (LAST_NAME.length - 1 + 0 + 1) + 0)]
				+ LAST_NAME[(int) (Math.random() * (LAST_NAME.length - 1 + 0 + 1) + 0)];
		return name;
	}
}