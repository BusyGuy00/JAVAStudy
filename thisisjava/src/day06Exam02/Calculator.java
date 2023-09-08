package day06Exam02;

public class Calculator {
	//필드 - 데이터 저장
	//생성자 - 필드의 초기화 
	//메소드 - 객체의 동작에 해당하는 코드 블럭
	void poweron() {
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {
		//poweron();
		int result = x +y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double) x / y;
		return result; // 리턴 타입이 있을 경우 작성 해줘야 한다. 
	}
	void poweroff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	

}
