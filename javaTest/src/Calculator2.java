import java.util.Scanner;

public class Calculator2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double[] numArray = new double[100];
		double cal1 = 0.0;
		String[] operArray = new String[100];

		System.out.printf("계산 마지막에 \'=\'입력하고 엔터\n");
		for (int i = 0; i < 100; i++)
		{
			numArray[i] = scan.nextDouble();
			operArray[i] = scan.next();
			if (operArray[i].equals(null) || numArray[i] == 0.0 || operArray[i].equals("="))
			{
				break;
			}
		}

		cal1 = numArray[0];

		for (int i = 0; i < 100; i++)
		{

			System.out.printf("%.1f ", numArray[i]);
			System.out.printf("%s ", operArray[i]);
			if (operArray[i].equals(null) || numArray[i] == 0.0 || operArray[i].equals("="))
			{
				break;
			}

		}
		System.out.printf("\n");

		for (int i = 0; i < 99; i++)
		{

			if (operArray[i].equals(null) || numArray[i] == 0.0 || operArray[i].equals("="))
			{
				break;
			}
			if (operArray[i].equals("+"))
			{
				cal1 = cal1 + numArray[i + 1];
			}
			if (operArray[i].equals("-"))
			{
				cal1 = cal1 - numArray[i + 1];
			}
			if (operArray[i].equals("*"))
			{
				cal1 = cal1 * numArray[i + 1];
			}
			if (operArray[i].equals("/"))
			{
				cal1 = cal1 / numArray[i + 1];
			}

		}
		System.out.printf("\n");
		System.out.printf("%.1f\n", cal1);

		scan.close();

	}
}
