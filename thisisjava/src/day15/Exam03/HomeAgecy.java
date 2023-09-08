package day15.Exam03;

public class HomeAgecy implements Rentable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}
	

}
