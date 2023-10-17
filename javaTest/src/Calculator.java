import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double[] doubleArray = new double[5];
		double cal1 = 0.0;
		String[] stringArray = new String[5];

		System.out.printf("계산 입력 후 엔터\n");
		for (int i = 0; i < 5; i++)
		{
			doubleArray[i] = scan.nextDouble();
			stringArray[i] = scan.next();
		}

		cal1 = doubleArray[0];

		for (int i = 0; i < 5; i++)
		{
			System.out.printf("%.1f ", doubleArray[i]);
			System.out.printf("%s ", stringArray[i]);
		}
		System.out.printf("\n");

		for (int i = 0; i < 4; i++)
		{

			if (stringArray[i].equals(null) || doubleArray[i] == 0.0)
			{
				break;
			}
			if (stringArray[i].equals("+"))
			{
				cal1 = cal1 + doubleArray[i + 1];
			}
			if (stringArray[i].equals("-"))
			{
				cal1 = cal1 - doubleArray[i + 1];
			}
			if (stringArray[i].equals("*"))
			{
				cal1 = cal1 * doubleArray[i + 1];
			}
			if (stringArray[i].equals("/"))
			{
				cal1 = cal1 / doubleArray[i + 1];
			}

		}
		System.out.printf("\n");
		System.out.printf("%.1f\n", cal1);
		
		scan.close();

	}
}
