package ch01.sec03;

public class ScoreTest
{
	public static void main(String[] args)
	{
		// 1. 변수 정수 - 국어, 영어, 합계
		int kor, eng, total;
		
		// 2. 초기값 - 국어 : 90, 영어 : 80, 합계 : 0
		kor = 90;
		eng = 80;
		total = 0;

		// 3. 연산&처리(합계점수)
		total = kor + eng;

		// 4. 출력(영어점수 : 80점, 국어점수 : 90점 합계 : 170점)
		System.out.printf("영어점수 : %d점, 국어점수 : %d점, 합계 : %d점\n", eng, kor, total);

		// 5.종료
		System.out.println("종료");
	}
}
