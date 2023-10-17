package ch01.sec05;

public class ScoreTest
{

	public static void main(String[] args)
	{
		// 1. 변수선언(정수형타입 : 나이, 국어점수, 영어점수, 수학점수, 물리점수, 과학점수, 합계점수),
		// (실수형타입 :평균점수),(문자열형타입 : 이름)
		int age = 0, kor = 0, eng = 0, math = 0, phy = 0, sci = 0, sum = 0;
		double avg = 0.0;
		String name = null;

		// 2. 변수초기값설정(국어점수:90, 영어점수:80, 수학점수:80, 합계점수:0, 평균점수:0.0)
		age = 33;
		name = "설동원";
		kor = 34;
		eng = 40;
		math = 50;
		phy = 60;
		sci = 70;
		sum = 0;
		avg = 0.0;

		// 3. 연산, 처리
		// (합계점수 = 국어점수 + 영어점수 + 수학점수)
		// 평균점수 = 합계점수 / 3
		sum = kor + eng + math + phy + sci;
		avg = sum / 5.0;

		// 4. 출력(국어점수:50점, 영어점수:60점, 수학점수:70점, 물리점수 : 80점, 과학점수 : 90점, 합계:254점,
		// 평균점수:50.80)
		System.out.printf(" 나이 	: %5d \n", age);
		System.out.printf(" 이름 	: %5s \n", name);
		System.out.printf(" 국어점수	: %5d \n", kor);
		System.out.printf(" 영어점수	: %5d \n", eng);
		System.out.printf(" 수학점수	: %5d \n", math);
		System.out.printf(" 물리점수	: %5d \n", phy);
		System.out.printf(" 과학점수	: %5d \n", sci);
		System.out.printf(" 합계점수	: %5d \n", sum);
		System.out.printf(" 평균점수	: %5.1f \n", avg);

		// 5.종료
		System.out.println(" 종료");
	}

}
