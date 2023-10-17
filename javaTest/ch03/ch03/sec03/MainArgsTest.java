package ch03.sec03;

public class MainArgsTest
{
	public static void main(String[] args)
	{
		System.out.printf("args의 길이:%d\n",args.length);
		
		for(int i=0;i<args.length;i++) {
			System.out.printf("args[%d] = %s\n",i, args[i]);
		}
	}
}
