import java.util.Scanner;

public class Calculator4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double result = 0.0;
		String oper = null;

		System.out.printf("계산 마지막에 \'=\'입력하고 엔터\n");
		oper = scan.nextLine();
		String[] oper2 = oper.split(" ");
		double[] numArrayC = new double[oper2.length / 2];
		String[] operArrayC = new String[oper2.length / 2];

		for (int i = 0; i < oper2.length; i++)
		{
			if (i % 2 == 0)
			{
				numArrayC[i / 2] = Double.parseDouble(oper2[i]);
			} else
			{
				operArrayC[i / 2] = oper2[i];
			}
		}

		result = numArrayC[0];

		for (int i = 0; i < oper2.length; i++)
		{

			System.out.printf("%.1f ", numArrayC[i]);
			System.out.printf("%s ", operArrayC[i]);
			if (operArrayC[i].equals(null) || operArrayC[i].equals("="))
			{
				break;
			}

		}
		System.out.printf("\n");

		for (int i = 0; i < oper2.length - 1; i++)
		{

			if (operArrayC[i].equals(null) || operArrayC[i].equals("="))
			{
				break;
			}
			if (operArrayC[i].equals("+"))
			{
				result = result + numArrayC[i + 1];
			}
			if (operArrayC[i].equals("-"))
			{
				result = result - numArrayC[i + 1];
			}
			if (operArrayC[i].equals("*"))
			{
				result = result * numArrayC[i + 1];
			}
			if (operArrayC[i].equals("/"))
			{
				result = result / numArrayC[i + 1];
			}

		}
		System.out.printf("\n");
		System.out.printf("%.1f\n", result);

		scan.close();
		System.out.printf("종료");

	}
}
