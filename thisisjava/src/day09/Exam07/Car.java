package day09.Exam07;



public class Car {
	//필드
	Tire flTire = new Tire("앞 왼쪽",10);
	Tire frTire = new Tire("앞 오른쪽",6);
	Tire blTire = new Tire("뒤 왼쪽",	4);
	Tire brTire = new Tire("뒤 오른쪽",12);
	
	

	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
//		.roll 회전수가 누적된다 누전 회전수가 맥스 회전수 보다 적으면 true 많으면 false
		if(flTire.roll() == false){
			stop();
//			return 1; 은 타이어 펑크가 났다는 false값이 나오면 몇번째 타이어 인지 알려준다 1을 출력 한다.
			return 1;
		}
		
		if( frTire.roll() == false){
			stop();
			return 2;
		}
		
		if(blTire.roll() == false){
			stop();
			return 3;
		}
		
		if(brTire.roll() == false){
			stop();
			return 4;
		}
		return 0 ; 
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
