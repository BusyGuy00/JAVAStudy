package day10.Exam06;

public class CarExam {
public static void main(String[] args) {
	Car myCar = new Car();
	
	myCar.run();
	
	myCar.tire1 = new KumhoTire();
	myCar.tire2 = new KumhoTire();
	
	myCar.run();
}
}
