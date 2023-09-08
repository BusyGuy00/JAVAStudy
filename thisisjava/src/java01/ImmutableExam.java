package java01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExam {
	public static void main(String[] args) {
		//List 불변 컬렉션 생성하기
		List<String> list1 = List.of("A", "B", "C");
		
		
		//Set 불변 컬렉션 생성하기 
		Set<String> set1 = Set.of("A","B","C");
		
		//Map 불변 컬렉션 생성하기
		Map<Integer, String> map1 =Map.of(1,"A",2,"B",3,"C");
		
		//copyOf사용하기
		List<String> list2 = new ArrayList<>();
		list2.add("가");
		list2.add("나");
		list2.add("다");
		
		List<String> list3 = List.copyOf(list2);
		
		Set<String> set2 = new HashSet<>();
		set2.add("가");
		set2.add("나");
		set2.add("다");
		Set<String> set3 = Set.copyOf(set2);
		
		//배열로 부터 List 불변 컬렉션 생성 
		String[] arr = {"a","b","c"};
		List<String> list4 = Arrays.asList(arr);
		System.out.println(list4);
		
		
	}
}
