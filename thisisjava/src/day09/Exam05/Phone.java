package day09.Exam05;

public abstract class Phone {
		//추상 메소드는 추상 클래스 에서만 사용 가능 
		//필드 선언 
	String owner;
	
		//생성자 선언 
	Phone(String owner){
		this.owner = owner;
	}
	//메소드 선언 
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
//	추상 메소드			스트링 타입으로 매개 변수를 받아서 사용 할 수 있게 한다. 
//						자식 클래스에서 구현 (오버 라이딩)하지 않으면 오류가 난다
	abstract void send(String message);	//추상 메소드는 실행 블럭이 없다.

}
