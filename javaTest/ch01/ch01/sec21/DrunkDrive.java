package ch01.sec21;

import java.util.Scanner;

public class DrunkDrive
{

	public static void main(String[] args)
	{
		// 1. 변수선언 나이, 이름, 음주운전유무, 벌점, 알콜농도, 면허취소유무
		// 2. 변수초기값설정
		Scanner scan = new Scanner(System.in);
		int age = 0;
		String name = null;
		int penaltyPoint = 0;
		boolean isDrunkDrive = false, islicense = false;
		double alcoholGrade = 0.0;

		for (int i = 0; i < 3; i++)
		{

			// 3. 입력
			System.out.print("나이를 입력하시오:");
			age = scan.nextInt();
			scan.nextLine(); // 입력버퍼클리어
			System.out.print("이름을 입력하시오:");
			name = scan.nextLine();
			System.out.print("알콜농도를 입력하시오:");
			alcoholGrade = scan.nextDouble();

			// 3. 연산, 처리
			isDrunkDrive = true;
			islicense = false;
			if (alcoholGrade == 0.0)
			{
				penaltyPoint = 0;
				isDrunkDrive = false;
			} else if (0.1 <= alcoholGrade && alcoholGrade < 0.2)
			{
				penaltyPoint = 10;
			} else if (0.2 <= alcoholGrade && alcoholGrade < 0.3)
			{
				penaltyPoint = 15;
			} else if (0.3 <= alcoholGrade && alcoholGrade < 0.4)
			{
				penaltyPoint = 20;
			} else
			{
				penaltyPoint = 30;
				islicense = true;

			}

			// 4. 출력
			System.out.printf("당신의 이름은: %s\n", name);
			System.out.printf("당신의 나이는: %d\n", age);
			System.out.printf("당신의 알콜농도는: %.2f\n", alcoholGrade);
			System.out.printf("당신의 음주운전유무: %s\n", (isDrunkDrive) ? ("OK") : ("NO"));
			System.out.printf("당신의 벌점: %s점\n", penaltyPoint);
			System.out.printf("당신의 면허취소유무: %s\n", (islicense) ? ("면허취소") : ("면허유지"));
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		} // end of for
			// 5. 종료
		scan.close();
		System.out.println("종료");

	}

}
