package day15.Exam03;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		
		return new Car();
	}

}