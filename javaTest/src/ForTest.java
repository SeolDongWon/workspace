import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ForTest
{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println(Calendar.getInstance().getTime());
		System.out.println(new Date());
	//	System.out.println(System.currentTimeMillis());
		long secondEnd = System.currentTimeMillis();
		long tenSecond = secondEnd + 10_000;
		System.out.printf("%d\n",secondEnd);
		System.out.printf("%d\n",tenSecond);
		int n = (int)(tenSecond-secondEnd);
		System.out.printf("%d\n",n);
	}
}