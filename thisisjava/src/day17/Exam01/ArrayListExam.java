package day17.Exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	


	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("JDBC");
		list.add("servlet");
		list.add(1, "green" );
		
		//총개수
		//get(index) 해당 순번을 반환 
		//contains(E) 주어진 객체가 있는지 반환 
		//remove (E)  해딩 객체 제거 
		//remove (index) 해당 순번 제거
		//clear() 객체 전부 제거
		//isEmpty() 비어있는지 조사 비어져 있으면 true 아니면 false
		
		int listSize = list.size();
		System.out.println(list.get(1));
		System.out.println("총개수 : " + listSize);
		boolean result = list.contains("java");
		boolean result2 = list.contains("abc");
		
		System.out.println(result);
		System.out.println(result2);
		
		list.clear();
		System.out.println(list.isEmpty());
		
		List list2 = new ArrayList<>();
		System.out.println(list2.size());
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		System.out.println(list2);
		for (int i=list2.size()-1; i>=0; i--) {
			list2.remove(i);
			System.out.println(list2);
		}
		
		
		
		
		
		
	}
}
