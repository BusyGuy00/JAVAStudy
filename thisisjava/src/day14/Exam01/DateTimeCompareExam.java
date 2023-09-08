package day14.Exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExam {

	public static void main(String[] args) {
		//2023 1월 1일 2023 12월 31객체
		//문자열 데이터 포맷 지정 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime startDay = LocalDateTime.of(2022,1,1,0,0,0);
		System.out.println("시작일 : " + startDay.format(dtf));
		
		LocalDateTime endDay = LocalDateTime.of(2022,12,31,0,0,0 );
		System.out.println("종료일 : " + endDay.format(dtf));
		
		if(startDay.isBefore(endDay)) {
			System.out.println("진행중 입니다.");
		}else if (startDay.isEqual(endDay)) {
			System.out.println("종료 했습니다.");
		}else if(startDay.isAfter(endDay));{
		System.out.println("종료 했습니다.");
	}
	long remainYear = startDay.until(endDay, ChronoUnit.YEARS);
	long remainMonths = startDay.until(endDay, ChronoUnit.MONTHS);
	long remainDays = startDay.until(endDay, ChronoUnit.DAYS);
	
	System.out.println("남은 해는 : " + remainYear);
	System.out.println("남은 월은 : " + remainMonths);
	System.out.println("남은 일은 : " + remainDays);
	
	LocalDateTime birth = LocalDateTime.of(2023, 2, 5, 0, 0);
	LocalDateTime now = LocalDateTime.now();
	
	long untilDay = birth.until(now, ChronoUnit.DAYS);
	System.out.println("내가 태어난지 " + untilDay + "일이 지났음");
	
	}


	}


