package day14.bookT.Exam15.copy;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Exam15 {
public static void main(String[] args) {
//	LocalDateTime brith = LocalDateTime.of(2023,12,31,0,0);
//	LocalDateTime now = LocalDateTime.now();
//	
//	long untilDay = brith.until(now, ChronoUnit.DAYS);
//	System.out.println("연말 까지 :" + untilDay + "일이 남았다");
	LocalDateTime endDay = LocalDateTime.of(2023, 12, 31, 0,0,0);
	LocalDateTime now = LocalDateTime.now();
	
	long remainDays = now.until(endDay, ChronoUnit.DAYS);
	System.out.println("남은 일수 : " + remainDays);
	
	Date now2 = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ");
	System.out.println(sdf.format(now2));
	
}
}
