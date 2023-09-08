package day12exam01.Exam03;
//사용자 정의 예외 
//일반 예외는 Exception을 상속
//실행 예외는 RuntimeException 상속
public class InsufficientException extends Exception {
	public InsufficientException() {
		
		
		
	}
	public InsufficientException(String message) {
		super(message); //예외 객체의 공통 메소드인 getMessage()의 리턴값으로 사용 
	}
	
	
}
