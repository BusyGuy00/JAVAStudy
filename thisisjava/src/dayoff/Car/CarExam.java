package dayoff.Car;

public class CarExam {

	public static void main(String[] args) {
		Car car= new Car();
		
		for(int i=1; i<15; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1 : 
					System.out.println("앞 왼쪽 한국 타이거 교체");
					car.frontLeftTire = new HankookTire("앞 왼쪽",15);
					break;
			
			case 2:
				System.out.println("앞 오른쪽 한국 타이어 교체");
				car.forntRigthtTire = new HankookTire("앞 오른쪽", 15);
				break;
			
			
			case 3:
				System.out.println("뒤 왼쪽 금호 타이어 교체");
				car.backLeftTire= new KumhoTire("앞 왼쪽", 15);
				break;
			
			
			case 4:
				System.out.println("뒤 오른쪽 금호 타이어 교체");
				car.backRight = new KumhoTire("앞 왼쪽", 15);
				break;
				
			}
			System.out.println("--------------------------");
}
}
	}



