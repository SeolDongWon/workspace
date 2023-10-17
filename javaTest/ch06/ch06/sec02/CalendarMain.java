package ch06.sec02;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarMain
{
	public static void main(String[] args)
	{
		// 현재날짜정보를 가져와라.
		boolean flag = false;
		while (!flag)
		{
			TimeZone time = TimeZone.getTimeZone("America/New_York");
			
			flag = true;
			Calendar now = Calendar.getInstance();
//			now.clear();
//			now.set(2023, 9, 15);
//			now.set(Calendar.HOUR_OF_DAY, 15);
//			now.set(Calendar.MINUTE, 30);
//			now.set(Calendar.SECOND, 20);
//			// System.out.printf("%s\n", now.toString());
//			System.out.printf("\n");
			
			TimeZone _time = now.getTimeZone();
			System.out.printf("time zone = %s \n", time.getID());
			

			// 년도
			int year = now.get(Calendar.YEAR);
			System.out.printf("year=%d ", year);
			// 달
			int month = now.get(Calendar.MONTH);
			System.out.printf("month=%d ", month + 1);
			// 날짜
			int day = now.get(Calendar.DAY_OF_MONTH);
			System.out.printf("day=%d ", day);
			// 요일
			int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
			String s_dayOfWeek = null;
			switch (dayOfWeek)
			{
			case Calendar.SUNDAY:
				s_dayOfWeek = "일";
				break;
			case Calendar.MONDAY:
				s_dayOfWeek = "월";
				break;
			case Calendar.TUESDAY:
				s_dayOfWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				s_dayOfWeek = "수";
				break;
			case Calendar.THURSDAY:
				s_dayOfWeek = "목";
				break;
			case Calendar.FRIDAY:
				s_dayOfWeek = "금";
				break;
			case Calendar.SATURDAY:
				s_dayOfWeek = "토";
				break;
			}
			System.out.printf("dayOfWeek=%s요일 ", s_dayOfWeek);
			// 오전, 오후
			int am_pm = now.get(Calendar.AM_PM);
			String s_am_pm = null;
			s_am_pm = (am_pm == Calendar.AM) ? "오전" : "오후";
			System.out.printf("s_am_pm=%s ", s_am_pm);
			// 시간
			int hour = now.get(Calendar.HOUR);
			System.out.printf("hour=%d ", hour);
			// 24시간
			int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
			System.out.printf("24hour=%d ", hourOfDay);
			// 분
			int MINUTE = now.get(Calendar.MINUTE);
			System.out.printf("MINUTE=%d ", MINUTE);
			// 초
			int SECOND = now.get(Calendar.SECOND);
			System.out.printf("SECOND=%d ", SECOND);
			int SECOND2 = now.get(Calendar.SECOND)+30;
			System.out.printf("SECOND=%d ", SECOND2);
			// 밀리초
			int MILLISECOND = now.get(Calendar.MILLISECOND);
			System.out.printf("MILLISECOND=%d ", MILLISECOND);
		}
	}
}
