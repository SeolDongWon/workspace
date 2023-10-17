package seol.test;

public class Hello
{
	public static void main(String[] args)
	{
		System.out.printf("Hello");
		for(int i=0;i<args.length;i++) {
		System.out.printf("%s",args[i]);
		}
	}
}
