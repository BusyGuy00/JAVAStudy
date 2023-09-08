package day11.exam04;

public class Car {
	//필드에 Tire 대임
	private Tire tire1 = new Tire();
	//필드에 익명 자식 객체 대입 하겠다.
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire객체1이 굴러 갑니다.");
		}
	};
	//메소드(필드 이용)
	public void run() {
		tire1.roll();
		tire2.roll();
	}
	//메소드 (매개 변수 이용)
	public void run2(Tire tire) {
		tire.roll();
	}
	//메소드 (로컬 변수 이용 ) 
	public void run3 () {
		Tire tire3 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 객체 로컬변수가 굴러 갑니다.");
			}
		};
		tire3.roll();
	}

	
}
