// cmd로 입력 출력
public class Add
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 0; i < args.length; i++)
		{
			try
			{
				sum += Integer.parseInt(args[i]);
			} catch (NumberFormatException e)
			{
			}
		}
		System.out.printf("%d", sum);
	}
}
