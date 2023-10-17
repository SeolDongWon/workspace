package ch01.sec01_1;

import java.util.Scanner;

public class test1
{
	public static void main(String[] args)
	{

//	변수 - 입력변수, 이름, 국어점수, 영어점수, 수학점수, 총합점수, 평균점수, 학번
		Scanner scan = new Scanner(System.in);
		String name = null;
		int korScore = 0, engScore = 0, mathScore = 0, totalScore = 0;
		double avg = 0.0;

//	입력 - 이름, 국어점수, 영어점수, 수학점수
		System.out.printf("=======================\n");
		System.out.printf("   학번	: 201403010\n");
		System.out.printf("   이름	: 김지하\n");
		System.out.printf("=======================\n");
		System.out.printf("이름을 입력해 주세요	: ");
		name = scan.nextLine();
		System.out.printf("국어점수를 입력해 주세요 : ");
		korScore = scan.nextInt();
		System.out.printf("영어점수를 입력해 주세요 : ");
		engScore = scan.nextInt();
		System.out.printf("수학점수를 입력해 주세요 : ");
		mathScore = scan.nextInt();
		scan.nextLine(); // 버퍼클리어
		System.out.printf("=======================\n");

//	연산 - 총합점수, 평균점수
		totalScore = korScore + korScore + mathScore;
		avg = (double) totalScore / 3;

//	출력 - 이름, 국어점수, 영어점수, 수학점수, 총합점수, 평균점수
		System.out.printf("이 름 	: %s\n", name);
		System.out.printf("국어점수	: %d\n", korScore);
		System.out.printf("영어점수	: %d\n", engScore);
		System.out.printf("수학점수	: %d\n", mathScore);
		System.out.printf("총합점수	: %d\n", totalScore);
		System.out.printf("평균점수	: %.2f\n", avg);

		scan.close();
	}
}
