package day08.Exam02;

public class SuperSonicAirplane extends Airplane {
	public int flymode = 1;
	@Override
	
	public void fly() {
		if(flymode == 2) {
			System.out.println("초음속 비행을 합니다.");
		}else {
			super.fly();
		}
	}

	
}
