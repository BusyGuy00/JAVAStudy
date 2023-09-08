package day07.Exam03;

public class Singleton {
	private static Singleton singleton = new Singleton();
//	생성자 선언
	private Singleton() {
		
		
	}
	//public 접근 권한을 갖는 정적 베소드 선언
	public static Singleton getInstacne() {
		return singleton;
	}
}
