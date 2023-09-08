package day20.Exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExam {

	public static void main(String[] args) {
		//List 컬렉션 
		
		List <String> list = new ArrayList<>();
		list.add("강수지");
		list.add("이재라");
		list.add("김그린");
		list.add("김그린");
		list.add("김범수");
		
		//스트림 생성 
		Stream<String> stream = list.stream();
		stream.forEach(str-> System.out.println(str)); // 대열 출력
		
		System.out.println("=====================");
		//중복요소 제거 
		list.stream().distinct()
		.forEach(str ->System.out.println(str));
		
		System.out.println("=====================");
		
		list.stream().distinct()
		.filter(f -> f.startsWith("김")) // 원하는 값이 들어간 것을 필터링 한다. 
		.forEach(str -> System.out.println(str));

	}

}
