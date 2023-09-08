package day20.Exam04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExam {

	public static void main(String[] args) {
		//List 컬렉션 생성 
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("김그린", 30));
		studentList.add(new Student("이재라", 10));
		studentList.add(new Student("유미정", 20));
		
		//점수를 기준으로 오름차순 정렬한 새 스트림 얻기 
		
//		studentList.stream()
//		.sorted()
//		.forEach(s -> System.out.println(s.getName()+ " : " +s.getScore()));
		studentList.stream()
//		.sorted((s1,s2)->{
//			if(s1.getScore() < s2.getScore(){
//				return-1;
//			}else if (s1.getScore() == s2.getScore(){
//				return 0;
// 		});
			
//		or
		//오름 차순
//		.sorted((s1,s2)-> Integer.compare(s1.getScore(),s2.getScore())) 
		
		//내림차순 정렬로 바뀐다 . implements Comparable<Student>를 해주어야 한다 
		.sorted(Comparator.reverseOrder())
		//내림 차순
//		.sorted((s1,s2)-> Integer.compare(s2.getScore(),s1.getScore())) 
		.forEach(s -> System.out.println(s.getName()+ " : " +s.getScore()));
		
		
	}
	
}
