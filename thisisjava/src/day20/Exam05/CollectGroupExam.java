package day20.Exam05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupExam {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList <>();
		stuList.add(new Student("홍길동","남",92));
		stuList.add(new Student("홍재라","여",85));
		stuList.add(new Student("김수민","남",79));
		stuList.add(new Student("이정하","여",90));
		stuList.add(new Student("강수지","여",73));
			//타입		밸류타입
//		Map<String,List<Student>> map = stuList.stream()
////							그룹핑으로 남자들을 묶어낸다	Map의 key 
//				.collect(Collectors.groupingBy(s->s.getGender()));
//		System.out.println(map);
		
		Map<String,Double> map = stuList.stream()
//				그룹핑으로 남자들을 묶어낸다	Map의 key지정
			.collect(Collectors.groupingBy(
					s->s.getGender(), //첫번째 매개변수 자리
					Collectors.averagingDouble(
							s->s.getScore()  //두번째 매개 변수 자리
							)
					));
		
		System.out.println(map);

		
//		//Map의 key 값을 받아 남자 회원을 출력 받는다.
//		List<Student> maleList = map.get("남");
//		maleList.stream().forEach(s ->System.out.println(s.getName()));
//		
//		List<Student> femaleList = map.get("여");
//		femaleList.stream().forEach(s ->System.out.println(s.getName()));
//		
		
	}
}
