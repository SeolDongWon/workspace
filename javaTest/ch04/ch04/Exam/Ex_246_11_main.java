package ch04.Exam;

import java.util.Scanner;

public class Ex_246_11_main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		boolean flag = false;

		while(!flag)
		{
			System.out.printf("두 정수와 연산자를 입력하시오(10 10 +)(종료: 그만)>>");
			String aStr = scan.next();
			if(aStr.equals("그만")) {
				flag=true;
				continue;
			}
			int a = Integer.parseInt(aStr);
			int b = scan.nextInt();
			String operator = scan.next().trim();

			switch (operator)
			{
			case "+":
				Add add = new Add();
				add.setValue(a, b);
				System.out.printf("%d\n", add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.printf("%d\n", sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.printf("%d\n", mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(a, b);
				System.out.printf("%d\n", div.calculate());
				break;
			case "=":
				flag=true;
				break;
			default:
				System.out.printf("바르게 입력해주세요");
				break;
			}
			scan.nextLine();
		}//for end
		scan.close();
		System.out.printf("\nEND");
	}
}
