package TEST;

public class Ex_167_13_3
{
	public static void main(String[] args)
	{
		int tens = 0, ones = 0;
		boolean tensflag = false, onesflag = false;

		for (int i = 0; i < 100; i++)
		{
			tens = i / 10;
			ones = i % 10;

			tensflag = tens != 0 && tens % 3 == 0;
			onesflag = ones != 0 && ones % 3 == 0;

			if (tensflag && onesflag)
			{
				System.out.printf("%d 박수 짝짝\n", i);
			} else if ((tensflag || onesflag))
			{
				System.out.printf("%d 박수 짝\n", i);
			}
		}
	}
}
