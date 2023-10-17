//랜덤한 정수배열의 평균 출력
package ch03.examSEOL;

import java.util.Scanner;

public class Ex_164_07
{
	public static void main(String[] args)
	{
		// 1 변수선언&초기화 - 정수배열, 합계, 평균
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[10];
		int sum = 0;
		double avg = 0.0;

		// 2 연산&출력
		System.out.printf("랜덤한 정수들 : ");
		for (int j = 0; j < 10; j++)
		{
			int i = (int) (Math.random() * 10 + 1);// 1~10까지 정수 랜덤생성
			System.out.printf("%d ", i); // 생성한 정수 출력
			intArray[j] = i; // 생성한 정수를 배열에 차례로 넣는다
			sum = sum + (i); // 생성한 정수의 합을 누적
		}
		avg = (double)sum/intArray.length; // 정수의 합계를 배열의 길이로 나눈다
		System.out.printf("\n평균은 %.1f",avg);

		// 4 종료
		scan.close();
		System.out.printf("\nEND");
	}
}
