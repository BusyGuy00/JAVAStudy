package java01;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		System.out.println(list);
		//값 추가
		list.add(0,"f");
		System.out.println(list);
		//2번째 열 출력
		System.out.println(list.get(2));
		//0번째 값 변경
		list.set(0, "g");
		System.out.println(list);
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list);
		
		if(list.contains("e")) {
			System.out.println("e가 있습니다.");
		}
		else {
			System.out.println("e가 없습니다.");
		}
		System.out.println(list);
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String str : list) {
			System.out.println(str);
		}
		
		//열 전부 삭제
		list.clear();
		if(list.isEmpty()) {
			System.out.println("비어 있습니다.");
		}
		else {
			System.out.println("비어 있지 않습니다.");
		}
	}

}
