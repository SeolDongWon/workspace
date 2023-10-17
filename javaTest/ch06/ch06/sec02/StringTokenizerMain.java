package ch06.sec02;

import java.util.Calendar;
import java.util.StringTokenizer;

public class StringTokenizerMain
{
	public static void main(String[] args)
	{
		String data = "홍길동/장화/홍련/콩쥐/팥쥐";
		String[] dataArray = data.split("/");
		
		for(int i= 0;i<dataArray.length;i++) {
			System.out.printf("%s\t",dataArray[i]);
		}
		System.out.printf("\n=======================\n");
		StringTokenizer stn = new StringTokenizer(data,"/");
		
		
		while(stn.hasMoreTokens()) {
			System.out.printf("%s\t",stn.nextToken());
		}
		System.out.printf("\n");
		int am_pm = Calendar.AM_PM;
		Calendar now = Calendar.getInstance();
		System.out.printf("%d\n",am_pm);
		System.out.printf("%d\n",now.get(Calendar.AM_PM));
		
		//System.out.println(now);
		
		
		
		System.out.printf("\nEND");
	}
}
