package ch02.sec04;

public class AssignmentIncDecOperator
{
	public static void main(String[] args)
	{
		int a = 3, b = 3, c = 3;

		// 대입연산자 사례
		a += 3;	// a=a+3=6
		b *= 3;	// b=b*3=9
		c %= 2;	// c=c%2=1
		System.out.printf("a=%d, b=%d, c=%d \n", a, b, c);

		int d = 3;
		// 증감연산자 사례
		a = d++;	//a=3,b=4
		System.out.printf("a=%d,d=%d\n", a, d);
		a = ++d;	//d=5,a=5
		System.out.printf("a=%d,d=%d\n", a, d);
		a = d--;	//a=5,d=4
		System.out.printf("a=%d,d=%d\n", a, d);
		a = --d;	//d=3,a=3
		System.out.printf("a=%d,d=%d\n", a, d);
		
	}
}
