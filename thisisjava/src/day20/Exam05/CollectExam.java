package day20.Exam05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList <>();
		stuList.add(new Student("홍길동","남",92));
		stuList.add(new Student("홍재라","여",85));
		stuList.add(new Student("김수민","남",79));
		stuList.add(new Student("이정하","여",90));
		stuList.add(new Student("강수지","여",73));
		
		//남학생만 새로운 list로 만들거다 
//		List<Student> maleList = stuList.stream()
//				.filter(s->s.getGender().equals("남"))
//				.collect(Collectors.toList());
		
		//java 16부터
		List<Student> maleList = stuList.stream()
				.filter(s->s.getGender().equals("남"))
				.toList(); 
		//list 출력 하기 
		maleList.stream()
		.forEach(s->System.out.println(s.getName()));
		
		//map으로 받기 
		Map<String , Integer> map = stuList.stream()
				.collect(Collectors.toMap(
						s->s.getName(), //Student 객체에서 key가 될 부분 리턴 
						s->s.getScore() //Student 객체에서 value(값)가 될 부분 리턴
						));
		System.out.println(map);

	}
	

}
