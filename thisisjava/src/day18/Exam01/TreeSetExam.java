package day18.Exam01;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		// TreeSet 컬렉션 생성하기  Set인터페이스 구현 
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		//객체 저장 
		treeSet.add(10);
		treeSet.add(7);
		treeSet.add(12);
		treeSet.add(5);
		treeSet.add(19);
		treeSet.add(1);
		
		System.out.println(treeSet);
		
		Integer firstNum = treeSet.first();
		Integer lastNum = treeSet.last();
		System.out.println(firstNum);
		System.out.println(lastNum);
		Integer lowerNum = treeSet.lower(7);
		System.out.println("7보다 작은 숫자 : " + lowerNum);
		Integer highNum = treeSet.higher(10);
		System.out.println("10 보다 큰 숫자 : " + highNum);
		Integer floorNum = treeSet.floor(10);
		System.out.println(floorNum); // 해당 하는숫자를 출력 해준다 없으면 그것보다 바로 작은 수를 찾아서 출력 한다 
		
		System.out.println("------------------");
		
		//내림 차순 반복자 리턴 descendingIterator()
		Iterator<Integer> iterator = treeSet.descendingIterator();
		while(iterator.hasNext()) {
			int a = iterator.next();
			System.out.println(a);
		}
		//내림차순 set을 리턴 descendingSet()
		NavigableSet<Integer> treeSet2 = treeSet.descendingSet();
		System.out.println(treeSet2);
		NavigableSet<Integer> treeSet3 = treeSet.headSet(10, true); //false를 주면 10을 포함 하지 않는다 
		System.out.println(treeSet3);
		NavigableSet<Integer> treeSet4 = treeSet.tailSet(10, true); //false를 주면 10을 포함 하지 않는다 
		System.out.println(treeSet4);
		NavigableSet<Integer> treeSet5 = treeSet.subSet(10, true, 15, true);
		System.out.println(treeSet5);
	}

}
