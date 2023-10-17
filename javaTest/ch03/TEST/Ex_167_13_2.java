package TEST;

public class Ex_167_13_2
{
	public static void main(String[] args)
	{
		int tens = 0, ones = 0;
		String tenX = null, oneX = null;

		for (int i = 0; i < 100; i++)
		{
			tens = i / 10;
			ones = i % 10;
			tenX = "";
			oneX = "";

			if (tens != 0 && tens % 3 == 0)
			{
				tenX = "짝";
			}
			if (ones != 0 && ones % 3 == 0)
			{
				oneX = "짝";
			}
			if (tenX.equals("짝") || oneX.equals("짝"))
			{
				System.out.printf("%d 박수 %s%s\n", i, tenX, oneX);
			}
		}
	}
}
