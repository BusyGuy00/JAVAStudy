package day08.Exam03;

public class Flower {
	String name;
	int cost;
	//부모 요소 에서 생성자 필드 초기화
	public Flower (String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
		//%n은 줄 바꿈이라는 명령어 이다. 
	public void flowerInformation () { // %,d는 숫자열에 ,을 추가해주는 방법 이다.
		System.out.printf("%s 1송이의 가격은 %,d원입니다.%n", this.name, this.cost);
	}
	public void overMethod() {
		System.out.println("부모의 메소드 입니다.");
	}
}
