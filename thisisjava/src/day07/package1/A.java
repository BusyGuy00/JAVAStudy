package day07.package1;

public class A {
//	필드 선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	public String name = "green";
//	default 접근 제한 같은 패키지에서만 접근 가능
	int age;
//	private 필드 
	private int speed;
//	생성자 선언
	public A(boolean b) {
		this.speed = 10;
	}
	A(int b) {
		
	}
	private A(String s) {
		
	}
	//speed를 private가 붙어서 외부에서 원래 사용이 안돼지만 
	//밑에와 같이 만들어서  B에 사용 가능하게 만들었다 (캡슐화)
	public int getSpeed() {
		return this.speed;
	}
//	외부에서 값을 변경이 불가능 해서 public void 값을 주고 
//	if(speed < 0) 로 내가 원하지 않는 값을 외부에서 주지 못하게 안전장치를 만든다 (캡슐화)
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		}
		this.speed = speed;
	}
		
	
}

