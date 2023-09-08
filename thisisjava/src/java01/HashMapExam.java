package java01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {

		//Map컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("김그린", 85);
		map.put("김블루", 80);
		map.put("이그린", 90);
		map.put("이블루", 75);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		//키로 값 얻기
		int value1 = map.get("김그린");
		System.out.println("김그린은 : " + value1 + "점이다.");
		
		//키를 set 컬렉션으로 반환 
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		//반복자 Iterator 생성하기 
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		//Entryset 컬렉션 변환하기 set이 된다
		Set<Entry<String,Integer>> entryset = map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entryset.iterator();
		while(entryIterator.hasNext()) {
			Entry<String,Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}

	}

}
