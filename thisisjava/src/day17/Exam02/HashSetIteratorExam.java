package day17.Exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteratorExam {

	public static void main(String[] args) {
		//Hasjset 컬렉션 생성 
		Set<String> set = new HashSet<>();

		//객체 추가 
		set.add("java");
		set.add("JSP");
		set.add("Spring");
		set.add("javascriot");
		
		//객체를 하났끼 가져와라
		//반복자 ㅇㅇ생성
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext() ) {
			//객체를 하나씩 가져오기 
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("java")) {
				iterator.remove();
			}
		}
		System.out.println("------------------------------------");
		for(String element : set) {
			System.out.println(element);
		}
		
		
		
		
	}

}
