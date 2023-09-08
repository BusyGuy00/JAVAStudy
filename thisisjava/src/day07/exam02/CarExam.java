package day07.exam02;

public class CarExam {

	public static void main(String[] args) {
//		객체생성
		Car myCar = new Car();
		System.out.println(myCar.getSpeed());
		myCar.setSpeed(60);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
//		라이브러리 값에 있는 public boolean isStop이 기본 적으로 flase기 때문에 실행 시키기 위해서 if(!###)을 해주는 것이다.
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.isStop());
	}

}
