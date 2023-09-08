package day11.exam02;

public class A {
	//생성자 
	A() {
		//로컬 클래스 선언 
		class B {}
		B b = new B();
	}
	//메소드 
	void method(int avg) {
		//로컬 변수 
		int var = 100; // 수정이 불가능 읽기만 가능 
		//로컬 클래스 선언 
		class B {
			//인스턴스 필드 
			int foeld1 = 1;
			//정적필드 (java17부터 허용)
			static int field2 = 2; 
			//생성자 
			B(){
				System.out.println("B-생성자 실행");
			}
			//인스턴스 메소드 
			void method1() {
				//로컬 변수 읽이 
				System.out.println("var :" + var);
				System.out.println("avg :" + avg);
				System.out.println("B-method1 실행");
				//로컬 변수 수정 (안됀다 상수 처럼 쓰임)
				//arg= 50;
				//var= 20;
			}
			static void method2() {
				System.out.println("B-method2 실행");
			}
		}
		//로컬 객체 생성 
		B b = new B();
		//로컬 객체의 인스턴스 필드와 메소드 사용 
		System.out.println(b.foeld1);
		b.method1();
		//로컬 클래스이 정적 필드와 정적 메소드 사용 (java17부터)
		System.out.println(B.field2);
		B.method2();
		
			
		
	}
	
}
