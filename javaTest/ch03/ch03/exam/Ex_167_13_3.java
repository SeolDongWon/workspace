package ch03.exam;

public class Ex_167_13_3
{
	public static void main(String[] args)
	{
		int tens = 0, ones = 0;
		boolean onesFlag = false, tensFlag = false;

		for (int i = 0; i < 100; i++)
		{
			// 1의자리
			ones = i % 10;
			// 10의자리
			tens = i / 10;
			// 10의자리와 1의자리 짝 여부
			onesFlag = (ones != 0 && ones % 3 == 0);
			tensFlag = (tens != 0 && tens % 3 == 0);

			if (onesFlag && tensFlag)
			{
				System.out.printf("%d 박수 짝짝\n", i);
			} else if (onesFlag || tensFlag)
			{
				System.out.printf("%d 박수 짝\n", i);
			}
		}
	}
}
