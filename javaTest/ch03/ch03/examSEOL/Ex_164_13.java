// 1~100까지 369 박수 짝짝
package ch03.examSEOL;

public class Ex_164_13
{
	public static void main(String[] args)
	{	// 1. 변수선언 초기화 - 10의자리,1의자리
		int tenDigit = 0;
		int oneDigit = 0;
		// 2. 연산&출력
		for (int i = 0; i < 100; i++)
		{
			tenDigit = i / 10;
			oneDigit = i % 10;
			if ((tenDigit != 0 && tenDigit % 3 == 0) && (oneDigit != 0 && oneDigit % 3 == 0))
			{ // tenDigit가 0이 아니고 3의 배수면
				System.out.printf("%d 박수 짝짝\n", i);
			}
			if ((tenDigit != 0 && tenDigit % 3 == 0) ^ (oneDigit != 0 && oneDigit % 3 == 0))
			{ // oneDigit가 0이 아니고 3의 배수면
				System.out.printf("%d 박수 짝\n", i);
			}
		}

		// 3. 종료
		System.out.printf("END");
	}


	
}
