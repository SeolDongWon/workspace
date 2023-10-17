package ch02.sec01;

public class Hello
{
// 메소드 (두 정수의 합을 구하는 연산
	public static int sum(int n, int m)
	{
// 2-2 n + m 연산 수행 후 그 값을 sum으로 보낸다 -> 2-3 이동
		return n + m;
	}

// main 시작
	public static void main(String[] args)
	{
//	1. 변수 선언 ( 정수, 합계, 문자, 문자열
		int number = 0;
		int sum = 0;
		char alphabet = 0;
		String text = null;
		sum = 0;

		
//	2. 변수 초기값	( 정수, 문자, 문자열, 합계	
		number = 20;
		alphabet = '?';
		text = "Hello";
// 2-1 sum()메소드 호출 -> 2-2 이동
		sum = sum(number, 10);
// 2-3 sum()의 값을 sum에 할당

		
//	3. 출력 ( 문자, 문자열, 합계
		System.out.println(alphabet);// '?'출력
		System.out.println(text);// "Hello"출력
		System.out.println(sum);// 정수 s값 30 출력
	}
}
