package day20.Exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class parallelStreamExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
	
	for(int i=1; i<=1000; i++) {
		list.add("greem"+ i);
	}
	Stream<String> stream = list.parallelStream();
	stream.forEach(name ->{
		//현재 사영된 스레드 빈환
		Thread thread = Thread.currentThread();
		System.out.println(name + " : " + thread.getName());
	});
	
	}
}
