package day11.exam01;

public class AExam {
public static void main(String[] args) {
	//A 객체 생성 
	A a = new A();
	//B 객체 생성 
	A.B b = a.new B (); //인스턴스 객체여서 a. 이렇게 접근 static으로 접근시 생략 가능 
	b.method1();
	a.method();
	//정적 멤버 클래스 객체 새엇ㅇ 
	A.C c = new A.C();
	System.out.println(c.field1);
	c.method1();
	System.out.println(A.C.field2);
	A.C.method2();
}
}
