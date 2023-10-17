//bmi계산법:몸무게(kg) / (키(m) x 키(m))
//bmi 40.1 이상	: 고도비만
//30.0 ~ 40.0	: 비만
//25.1 ~ 29.9	: 과체중
//20.0 ~ 25.0	: 정상
package ch01.sec17;

import java.util.Scanner;

public class BoddyMassIndex
{
	public static void main(String[] args)
	{
		// 1. 변수선언(이름,나이,키,몸무게,신체질량지수,결과판정)
		// 2. 변수초기값설정
		Scanner scan = new Scanner(System.in);
		int age = 0;
		double height = 0.0;
		double weight = 0.0;
		double bmi = 0.0;
		String resultValue = null;
		String name = null;

		// 3. 입력
		for (int i = 0; i < 5; i++)
		{
			System.out.print("당신의 이름은:");
			name = scan.nextLine();
			System.out.print("당신의 나이는:");
			age = scan.nextInt();
			System.out.print("당신의 키는(ex:175.5):");
			height = scan.nextDouble();
			height = height / 100.0;
			System.out.print("당신의 몸무게는(ex:78.5):");
			weight = scan.nextDouble();
			scan.nextLine(); // 입력버퍼클리어

			// 3. 연산, 처리
			bmi = weight / (height * height);
			if (20.0 <= bmi && bmi <= 25.0)
			{
				resultValue = "정상";
			} else if (25.1 <= bmi && bmi <= 29.9)
			{
				resultValue = "과체중";
			} else if (30.0 <= bmi && bmi <= 40.0)
			{
				resultValue = "비만";
			} else if (40.1 <= bmi)
			{
				resultValue = "고도비만";
			} else
			{
				resultValue = "측정불가";
			}

			// 4. 출력
			System.out.printf("이름	: %s \n", name);
			System.out.printf("나이	: %d \n", age);
			System.out.printf("키	: %.2fcm \n", height * 100);
			System.out.printf("몸무게	: %.2fkg \n", weight);
			System.out.printf("신체질량지수	: %.2f bmi \n", bmi);
			System.out.printf("판정결과	: %s \n", resultValue);
			System.out.println("===============================\n");
		} // end of for

		// 5. 종료
		scan.close();
		System.out.println("종료");

	}
}
