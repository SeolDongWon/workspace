package ch02.ex02;

import java.util.Scanner;

public class Exam_110_02
{
	public static void main(String[] args)
	{
//	1.번수선언초기값 ( 입력변수, 두자리정수, 10의자리, 1의자리, 결과내용
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number = 0, tenDigit = 0, oneDigit = 0;
		//	2. 정수입력(2자리만 입력받는다
		for (; true;)
		{
			System.out.print("자리 정수 입력(10~99)>>");
			number = scan.nextInt();
			scan.nextLine();
			if (100 > number && number > 9)
			{
				break;
			} else
			{
				System.out.print("");
			}
		}
//	3. 연산 (10의자리 정수/10 1의자리 정수 %10

		tenDigit = number / 10;
		oneDigit = number % 10;
		
		
//	4. 출력
		if(tenDigit==oneDigit) {
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.\n");
		}else {
			System.out.print("No! 10의 자리와 1의 자리가 다릅니다.\n");
			
		}
//	5. 종료
		
		scan.close();
		System.out.println("the end");
	}
}
