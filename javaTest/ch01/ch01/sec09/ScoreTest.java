package ch01.sec09;

import java.util.Scanner;

public class ScoreTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String name = null;
		int age = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		int phy = 0;
		int sci = 0;
		int sum = 0;
		double avg = 0.0;
		String passResult = null;

		System.out.print(" 나이를 입력하세요 : ");
		age = scan.nextInt();
		scan.nextLine();
		System.out.print(" 이름을 입력하세요 : ");
		name = scan.nextLine();
		System.out.print(" 국어점수를 입력하세요 : ");
		kor = scan.nextInt();
		System.out.print(" 영어점수를 입력하세요 : ");
		eng = scan.nextInt();
		System.out.print(" 수학점수를 입력하세요 : ");
		math = scan.nextInt();
		System.out.print(" 물리점수를 입력하세요 : ");
		phy = scan.nextInt();
		System.out.print(" 과학점수를 입력하세요 : ");
		sci = scan.nextInt();

		sum = kor + eng + math + phy + sci;
		avg = sum / 5.0;

		if (avg >= 60)
		{
			passResult = "합격";
		}
		else
		{
			passResult = "불합격";
		}

		System.out.printf("\n 이름	: %5s\n", name);
		System.out.printf(" 나이 	: %5d\n", age);
		System.out.printf(" 국어점수 : %5d\n", kor);
		System.out.printf(" 영어점수 : %5d\n", eng);
		System.out.printf(" 수학점수 : %5d\n", math);
		System.out.printf(" 물리점수 : %5d\n", phy);
		System.out.printf(" 과학점수 : %5d\n", sci);
		System.out.printf(" 총합점수 : %5d\n", sum);
		System.out.printf(" 평균점수 : %5f\n", avg);
		System.out.printf(" 합격상태 : %5s\n", passResult);

		scan.close();
		System.out.println("종료");
	}
}
