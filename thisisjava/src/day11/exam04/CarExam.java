package day11.exam04;

public class CarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.run();
		myCar.run2 (new Tire() {
		@Override
		public void roll() {
				System.out.println("새로운 익명 자식 객체가 굴러 갑니다.");
			}
 	});
		myCar.run3();
	}
	
}
