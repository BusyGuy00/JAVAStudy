package day14.Exam01;

import java.util.Calendar;

public class CalendarExam {
public static void main(String[] args) {
	Calendar now = Calendar.getInstance();
	int year = now.get(Calendar.YEAR);
	int month = now.get(Calendar.MONTH)+1;
	int day = now.get(Calendar.DAY_OF_MONTH); //일
	int week = now.get(Calendar.DAY_OF_WEEK); // 요일
	
	String strWeek = null;
	switch(week) {
	case Calendar.MONDAY:
		strWeek = "월";
		break;
	
	case Calendar.TUESDAY:
		strWeek = "화";
		break;
	
	case Calendar.WEDNESDAY:
		strWeek = "수";
		break;
	
	case Calendar.THURSDAY:
		strWeek = "목";
		break;
	
	case Calendar.FRIDAY:
		strWeek = "금";
		break;
	
	case Calendar.SATURDAY:
		strWeek = "토";
		break;
	
	case Calendar.SUNDAY:
		strWeek = "일";
		break;
	}
	
	
	
	System.out.println("년도 :" + year);
	System.out.println("월 :" + month);
	System.out.println("일 :" + day);
	System.out.println("요일 :" + strWeek);
	
	int amPm = now.get(Calendar.AM_PM);
	String strAmpm = null;
	if(amPm == Calendar.AM) {
		strAmpm = "오전";
	}else {
		strAmpm = "오후";
	}
	int hour = now.get(Calendar.HOUR);
	int minute = now.get(Calendar.MINUTE);
	int second = now.get(Calendar.SECOND);
	
	System.out.println(strAmpm);
	System.out.println("시간 : " + hour);
	System.out.println("분 : " + minute);
	System.out.println("초 : " + second);
	
	

}
}
