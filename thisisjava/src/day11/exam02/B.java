package day11.exam02;

public class B {
	//B의 인스턴스 필드와 메소드 
	int field1;
	void method1() {
		
	}
	//B의 정적 필드와 메소드 
	static int field2;
	static void method2() {
		
	}
	//인스턴스 맴버 클래스 /는 각각 클래스의 가지고 있는 것을 전부 사용 할 수 있다.
	class C {
		void method() {
			//B의 인스턴스 필드와 메소드 사용 
			field1 = 10;
			method1();
			//B의 정적 필드와 메소드 사용
			field2 = 10;
			method2(); 
		}
		//정적 멤버 클래스 /는 정적 인스턴스 와 메소드만 사용 가능 
		static class D {
			void method() {
				//인스턴스 필드 메소드 사용 X
//				field1 = 20;
//				method1();
//				정적필드 메소드 사용 O
				field2 = 10;
				method2();
				
			}
			
		}
		
	}
	
	
	
	
}
