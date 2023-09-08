package java01;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		//TreeMap 컬렉션 생성
		TreeMap< String , Integer > treeMap = new TreeMap<>();
		treeMap.put("apple", 10);
		treeMap.put("cherry", 30);
		treeMap.put("base", 20);
		treeMap.put("banana", 40);
		treeMap.put("orange", 50);

		//정렬된 엔트리 하나씩 출력 
		Set<Entry<String,Integer>> entrySet = treeMap.entrySet();
		for (Entry<String,Integer> en : entrySet) {
			System.out.println(en.getKey() + " : " + en.getValue());
		}
		Entry<String, Integer> entry1 = treeMap.firstEntry();
		Entry<String, Integer> entry2 = treeMap.lastEntry();
		System.out.println("첫 번째 : " +entry1.getKey());
		System.out.println("마지막 : " +entry2.getValue());
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		//범위 검색 
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("a", false, "d", false); 
			for(Entry<String, Integer> e : rangeMap.entrySet()) {
				System.out.println(e.getKey() + " : " + e.getValue());
			 
		}
	}

}
