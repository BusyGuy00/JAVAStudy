package day07.exam01;

public class Calculator {
//	정적 맴버 선언 static   밑에 int객체 선언이 전부 인스턴스 멤버 (static이 붙으면 정적 멤버)
	static double pi = 3.14159;
	static String company = "Mycompany";
	static String model = "lcd";
	static String info; 
	String color = "흰색";
//	인스턴트 필드 정적 메소드 안에서는 인스턴트 필드를 사용 할 수 없다
//	스테틱 블럭 복잡한 값으로 정적 필드를 초기화 할떄  
//	정적 블럭을 사용 
	static {
		info = company + "-" + model;
	}
	static int plus(int x, int y) {
		return x = y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
	int divide(int x, int y) {
		return x / y;
	}
}
