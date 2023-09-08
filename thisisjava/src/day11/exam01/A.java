package day11.exam01;

public class A {
	//인스턴스 멤버 클래스
	class B {//중첩 클래스 , 멤버 클래스 ---> 스테틱이 아니여서 인스턴스 멤버 클래스 
		//인스턴스 필드
		int field1 = 1;
		//정적필드 (java17부터 허용)
		static int field2 = 2;
		//생성자 
		B() {
			System.out.println("B-생성자 실행");
		}
		//인스턴스 메소드 
		void method1() {
			System.out.println("B-method1 실행");
		}
		//정적 메소드 ()java17부터 허용)
		static void method2() {
			System.out.println("B-method2 실행");
		}
		
	}
//	정적 멤버 클래스 
	static class C {
		//인스턴스 필드 
		int field1 = 1 ; 
		//정적 필드 (java17부터 허용)
		static int field2= 2;
		//생성자 
		C(){
			System.out.println("C- 생성자 실행");
		}
		//인스턴스 메소드 
		void method1() {
			System.out.println("C-method1 실행");
		}
		static void method2() {
		System.out.println("C-method2 실행");
	}
	}
	
	//인스턴스 필드 값으로 B객체 대입 
//	B field = new B();
	
	//생성자 
//	A() {
//		B b = new B();
//	}
	//인스턴스 메소드 
	void method() {
		B b = new B();
		System.out.println(b.field1 );
		b.method1();
		
		
		//정적 필드와 메소드 사용
		System.out.println(B.field2);
		B.method2();
	}
	}



	
	

