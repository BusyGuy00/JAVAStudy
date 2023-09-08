package day06Exam02;

public class carExam {

	public static void main(String[] args) {
//		객체 생성 
		Car myCar = new Car();
		
//		gas 필드값을 10으로 변경 
		myCar.setGas(10);
		
		if(myCar.isLeftgas()) {
			System.out.println("출발 합니다.");
			myCar.run();
		}
		System.out.println("gas를 주입해 주세요.");

	}

}
