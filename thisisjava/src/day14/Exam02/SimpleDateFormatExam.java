package day14.Exam02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam {
	
	public static void main(String[] args) {
	
		Date now = new Date(); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf2.format(now));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf3.format(now));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss ");
		System.out.println(sdf4.format(now));
		
		
	}
	
}
