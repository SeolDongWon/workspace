package ch01.sec04;

public class ScoreTest
{

	public static void main(String[] args)
	{
		// 1. 변수선언(국어점수, 영어점수, 수학점수, 합계점수 : 정수형타입),(평균점수 : 실수형타입)
		int kor, eng, math, total;
		double avr;
		
		// 2. 변수초기값설정(국어점수:90, 영어점수:80, 수학점수:80, 합계점수:0, 평균점수:0.0)
		kor = 90;
		eng = 80;
		math = 80;
		total = 0;
		avr = 0.0;
		
		// 3. 연산, 처리
		//(합계점수 = 국어점수 + 영어점수 + 수학점수)
		// 평균점수 = 합계점수 / 3
		total = kor + eng + math;
		avr = total / 3.0;
		
		// 4. 출력(영어점수:80점, 국어점수:90점, 수학점수:80점, 합계:250점, 평균점수:83.33333)
		System.out.printf("국어점수 : %5d\n",kor);
		System.out.printf("영어점수 : %5d\n",eng);
		System.out.printf("수학점수 : %5d\n",math);
		System.out.printf("합계점수 : %5d\n",total);
		System.out.printf("평균점수 : %5.2f\n",avr);

		// 5.종료
		System.out.println("종료");
	}

}
