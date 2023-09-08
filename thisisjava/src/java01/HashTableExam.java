package java01;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExam {

	public static void main(String[] args) {
		//HashTable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();
		
		//작업 스레드 객체 생성
		Thread trheadA = new Thread() {
			@Override
			public void run() {
				//앤트리 1000개 추가 
				for (int i=1; i<=1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		Thread trheadB = new Thread() {
			@Override
			public void run() {
				//앤트리 1000개 추가 
				for (int i=1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		//작업 스레드 실행
		trheadA.start();
		trheadB.start();
		
		try {
			trheadA.join();
			trheadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//저장된 앤트리 수 얻기 
		int size = map.size();
		System.out.println("총 앤트리 수 : " + size);
	
	}

}
