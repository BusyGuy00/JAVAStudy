package dayoff.Car;


public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞 왼쪽 : ",6);
	Tire forntRigthtTire = new Tire("앞 오른쪽 : ", 2 );
	Tire backLeftTire = new Tire("뒤 왼쪽 : ",3);
	Tire backRight = new Tire("뒤 오른쪽 : ", 4 );
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(forntRigthtTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRight.roll() == false) {stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
	
	
	
	
	
	}
	
	

