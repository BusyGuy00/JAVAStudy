package day17.Exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		//객체 저장 
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/jsp");
		set.add("java");
		set.add("aaaa");
		
		//저장된 객체 수 
		int size = set.size();
		System.out.println(size); //set.add("java");가 동등객체로써 있어서 4개로 인식한다.
		
		for(String str: set) {
			System.out.println(str);
		}
		
		Set<Member> set2 = new HashSet<>();
		//Member 객체 저장 
		set2.add(new Member("김그린",30));
		set2.add(new Member("김그린",30));
		
		//저장된 객체 수 
		int size2 = set2.size();
		System.out.println(size2);
		
	}
}
