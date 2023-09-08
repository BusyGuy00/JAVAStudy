package day16.Exam04;

public class WorkObject {
	
	//동기화 메소드
	public synchronized void methodA(){
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+ "메소드A작업실행");
		//다른 스레드를 실행 대기상태로 만들어 보자 (일시 정지 상태인 스레드를 실행 대기 상태로 )
		notify();
		
		try {
			wait(); //이 스레드를 대기 상태로 만든다
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//동기화 메소드
	public synchronized void mehtodB(){
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+ "메소드B작업실행");
		//다른 스레드를 실행 대기상태로 만들어 보자 (일시 정지 상태인 스레드를 실행 대기 상태로 )
		notify();
		
		try {
			wait(); //이 스레드를 대기 상태로 만든다
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


