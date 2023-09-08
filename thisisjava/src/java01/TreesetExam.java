package java01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesetExam {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		//객체 저장 
		treeSet.add(80);
		treeSet.add(10);
		treeSet.add(6);
		treeSet.add(82);
		treeSet.add(26);
		treeSet.add(33);
		treeSet.add(40);
		
		//자동으로 오름차순 정렬을 한다.
		System.out.println(treeSet);
		
		Integer firstNum = treeSet.first();
		Integer lastNum = treeSet.last();
		System.out.println("가장 작은 수는 : " + firstNum);
		System.out.println("가장 작은 수는 : " + lastNum);
		
		//30보다 작은 수 출력 false를 true로 바꾸면 30포함 30보다 더 작은 수 출력
		NavigableSet<Integer> rangeSet = treeSet.headSet(30, false);
		//36보다 큰 수를 출력 
		NavigableSet<Integer> rangeSet2 = treeSet.tailSet(36, false);
		System.out.println(rangeSet);
		System.out.println(rangeSet2);
		//20부터 50 사이 값 출력
		NavigableSet<Integer> rangeSet3 = treeSet.subSet(20,false,50,false);
		System.out.println(rangeSet3);
		
	}
}
