package java01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		//객체 추가 
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		
		//특정 인덱스 객체 가져오기 
		Board board = list.get(2);
		System.out.println(
				board.getSubject()+" , " + 
				board.getContent()+" , " +
				board.getWriter());
	
	
		//향상된 for문 사용해서 객체 하나씩 출력하기 
		for(Board b : list) {
			System.out.println(
					b.getSubject()+" , " + 
					b.getContent()+" , " +
					b.getWriter());
		}
		
	}
}
