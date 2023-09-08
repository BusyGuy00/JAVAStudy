package day18.Exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExam {

	public static void main(String[] args) {
		//List 불변 컬렉션 생성 
		List<String> list1 = List.of("a","b","c");
//		list1.add("b");
//		list1.remove("b");	불변 컬렉션 이여서 수정이 불가능 하다 
		System.out.println(list1);

		//set 불변 컬렉션 생성 
		Set<String> set1 = Set.of("seta","setb","setc");
//		set1.remove("seta"); 수정이 불가능 하다 
		
		//Map불변 컬렉션 생성 
		Map<String, Integer> map1 = Map.of(
				"a",1,
				"b",2,
				"c",3
				);
		//List컬렉션을 불변 컬렉션으로 복사 
		List<Integer> list2 = new ArrayList();
		list2.add(1);
		list2.add(10);
		list2.add(12);
		
		//카피한 값을 수정 불가 컬렉션
		List<Integer> copylist = List.copyOf(list2);
		// copylist.add(13);
		Set<String> set2 = new HashSet<>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		
		Set<String> copyset = Set.copyOf(set2);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "A");
		map2.put(1, "B");
		map2.put(1, "C");
		
		Map<Integer, String> copymap = Map.copyOf(map2);
		
		//배열로 부터 List 불변 컬렉션 생성 
		String[] strArr = {"A","B","C"};
		List<String> list3 = Arrays.asList(strArr);
		
		
		
	}

}
