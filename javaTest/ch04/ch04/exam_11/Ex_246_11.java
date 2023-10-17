package ch04.exam_11;

import java.util.Scanner;

public class Ex_246_11
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		int num1 = 0; // 연산정수1
		int num2 = 0; // 연산정수2
		int result = 0; // 연산결과
		String num1Str = null; // 종료문자열
		String operator = null; // 연산자
		boolean flag = false;

		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		while (!flag)
		{
			// 입력
			System.out.printf("두 정수와 연산자를 입력하시오>>(1 1 +)(종료:그만)");
			num1Str = scan.next();
			// 종료
			if (num1Str.equals("그만"))
			{
				flag = true;
				continue;
			}
			// 잘못입력
			try
			{
				num2 = scan.nextInt();
				operator = scan.next();
				num1 = Integer.parseInt(num1Str);
			} catch (Exception e)
			{
				System.out.printf("제대로 입력하세요\n");
				continue;
			} finally
			{
				scan.nextLine();
			}
			// 연산
			switch (operator)
			{
			case "+":
				add.setValue(num1, num2);
				result = add.calculate();
				break;
			case "-":
				sub.setValue(num1, num2);
				result = sub.calculate();
				break;
			case "*":
				mul.setValue(num1, num2);
				result = mul.calculate();
				break;
			case "/":
				div.setValue(num1, num2);
				result = div.calculate();
				break;
			default:
				System.out.printf("제대로 입력하세요\n");
				continue;
			}
			System.out.printf("%d\n", result);
		}
		scan.close();
		System.out.printf("\nEND");
	}
}

class Add
{
	private int a, b;

	public Add()
	{
	}

	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public int calculate()
	{
		return this.a + this.b;
	}

}

class Sub
{
	private int a, b;

	public Sub()
	{
	}

	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public int calculate()
	{
		return this.a - this.b;
	}

}

class Mul
{
	private int a, b;

	public Mul()
	{
	}

	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public int calculate()
	{
		return this.a * this.b;
	}

}

class Div
{
	private int a, b;

	public Div()
	{
	}

	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public int calculate()
	{
		return this.a / this.b;
	}

}
