package day08.Exam03;

public class Rose extends Flower {
	//부모 요소 에서 생성자 필드에서 가져오기
	String color;
	public Rose (String name, int cost, String color) {
		super( name, cost );
		this.color=color;
	}
	public void method1() {
		System.out.println("로즈에 추가된 메소드");
	}
	@Override
	public void overMethod() {
	System.out.println("자식에서 오버라이딩 된 메소드 입니다.");
	}

}
