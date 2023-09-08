package day08.Exam03;
class A {
//클래스 안에 쓰면 필드가 되어서 인식이 안됌
}
class B extends A {

}
class C extends A {

}
class D extends B {

}
class E extends C {

}

public class PromotionExam {


	public static void main(String[] args) {
		B b = new B () ;
		C c = new C () ;
		D d = new D () ;
		E e = new E () ;
		
		A a1 = b;
		A a11 = new B(); // 멘위에 	B b = new B () ;이 없어도 new B로 바로 만들 수 있다 . 이유는 new B는 힙 영역에 객체를 만든 후에 스택에 넣어서 사용 하는데 상속 관계는 무시 할 수 잇다 .
		A a2 = c;
		A a3 = d;
		A a4 = e;
//		B b2 = New C(); 은 상속 관계가 아니라서 안됀다 

	}

}
