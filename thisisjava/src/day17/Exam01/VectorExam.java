package day17.Exam01;

import java.util.List;
import java.util.Vector;

public class VectorExam {
//메인 스레드가 먼저 작동을 해서 결과 값이 0이 나오기 때문에 join을 호출해서 메인 스레드의 작업 대기를 시켜 줘야 한다.
	public static void main(String[] args) {
		// Vector 컬렉션 생성 
		List<Board> list = new Vector<>(); 
		//ArrayList로 바꿔도 작동은 하지만 정확한 값이 나오진 않는다 (동기화가 안돼있어서 병렬도 값을 받아서 그렇다.)
		//Vector는 add라는 메소드하고 싱크로나이즈가 붙어 동기화가 되어 add를 하나씩 직렬로 값을 받아서 정확한 값이 나온다.
		
		//작업스레드 객체 생성 
		Thread threadA = new Thread() {

			@Override
			public void run() {
				//객체 10개 추가 
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				} 
			}
			
		};
		//작업스레드 객체 생성2
		Thread threadB = new Thread() {

			@Override
			public void run() {
				//객체 10개 추가 
				for(int i=1001; i<=2000; i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				} 
			}
			
		};
		//작업 스레드 실행 
		threadA.start();
		threadB.start();
		try { //join은 실행시켜 주는 스레드를 정지 시켜서 매인이 기다리게 한다 
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);

	}

}
