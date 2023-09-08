package day09.Exam07T;

public class KumhoTire extends Tire {

	public KumhoTire (int maxRotation , String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++rotation;
		if (rotation < maxRotation) {
			System.out.println(location +"tire 수명 : "+(maxRotation - rotation));
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크"+"***");
			return false;
		}
	}


	
}
