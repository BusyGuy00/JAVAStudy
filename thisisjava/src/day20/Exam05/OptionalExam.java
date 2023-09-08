package day20.Exam05;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExam {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//예외 발생 (java.util.NoSuchElementException)
//		double avg = list.stream()
//				.mapToInt(num ->num)
//				.average()
//				.getAsDouble();
		
		//예외 발생시 다른 방법 
		//방법 1
		OptionalDouble optional = list.stream()
				.mapToInt(num->num)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법 1평균 : " +optional.getAsDouble() );
		}else {
			System.out.println("방법 1평군 : 0.0");
		}
				
		//방법2 
		double avg = list.stream()
				.mapToInt(num->num)
				.average()
				.orElse(0.0);
		System.out.println("방법 2평균 : " + avg);
		
		//방법3
		list.stream()
		.mapToInt(num->num)
		.average()
		.ifPresent(a->System.out.println("하하핳"));
		
		
		
		
	}

}
