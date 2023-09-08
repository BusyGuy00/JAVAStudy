package day18.Exam02;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class synchronizedExam {
		public static void main(String[] args) {
			
		

	//Map 컬랙션 생성 
	Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>()) ;
	//작업 스레드 객체 생성 
	Thread threadA = new Thread() {

		@Override
		public void run() {
			//객체 1000개를 추가 하겠다.
			for(int i=1; i<= 1000; i++) {
				map.put(i,"내용"+i);
			}
		}
		
	};
	Thread threadB = new Thread() {
		
		@Override
		public void run() {
			//객체 1000개를 추가 하겠다.
			for(int i=1; i<= 2000; i++) {
				map.put(i,"내용"+i);
			}
		}
		
	};
	threadA.start();
	threadB.start();
	try {
		threadA.join();
		threadB.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//저장된 객체 수 얻기
	int size = map.size();
	System.out.println("총객체 수 : " + size);
	
	}
	
}
