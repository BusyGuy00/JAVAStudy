package day08;

public class Smartphone extends Phone {
	//필드 선언
	public boolean wifi;
	public String name;
	public String company;
	//생성자 선언 
	public Smartphone(String model, String color) {
		 //this는 나 자신을 부르는것 super은 부모요소를 부르는것 생략 가능 하가 (컴파일시 자동 추가 )
		//부모 생성자 호출
//		this.model = model; // 폰으로 부터 상속 
//		this.color = color; // 폰으로 부터 상속
//		super(model, color);
		this(model, color, "회사");
		
		
	}
	public Smartphone(String model, String color, String company) {
		super(model, color);
		this.company = company;
	}
	
	//메소드 선언 
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경 했습니다.");
	}
	public void internet() {
		System.out.println("인터넷에 연걸 합니다.");
	}
}
