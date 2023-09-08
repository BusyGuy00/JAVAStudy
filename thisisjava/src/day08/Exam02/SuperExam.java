package day08.Exam02;

public class SuperExam {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymode = 2;
		sa.fly();
		sa.flymode = 1;
		sa.fly();
		sa.land();
	}
}
