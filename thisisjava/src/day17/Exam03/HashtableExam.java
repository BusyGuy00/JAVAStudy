package day17.Exam03;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExam {

	public static void main(String[] args) {
		//Hashtable컬렉션 생성 
		Map<String,Integer> map = new Hashtable<>();
		//작업스레드 객체 생성 
		Thread threadA = new Thread() {

			@Override
			public void run() {
				//앤트리 1000개 추가 
				for(int i=1; i<1000; i++) {
					map.put(String.valueOf(i), i); // map.put(String.valueOf(i), i); i를 스트링 타입으로 받는 과정 
				}
			}
			
		};
		
		Thread threadB = new Thread() {

			@Override
			public void run() {
				//앤트리 1000개 추가 
				for(int i=1; i<=2000; i++) {
					map.put(String.valueOf(i), i); // map.put(String.valueOf(i), i); i를 스트링 타입으로 받는 과정 
				}
			}
			
		};
		threadA.start();
		threadB.start();

		//작업 스레드들이 모두 종료될때까지 메인 스레드를 기다리게 햐여 함 
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int size = map.size();
		System.out.println("총 앤트리 수 : " + size);
	}

}
