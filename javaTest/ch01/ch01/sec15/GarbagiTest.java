//쓰레기무단투기벌금프로그램
//쓰레기 버린만큼 돈을 징수한다. 투괴횟수에 따라서 벌금이 부과된다.
//쓰레기   1번=1.3Daller, 2~3번=2.0Daller,4~5번=4.0Daller,6~7번=6.0Daller, 8이상=8.0Daller
package ch01.sec15;

import java.util.Scanner;

public class GarbagiTest
{
	// 정적멤버상수(클래스상수)
	public static final double FINE_RATE_1GRADE = 1.3, FINE_RATE_2GRADE = 2.0, FINE_RATE_3GRADE = 4.0,
			FINE_RATE_4GRADE = 6.0, FINE_RATE_0GRADE = 8.0;

	public static void main(String[] args)
	{
		// 1.변수선언(이름,전화번호,주민번호,투기횟수,벌금,횟수당 벌금,움직인횟수)
		Scanner scan = new Scanner(System.in);
		String phone = null, registNumber = null; // registNumber:주민번호
		String name = null;
		double fine = 0.0;
		int unmSpeculate = 0; // unmSpeculate: 투기횟수

		// 2.변수 초기값 설정
		// 3. 입력값
		for (int i = 0; i < 5; i++)
		{
			System.out.print("전화번호");
			phone = scan.nextLine();
			System.out.print("주민번호");
			registNumber = scan.nextLine();
			System.out.print("투기횟수");
			unmSpeculate = scan.nextInt();
			scan.nextLine(); // 입력버퍼클리어
			System.out.print("이름");
			name = scan.nextLine();

			// 3.연산
			switch (unmSpeculate)
			{
			case 0:
				fine = 0.0;
				break;
			case 1:
				fine = FINE_RATE_1GRADE;
				break;
			case 2:
			case 3:
				fine = FINE_RATE_2GRADE;
				break;
			case 4:
			case 5:
				fine = FINE_RATE_3GRADE;
				break;
			case 6:
			case 7:
				fine = FINE_RATE_4GRADE;
				break;
			default:
				fine = FINE_RATE_0GRADE;
				break;
			}

			// 4.출력
			System.out.printf("이름	: %2s \n", name);
			System.out.printf("벌금	: %.2f달러 \n", fine);
			System.out.printf("전화번호	: %s \n", phone);
			System.out.printf("주민번호	: %s \n", registNumber);
			System.out.printf("투기횟수	: %4d회 \n", unmSpeculate);

		} // end of for
			// 5.종료,반납
		scan.close();
		System.out.println("종료");

	}

}
