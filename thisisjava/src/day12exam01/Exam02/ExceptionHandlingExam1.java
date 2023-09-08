package day12exam01.Exam02;

public class ExceptionHandlingExam1 {
	//printLength의 데이터를 를받아서  data.length로 문자열의 수의 값을 낸다.
	public static void printLength(String data) {
		try { // 오류가 발생 할것 같은 보이드의 실행문을 넣어 준다 
			int result = data.length();
			System.out.println("문자 수 :" + result);
			
		}catch(NullPointerException e) { //catch (여기에 오류 코드를 넣어 주면 된다.)
//			System.out.println(e.toString());
			e.printStackTrace(); // sysout이 필요가 없다
		}finally {
			System.out.println("마무리 실행"); // 파이널리 코드는 없어도 된다 마지막에 실행할 것이 있다면 기록 
		}
//		int result = data.length();
//		System.out.println("문자 수 :" + result); // - 오류가 발생 할 것 같은 실행문 -
	
}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength("java");
		printLength(null);// 널 타입 인셉션(예외) 스트링 타입의 값이 아니라 널 타입이여서 이곳 밑으로는 작동을 멈춘다
		System.out.println("프로그램 종료");
	}

}
