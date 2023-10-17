package ch06.exam04;

import java.util.StringTokenizer;

public class Ex_04_main
{
	public static void main(String[] args)
	{
		String data = "a=3,b=5,c=6";
		StringTokenizer st = new StringTokenizer(data,"=,");
		int sum=0;
		while(st.hasMoreTokens()) {
			String _data = st.nextToken();
			try {
				int num = sum+Integer.parseInt(_data);
				sum = sum+ num;
			}catch(Exception e) {
				
			}
		}
		System.out.printf("합은 %d",sum);
	}
}
