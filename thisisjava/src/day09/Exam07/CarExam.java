package day09.Exam07;


public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<15; i++) {
//			문제 없으면 0, 앞왼쪽 펑크 1, 앞오른쪽 펑크2 
//			뒤왼쪽 펑크 3, 뒤오른쪽 펑크4		car.run은 결과값을 0,1,2,3,4,로 받아서 int로 받아야 한다
			int problemLocation = car.run();  
			switch(problemLocation) {
			case 1:
					System.out.println("앞 왼쪽 한국 타이어 교체");
					car.flTire = new HankookTire("앞왼쪽", 15);
//					car.flTire = new HankookTire(null, i);
					break;
		
			
			case 2:
				System.out.println("앞 오른쪽 한국 타이어 교체");
				car.frTire = new HankookTire("앞 오른쪽", 13);
				break;
			
			
			case 3:
				System.out.println("뒤 왼쪽 금호 타이어 교체");
				car.blTire = new KumhoTire("앞 왼쪽", 13);
				break;
			
			
			case 4:
				System.out.println("뒤 오른쪽 금호 타이어 교체");
				car.brTire = new KumhoTire("앞 왼쪽", 15);
				break;
				
			}
			System.out.println("--------------------------");
}
}

	}


