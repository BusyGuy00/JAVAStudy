package day11.exam02;

public class Outer {
	//인스턴스 필드 
	String field = "Outer 필드";
	//인스턴스 메소드 
	void method() {
		System.out.println("바깥 메소드");
	}
	//인스턴스 멤버 클래스 
	class Inclass {
		//in 인스턴스 필드
		String field = "IN 필드";
		//in 인스턴스 메소드 
		void method() {
			System.out.println("IN 메소드");
		}
		void print() {
			//바깥 객체의 필드와 메소드 사용 
			// 본인의 밖의 객체를 사용 할때 주소 처럼 바깥 클래스(Outer).자신 클래스(this). 이름(field)
			// 바끝 클래스.this => 바깥의 객체 
			System.out.println(Outer.this.field);
			Outer.this.method();
			//In 객체의 필드와 메소드 사용 
			System.out.println(this.field);
			this.method();
		}
	}
	//인스턴스 메소드 
	void useIn() {
		Inclass inc = new Inclass();
		inc.print();
	}
	
	
}
