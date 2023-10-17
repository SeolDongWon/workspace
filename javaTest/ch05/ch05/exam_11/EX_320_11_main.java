package ch05.exam_11;

import java.util.Scanner;

public class EX_320_11_main
{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{

		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		int a = 0;
		
		
		int b = 0;

		boolean flag = false;
		while (!flag)
		{

			System.out.printf("두 정수 연산자 입력>>(-1 : 종료)");

			a = scan.nextInt();
			if (a == -1)
			{
				break;
			}
			b = scan.nextInt();
			String op = scan.next().trim();
			scan.nextLine();// 버퍼클리어

			switch (op)
			{
			case "+":
				add.setValue(a, b);
				System.out.printf("%d\n", (int)add.calculate());
				break;
			case "-":
				sub.setValue(a, b);
				System.out.printf("%d\n", (int)sub.calculate());
				break;
			case "*":
				mul.setValue(a, b);
				System.out.printf("%d\n", (int)mul.calculate());
				break;
			case "/":
				div.setValue(a, b);
				System.out.printf("%.2f\n", div.calculate());
				break;
			case "=":
				flag = true;
				break;
			default:
				System.out.printf("정신차려\n");
				break;
			}
		} // for end
		System.out.printf("\nEND");
	}
}
