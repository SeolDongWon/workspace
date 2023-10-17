// 명령행 인자는 모두 정수만 입력바람
package ch03.exam;

public class Ex_167_11
{
	public static void main(String[] args)
	{
		int sum = 0;
		double avr = 0;

		for (int i = 0; i < args.length; i++)
		{
			sum += Integer.parseInt(args[i]);
			avr = sum / args.length;
		}
		avr = (double)sum/(double)(args.length);
		System.out.printf("합계:%d 평균값은 %.2f", sum, avr);

		System.out.printf("\nEND");
	}
}
