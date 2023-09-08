package day15.Exam03;

public class InterfaceGenericExam {

	public static void main(String[] args) {
		
		HomeAgecy homeAgecy = new HomeAgecy();
		Home home = homeAgecy.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
		
		
	}

}
