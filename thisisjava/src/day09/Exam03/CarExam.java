package day09.Exam03;

public class CarExam {
	
	public static void main(String[] args) {
//		Car 객체
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		//HankookTire
		myCar.tire = new HankookTire();
		myCar.run();
		
		//kumhoTire
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
		
	}
}
