package day17.Exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam2 {

	public static void main(String[] args) {
		//ArrayLIst 컬렉션
		List<Board> list = new ArrayList<> ();
		//객체 추가 
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		
		Board board = list.get(1);
		System.out.println(board.getSubject()+" "+ board.getWriter());
		
//		for(int i = 0; i<list.size(); i++) {
//			Board b = list.get(i);
//			System.out.println(b.getSubject());
//		}
		//향상된 for문으로 모든 객체를 하나씩 가져 오기 
		for(Board b: list) {
			System.out.println(b.getSubject());
		}
		
	}
	
}
