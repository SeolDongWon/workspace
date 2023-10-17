package ch01.sec18;

import java.util.Scanner;

public class origin
{

	public static final double USD_RATE = 0.00075, EUR_RATE = 0.00069, LB_RATE = 0.0000059, YUAN_RATE = 0.0054;

	public static void main(String[] args)
	{

		// define variables name, initial value, currency rate, final, check
		// assign initial values to variables
		double init = 0.0, fin = 0.0, rate = 0.0;
		String curr = null, name = null, check = null;
		Scanner scan = new Scanner(System.in);

		// calculate variables
		for (int i = 0; i < 5; i = 1 + 1)
		{
			System.out.printf("Enter Name: \n");
			name = scan.nextLine();
			System.out.printf("Enter amount of WON to convert: \n");
			init = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter desired currency (USD, EUR, LB, or YUAN): ");
			curr = scan.next();
			scan.nextLine();

			// define rate depending on currency entered
			/*
			 * if(curr.equals("USD") || curr.equals("usd"))rate = 0.00075; else
			 * if(curr.equals("EUR") || curr.equals("eur"))rate = 0.00069; else
			 * if(curr.equals("LB") || curr.equals("lb"))rate = 0.0000059; else
			 * if(curr.equals("YUAN") || curr.equals("yuan"))rate = 0.0054; //if currency is
			 * entered wrong, restart else { System.out.
			 * println("Please restart and enter one of the available exchange rates");
			 * break; }
			 */

			switch (curr)
			{
			case "USD":
				rate = USD_RATE;
			case "usd":
				rate = USD_RATE;
				break;
			case "EUR":
				rate = EUR_RATE;
			case "eur":
				rate = EUR_RATE;
				break;
			case "LB":
				rate = LB_RATE;
			case "lb":
				rate = LB_RATE;
				break;
			case "YUAN":
				rate = YUAN_RATE;
			case "yuan":
				rate = YUAN_RATE;
				break;
			default:
				rate = 1;
			}

			if (rate == 1)
				curr = "WON";
			// calculate final value
			fin = init * rate;

			// print currency exchange rate
			System.out.printf("Hello %s,\n%.0f WON in %s is %.2f %s \n", name, init, curr, fin, curr);
			// confirm if user wants transaction made
			System.out.printf(
					"If you would like to make the transaction, type 'Yes' If you would like to start over, type 'No'");
			check = scan.next();

			// end if affirmative, restart if not
			if (check.equals("Yes") || check.equals("yes"))
			{
				System.out.println("The transaction has been made.");
				break;
			} else
			{
				scan.nextLine();
				System.out.printf("-------------------------------------------------\n");
			}
		}
		// close
		System.out.println("Thank you");
		scan.close();
	}

}
