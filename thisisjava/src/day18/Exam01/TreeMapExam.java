package day18.Exam01;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		//TreeMap 컬렉션 생성 
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//앤트리 저장  오른차순 정렬(정렬기준 key값)
		treeMap.put("apple",10);
		treeMap.put("forever",60);
		treeMap.put("descripton",20);
		treeMap.put("ever",30);
		treeMap.put("odd",15);
		
		//Map은 향상된 for문?(X) 
//		Set<Entry<String,Integer>> entrySet = treeMap.entrySet(); 이렇게 entrySet 선언을 생략 해도 괜찮다
		for(Entry<String,Integer> entry: treeMap.entrySet()) { //map은 향상된 포문이 안돼기 때문에 set타입으로 바꿔서 활용 해야 한다.
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		} 
		
		//특정 키에 대한 값 가져오기 
		Entry<String,Integer> reEntry = null;
		reEntry = treeMap.firstEntry();
		System.out.println(reEntry.getKey()+" , " +reEntry.getValue());
		reEntry = treeMap.lastEntry();
		System.out.println(reEntry.getKey()+" , " +reEntry.getValue());
		//기준보다 앞 단어 
		reEntry = treeMap.lowerEntry("green");
		System.out.println(reEntry.getKey()+" , " +reEntry.getValue());
		//기준보다 뒤단어 
		reEntry = treeMap.higherEntry("green");
		System.out.println(reEntry.getKey()+" , " +reEntry.getValue());

		//내림 차순 정렬하기 
		NavigableMap <String,Integer> descendingMap = treeMap.descendingMap();
		// for문 사용을 위해 Map 타입 --> Set 타입 으로 변환 리턴 
		Set<Entry<String,Integer>> descendingSet = descendingMap.entrySet();
		for( Entry<String,Integer> e : descendingSet) {
			System.out.println(e.getKey() + " : "+ e.getValue());
		}
		System.out.println("[c~e 사이의 단어 검색]");
		NavigableMap<String,Integer> rangeMap = treeMap.subMap("c", true, "g", true); {
			for( Entry<String,Integer> e: rangeMap.entrySet() ) {
				System.out.println(e.getKey() + " * "+ e.getValue());
			}
		}
	}

}
