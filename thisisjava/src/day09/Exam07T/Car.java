package day09.Exam07T;

public class Car {
	//필드 생성
	Tire flTire = new Tire ( 10, "앞 왼쪽");
	Tire frTire = new Tire ( 10, "앞 오른쪽");
	Tire blTire = new Tire ( 20, "뒤 왼쪽");
	Tire brTire = new Tire ( 20, "뒤 오른쪽");
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	//메소드 
	int run() {
		System.out.println("자동차가 출발 합니다.");
		if (flTire.roll()== false) {
			stop();
			
		}return 1;
	}
	
	
}
