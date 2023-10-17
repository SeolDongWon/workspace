package ch01.sec06;

import java.util.Scanner;

public class ScoreTest
{
	public static void main(String[] agrs)
	{
		// 1. 변수 선언, 입력객체참조변수
		Scanner scan = new Scanner(System.in);
		int age = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		int phy = 0;
		int sci = 0;
		int sum = 0;
		double avg = 0.0;
		String name = null;

		// 2. 변수 초기값 선언

		System.out.print("나이를 입력하세요. : ");
		age = scan.nextInt();
		scan.nextLine(); // 위 라인에서 입력한 'ENTER'를 처리하는 역할
		System.out.print("이름을 입력하세요. : ");
		name = scan.nextLine();
		System.out.print("국어점수를 입력하세요. : ");
		kor = scan.nextInt();
		System.out.print("영어점수를 입력하세요. : ");
		eng = scan.nextInt();
		System.out.print("수학점수를 입력하세요. : ");
		math = scan.nextInt();
		System.out.print("물리점수를 입력하세요. : ");
		phy = scan.nextInt();
		System.out.print("과학점수를 입력하세요. : ");
		sci = scan.nextInt();

		// 3. 연산, 처리
		sum = kor + eng + math + phy + sci;
		avg = sum / 5.0;

		// 4. 출력
		System.out.printf(" 나이 	: %5d \n", age);
		System.out.printf(" 이름 	: %5s \n", name);
		System.out.printf(" 국어점수	: %5d \n", kor);
		System.out.printf(" 영어점수	: %5d \n", eng);
		System.out.printf(" 수학점수	: %5d \n", math);
		System.out.printf(" 물리점수	: %5d \n", phy);
		System.out.printf(" 과학점수	: %5d \n", sci);
		System.out.printf(" 합계점수	: %5d \n", sum);
		System.out.printf(" 평균점수	: %5.2f \n", avg);

		// 5. 종료
		scan.close();
		System.out.println("종료");

	}
}
