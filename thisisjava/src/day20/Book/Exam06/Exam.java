package day20.Book.Exam06;

import java.util.Arrays;
import java.util.List;

public class Exam {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동" ,30),
				new Member("신용권" ,40),
				new Member("김자바" ,26)
				);
		//오리지널 스트림
		double avg = list.stream()
				//double타입을 int로 변환
				.mapToInt(m->m.getAge())
				.average().getAsDouble();
		System.out.println("평균 나이 : " + avg);
	}

}
