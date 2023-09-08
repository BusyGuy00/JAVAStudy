package day06Exam01;
//라이브러리 클래스 (객체의 설계도)
public class Car {
	//필드 선언 (초기화 상테에서도 기본값 지정이 된다.null,0,false)
	public String company = "현대 자동차";
	public String model = "그랜저";
	public String color = "검정색";
	public int maxSpeed = 350 ;
	
	
//	생성자 선언 기본 생성자 Car car1=new Car();
//	생성자 오버로딩 : 매개 변수의 타입, 갯수,순서가 다른 생성자를 여러개 작성 
//	목적 : 객체의 필드를 다양하게 초기화 할수 있음
	public Car() {
		
		
	}
	public Car(String model) {//2번 생성자
//		this.model = model;
//		this.color = color; // 밑에 처럼 생략 가능 하다
		this(model, "흰색"); // 3번 생성자 호출
	}
	public Car(String model, String color) {//3번 생성자
		this(model, color, 200);
	}
	
	
//	생성자 선언 car car2 = new Car ("소나타","검정", "90")
	public Car(String model, String color, int speed) { //4번 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
