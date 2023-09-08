package java01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		//set 순서가 없고 중복은 불가능 하다
		Set<String> set = new HashSet<>();
		
		//객체저장
		set.add("java");
		set.add("oracle");
		set.add("jdbc");
		set.add("servlet");
		set.add("jsp");
		set.add("java"); // 중복으로 인해 저장 되지 않는다.
		set.add("END");
		System.out.println(set);
		
		Set<Board> boardset = new HashSet<>();
		boardset.add(new Board("제목1","내용1","글쓴이1"));
		boardset.add(new Board("제목2","내용2","글쓴이2"));
		boardset.add(new Board("제목3","내용3","글쓴이3"));
		boardset.add(new Board("제목4","내용4","글쓴이4"));
		boardset.add(new Board("제목1","내용1","글쓴이1"));
		System.out.println("총객체수 : " + boardset.size());
		//현재 중복인경우에도 저장이 되기 때문에 Board에서 equals 재정의를 해줘야  한다.
		
		//객체를 하나씩 가져와서 처리 
		Iterator<Board> iterator = boardset.iterator();
		
		//hasNext() 객체를 가져올게 있는지 확인하고 있으면 가져오기
		while(iterator.hasNext()) {
			//객체를 하나씩 가져오기 
			Board b = iterator.next();
			System.out.println(b.getContent());
		}
		for(Board str: boardset) {
			System.out.println(
					str.getSubject()+" , " + 
					str.getContent()+" , " +
					str.getWriter()); 
		}
		
		
	}
	
	

}
