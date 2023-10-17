// 1. 정수를 입력(100이하 값을 받는다
// 2. 정수배열 생성한다 int[] n = new int[]
// 3. 배열에다가 1부터 100까지의 정수를 랜덤 삽입한다
// 4. 배열에는 같은 수는 안된다


package ch03.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_167_08
{
	public static void main(String[] aargs)
	{
		Scanner scan = new Scanner(System.in);
		int random = 0, num = 0;
		boolean flag = false;

		while (true)
		{
			System.out.print("1 ~ 100까지의 정수입력>>");
			try
			{
				num = scan.nextInt();
			} catch (Exception e)
			{
				System.out.println("정수만 입력해라");
				scan.nextLine();
				continue;
			}
			if (1 <= num && num <= 100)
			{
				break;
			} else
			{
				System.out.println("다른 키를 입력하지마세요");
				continue;
			}
		}

		int[] ranArray = new int[num];

		for (int i = 0; i < ranArray.length; i++)
		{
			random = (int) (Math.random() * 100 + 1);
			for (int j = 0; j < ranArray.length; j++)
			{
				if (random == ranArray[j])
				{
					flag = true;
					break;
				}
			}
			if (flag == false)
			{
				ranArray[i] = random;
			}else {
				flag = false;
				i--;
			}

		}
		System.out.println(Arrays.toString(ranArray));
		System.out.println("The end");
		scan.close();
	}

}
