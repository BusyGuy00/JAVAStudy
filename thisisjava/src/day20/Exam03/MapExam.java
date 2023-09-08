package day20.Exam03;

import java.util.ArrayList;
import java.util.List;

public class MapExam {
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("김그린",85));
		studentList.add(new Student("이재라",90));
		studentList.add(new Student("강수지",82));
		studentList.add(new Student("홍승민",75));
		studentList.add(new Student("김지은",60));
		
		studentList.stream()
		.mapToInt( s -> s.getScore())
		.forEach(score -> System.out.println(score));
		
		
		System.out.println("==================================");
		//70이상
		studentList.stream()
		.mapToInt( s -> s.getScore())
		.filter( num-> num >=70)
		.forEach(s->System.out.println(s));
		
		System.out.println("==================================");
		//70이상의 평균 
		double avg = studentList.stream()
		.mapToInt(s -> s.getScore())
		.filter(num-> num >=70)
		.average().getAsDouble();
		System.out.println(avg);
	}
}
