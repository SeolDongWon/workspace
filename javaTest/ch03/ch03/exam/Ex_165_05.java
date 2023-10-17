// 양의 정수 10개 입력, for, Math.random()
// int[10] numArray
// 배열에 저장되어있는 수에서 3의 배수 출력 for, data%3 == 0
package ch03.exam;

public class Ex_165_05
{
	public static void main(String[] args)
	{
		// 1. 변수선언
		// 2. 변수초기값 설정
		int[] numArray = new int[10];

		// 3. 입력
		System.out.printf("양의 정수 10개를 입력하시오>>\n");
		for (int i = 0; i < numArray.length; i++)
		{
			numArray[i] = (int) (Math.random() * (Integer.MAX_VALUE+1));
			System.out.printf("%d\n", numArray[i]);
		}

		// 3. 연산, 처리
		// 4. 출력
		System.out.printf("3의 배수는 >> ");
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] % 3 == 0)
			{
				System.out.printf("%d ", numArray[i]);
			}
		}
	}
}
