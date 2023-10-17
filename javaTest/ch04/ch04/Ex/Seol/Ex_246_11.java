package ch04.Ex.Seol;

import java.util.Scanner;

class Add
{
	private int a;
	private int b;

	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public int calculate()
	{
		return a + b;
	}
}

class Sub
{
	private int a;
	private int b;

	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public int calculate()
	{
		return a - b;
	}
}

class Mul
{
	private int a;
	private int b;

	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public int calculate()
	{
		return a * b;
	}
}

class Div
{
	private int a;
	private int b;

	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public int calculate()
	{
		return a / b;
	}
}

public class Ex_246_11
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		int num1 = 0, num2 = 0;
		String oper = null;
		int result = 0;

		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		System.out.printf("두 정수와 연사자를 입력하시오>>");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		oper = scan.next();
		scan.nextLine();

		switch (oper)
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
			break;
		}
		System.out.printf("%d", result);
	}
}
