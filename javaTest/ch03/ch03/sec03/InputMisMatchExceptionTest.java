package ch03.sec03;

import java.util.Scanner;

public class InputMisMatchExceptionTest
{
	public static String[] subjectNameArray = { "국어", "영어", "수학" };
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		int[] scoreArray = new int[3];

		for (int i = 0; i < scoreArray.length; i++)
		{
			try
			{
				System.out.printf("%s점수 입력 >> ", subjectNameArray[i]);
				scoreArray[i] = scan.nextInt();
			} catch (Exception e)
			{
				System.out.printf("점수를 잘못 입력\n");
				scan.nextLine(); // 입력버퍼클리어
				i = i - 1;
				continue;
			} finally
			{
			}
		}// end of for
	}
}
