package day10.Exam03;

public class ServiceExam {

	public static void main(String[] args) {
//		인터 페이스 변수 선언 구현 객체 개입
		Service service = new ServiceImpl ();
		
		//디폴트 메소드 호출
		service.defaultMethod1();
		service.defaultMethod2();
		
		//정적 메소드 호출
		Service.staticMethod1();
		Service.staticMethod2();
		
		

	}

}
