import java.util.Scanner;

public class Calculator3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arraySize = 2000;
		double result = 0.0;
		double[] numArray = new double[arraySize];
		String[] operArray = new String[arraySize];

		System.out.printf("계산 마지막에 \'=\'입력하고 엔터\n");
		for (int i = 0; i<arraySize; i++)
		{
			numArray[i] = scan.nextDouble();
			operArray[i] = scan.next();
			if (operArray[i].equals(null) || operArray[i].equals("="))
			{
				break;
			}
		}

		result = numArray[0];

		for (int i = 0; i < arraySize; i++)
		{

			System.out.printf("%.1f ", numArray[i]);
			System.out.printf("%s ", operArray[i]);
			if (operArray[i].equals(null) || operArray[i].equals("="))
			{
				break;
			}

		}
		System.out.printf("\n");

		for (int i = 0; i < arraySize - 1; i++)
		{

			if (operArray[i].equals(null) || operArray[i].equals("="))
			{
				break;
			}
			if (operArray[i].equals("+"))
			{
				result = result + numArray[i + 1];
			}
			if (operArray[i].equals("-"))
			{
				result = result - numArray[i + 1];
			}
			if (operArray[i].equals("*"))
			{
				result = result * numArray[i + 1];
			}
			if (operArray[i].equals("/"))
			{
				result = result / numArray[i + 1];
			}

		}
		System.out.printf("\n");
		System.out.printf("%.1f\n", result);

		scan.close();

	}
}
