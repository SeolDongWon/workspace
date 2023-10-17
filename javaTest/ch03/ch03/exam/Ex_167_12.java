// 1. 명령행인자를 입력해서 거기서 정수만 골라서 합을 구한다.

package ch03.exam;

public class Ex_167_12
{
	public static void main(String[] args)
	{
		int[] intArgs = new int[args.length];
		boolean flag = false;
		int number = 0;
		int sum = 0;

		for (int i = 0; i < args.length; i++)
		{
			try
			{
				number = Integer.parseInt(args[i]);
			} catch (NumberFormatException e)
			{
				flag = true;
			}
			if (flag)
			{
				intArgs[i] = 0;
				flag = false;
			} else
			{
				intArgs[i] = number;
				sum +=number;
			}
		}

		System.out.printf("\n args[]:\n");
		for (int a : intArgs) {
			System.out.printf("%d%n", a);
		}
		System.out.printf("합: %d\n",sum);
		System.out.printf("END");
	}
}
