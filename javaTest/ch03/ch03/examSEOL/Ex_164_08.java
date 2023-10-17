// 정수의 개수를 입력받아 1~100까지 랜덤하게 출력
package ch03.examSEOL;

import java.util.Scanner;

public class Ex_164_08
{
	public static void main(String[] args)
	{
		// 1 변수선언&초기화
		Scanner scan = new Scanner(System.in);
		int inputNum = 0; // 정수개수변수
		boolean flag = false;

		// 2 정수 개수 입력(1~99)
		for (; true;)
		{
			System.out.printf("정수 몇개?");
			try
			{
				inputNum = scan.nextInt();
			} catch (Exception e)
			{
				scan.nextLine();
			}
			if (0 < inputNum && inputNum < 100)
			{
				scan.close();
				break;
			}
		}
		// 입력한 정수개수만큼 정수배열 선언
		int[] numArray = new int[inputNum];

		// 3 출력
		for (int i = 0; i < numArray.length; i++)
		{
			flag = false;
			numArray[i] = (int) (Math.random() * 100 + 1);

			for (int j = 0; j < i; j++)
			{ // 중복값 체크
				if (numArray[i] == numArray[j])
				{
					flag = true;
					i--;
					break;
				}
			}
			if (flag == true)
			{ // 중복값 체크했으면 돌아감
				continue;
			}

		}

		int row = 0;
		for (int data : numArray)
		{
			row = row + 1;
			System.out.printf("%d\t", data);
			if (row % 10 == 0)
			{
				System.out.printf("\n");
			}

		}

		// 5 종료
		scan.close();
		System.out.printf("END");
	}
}
