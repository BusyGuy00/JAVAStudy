package day17.Exam03;

import java.util.*;
import java.util.Map.Entry;

//위와 같이 해도 된다 utill의 하위 값들 이여서 하나로 전부 정리 가능 하나 Entry는 서브 값 이여서 따로 지정 히먄 된다.

//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class HashMapExam {
	
	public static void main(String[] args) {
		//Map컬렉션 생성
//		Map<String,Integer> map = new HashMap<String,Integer>(); 해도 되고 밑에와 같이 안해도 된다
		Map<String,Integer> map = new HashMap<>();
		//객체 저장 
		map.put("김그린", 30);
		map.put("홍길동", 36);
		map.put("이블루", 28);
		map.put("이재라", 32);
		map.put("김노랑", 29);
		map.put("홍길동", 22); // 중복 저장이 안돼서 위의 홍길동은 지워지고 밑에 홍길동이 남는다  
		
		//키로 값 얻기 
		
		int value =map.get("홍길동");
		System.out.println(value);
		
		int size = map.size();
		System.out.println(size);
		
		//키로 Entry삭제
		map.remove("김그린");
		int size2 = map.size();
		System.out.println(size2);
		
		boolean re = map.containsKey("aaa");
		System.out.println("aaa 키는 : " + re);
		boolean re2 = map.containsValue(22);
		System.out.println(re2);
		
		//키 set컬렉션 얻고 반복 하기 
		Set<String> keyset = map.keySet();
		//반복자 얻기 
		Iterator<String> keyIterator = keyset.iterator(); // 반복자 
		// 가져올 값이 있는지 체크
		while(keyIterator.hasNext()) {
			//값을 가져옴 
			String k = keyIterator.next();
			//키로 값을 반환 
			Integer v = map.get(k);
			System.out.println(k + " " + v);
		} 
		System.out.println("-----------------------------");
		//Entry를 set컬렉션으로 반환  (map --> set)
		Set<Entry<String,Integer>> entrySet = map.entrySet(); // 키는 Entry에 있고 Entry는 제네릭 타입 이여서 지정을 해줘야 한다	
		Iterator<Entry<String,Integer>> entryIterator =entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey(); //entry 키값 리턴 
			Integer v = entry.getValue(); //entry 벨류값 리턴 
			System.out.println(k + " " + v);
		}
		map.clear(); //map의 Entry 제거
		System.out.println(map.isEmpty()); // 비어 있는지 체크  비어 있으면 true, 객체가 있으면 false
		
		
		
				
	}
}
