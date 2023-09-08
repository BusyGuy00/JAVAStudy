package day15.Exam03;

public class ProductGenericExam {

	public static void main(String[] args) {
		//k는 Tv타입 , M은 String타입으로 변환 시켜서 사용 했다
		Product<Tv, String> product1 = new Product<>();
		
		//Setter
		product1.setkind(new Tv()); //Tv타입 객체로 지정
		product1.setModel("스마트tv");
		

		//Getter
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//K는 Car, M은 String 
		Product<Car, String> product2 = new Product<>();
		
		product2.setkind(new Car());
		product2.setModel("suv 자동차");
		
		//getter Car, String
		Car car = product2.getKind();
		String carModel = product2.getModel ();
		
	}

}
