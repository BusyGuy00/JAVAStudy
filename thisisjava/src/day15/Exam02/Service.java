package day15.Exam02;

public class Service {
	@PrintAnnotation	//적용
	public void method1() {
		System.out.println("실행1");
	}
	@PrintAnnotation("*")	//적용 	속성이름이 없으면 value값 변경
	public void method2() {
		System.out.println("실행2");
	}
	@PrintAnnotation(value="#", number=20)	//적용 
	public void method3() {
		System.out.println("실행3");
	}

}
