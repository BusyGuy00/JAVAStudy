package app;

import pack1.A;
import pack2.B;
import pack3.C;

public class Main {

	public static void main(String[] args) {
		//my_module_a패키지에 포함된 A클래스 이용
		A a = new A();
		a.method();
		
		B b = new B();
		b.method();
		
		C c = new C();
		c.method();

	}

}
