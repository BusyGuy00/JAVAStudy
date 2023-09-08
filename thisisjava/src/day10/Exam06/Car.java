package day10.Exam06;

public class Car {
	//필드
	Tire tire1 = new HankookTire();
	Tire tire2 = new KumhoTire();
	
	//메소드 인터페이스에 롤 만들고 구현 객체에 롤 안에 넣어주고 보이드 런을 호출 하면 값이 나온다
	void run() {
		tire1.roll();
		tire2.roll();
	}
	
	
	
	
}
