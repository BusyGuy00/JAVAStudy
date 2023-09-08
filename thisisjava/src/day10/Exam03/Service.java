package day10.Exam03;

public interface Service {
	//디폴트 메소드 private메소드 사용 가능 private static 메소드 사용 가능
	default void defaultMethod1() {
		System.out.println("defaultMethod코드");
		    //코드가 10줄씩 중복 되면 효율이 떨어지기 때문에 private 메소드를 사용해 묶어 두면 좋다.
		defMethod3();
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod코드");
		defMethod3();
		//staticMethod2();프라이빗 정적 메소드는 인스턴스 메소드에서도 사용 가능 
	} //private 메소드
	private void defMethod3() {
		System.out.println("중복1");
		System.out.println("중복2");
	}
	
	//정적 메소드  private메소드 사용 불가능 private static 메소드 사용 가능
	static void staticMethod1() {
		System.out.println("staticMethod코드");
		staticCommon(); // 호출 하는 객체가 정적 메소드 여서 private 정적 메소드만 호출 가능 
		//defMethod3(); //private 메소드 호출 안됨
	}
	static void staticMethod2() {
		System.out.println("staticMethod코드");
		staticCommon();
	}
	//private 정적 메소드
	private static void staticCommon() {
		System.out.println("중복1");
		System.out.println("중복2");
	}
	
	
}
