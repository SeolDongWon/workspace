package ch06.exam_0;
import java.util.Calendar;

public class Ex_385_5{
	public static void main(String[] args){
		Calendar now = Calendar.getInstance();
		
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		
		String greet = null;
		if(4<=hour24&&hour24<12) {
			greet = "Good Morning";
		}else if(12<=hour24&&hour24<18) {
			greet = "Good Afternoon";
		}else if(18<=hour24&&hour24<22) {
			greet = "Good Evening";
		}else {
			greet = "Good Night";
		}
		
		System.out.printf("현재 시간은 %d시 %d분입니다.\n",hour,minute);
		System.out.printf("%s",greet);
	}
}
