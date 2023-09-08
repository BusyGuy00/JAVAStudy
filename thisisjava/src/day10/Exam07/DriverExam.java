package day10.Exam07;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver(); //드라이버 라는 메소드값이 안에 바히클이 속해 있다 그 안에는 bus taxi를 넣어 주었다
		
		Bus bus = new Bus ();
		Taxi taxi = new Taxi ();
		// 매개 값으로 구현 객체 대입 (다형성 : 실행 결과가 다름 )
		//자동 타입 변환 --> 오버라이딩 메소드 호출 --> 다형성!!!
		driver.drive(bus);
		driver.drive(taxi);
		ride(bus); //라이드 메소드를 이용해서 버스만의 메소드를 작동 시킬 수 있다.
	}
	//메소드 (캐스팅?)
	public static void ride(Vehicle vehicle) {
		//만약에 버스 타입이면 버스로 강제 변환 
		if(vehicle instanceof Bus) {
			Bus bus2 = (Bus) vehicle;
			bus2.checkFare();
		} 
		vehicle.run();
	}

}
