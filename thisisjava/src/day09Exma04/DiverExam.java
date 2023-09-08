package day09Exma04;

public class DiverExam {

	public static void main(String[] args) {
//		Drive 객체 생성 
		Driver driver = new Driver();
//		Bus bus = new Bus();
//		driver. drive (bus); 생략하고 아래와 같이 만들 수 있다.
		driver. drive (new Bus());
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		

	}

}
