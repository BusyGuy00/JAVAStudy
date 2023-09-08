package day17.Exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		//ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		//LinkedList컬렉션 객체 생성 
		List<String> list2 = new LinkedList<String>();
		
		//시작시간과 끝 시간을 저장할 변수 선언 
		long startTime;
		long endTime;
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list1.add(0,String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime));
		
		
		startTime = System.nanoTime();
		for (int i=0; i<100000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime));
	}
	
	
	
	

}
