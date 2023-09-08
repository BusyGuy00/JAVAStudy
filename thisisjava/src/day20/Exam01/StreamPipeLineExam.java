package day20.Exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExam {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList <>();
		list.add(new Student("홍길동", 10));
		list.add(new Student("김그린", 20));
		list.add(new Student("김길동", 30));
		//방법1
		//오리지널 스트림
		Stream<Student> studentStream = list.stream();
		
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		//최종 처리
		double avg = scoreStream.average().getAsDouble();
		System.out.println(avg);
		System.out.println(scoreStream);
		
		
		double avg2 = list.stream()
					.mapToInt(student -> student.getScore())
					.average()
					.getAsDouble();
					System.out.println(avg2);
	}	
}
