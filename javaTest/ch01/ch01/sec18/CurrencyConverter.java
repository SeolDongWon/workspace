//설계 목적:
//원으로 된 금액을 -> 달러/유로/파운드/위안 화폐교환
//변수: name (입력), init 환전 할 금액 (입력), rate 환전률,  fin 최종 금액, check 확인

package ch01.sec18;

import java.util.Scanner;

public class CurrencyConverter
{
	// 상수
	public static final double USD_RATE = 0.00075, EUR_RATE = 0.00069, LB_RATE = 0.0000059, YUAN_RATE = 0.0054;

	public static void main(String[] args)
	{

		// define variables name, initial value, currency rate, final, check
		// assign initial values to variables
		double init = 0.0, finalValue = 0.0, rate = 0.0;
		String curr = null, name = null, check = null;
		Scanner scan = new Scanner(System.in);

		// calculate variables
		for (int i=0;i<5;i++)
		{
			System.out.printf("Enter Name: \n");
			name = scan.nextLine();
			System.out.printf("Enter amount of WON to convert: \n");
			init = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter desired currency (USD, EUR, LB, or YUAN): ");
			curr = scan.next();
			scan.nextLine(); // clear input buffer

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

			// curr 문자열 값을 대문자로 변환한다
			curr = curr.toUpperCase();
			switch (curr)
			{
			case "USD":
				rate = USD_RATE;
				break;
			case "EUR":
				rate = EUR_RATE;
				break;
			case "LB":
				rate = LB_RATE;
				break;
			case "YUAN":
				rate = YUAN_RATE;
				break;
			default:
				rate = 1;
				curr = "WON";
			}

			// calculate final value
			finalValue = init * rate;

			// print currency exchange rate
			System.out.printf("Hello %s,\n%.0f WON in %s is %.2f %s \n", name, init, curr, finalValue, curr);
			// confirm if user wants transaction made
			System.out.printf(
					"If you would like to make the transaction, type 'Yes' If you would like to start over, type 'No'");
			check = scan.next();

			// end if affirmative, restart if not
			check=check.toUpperCase();
			if (check.equals("YES"))
			{
				System.out.println("The transaction has been made.");
				break;
			} else
			{	//clear input buffer
				scan.nextLine();
				System.out.printf("-------------------------------------------------\n");
				continue;
			}

		} // end of for
			// close
		System.out.println("Thank you");
		scan.close();
	}
	
}
