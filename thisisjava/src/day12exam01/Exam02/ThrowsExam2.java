package day12exam01.Exam02;

public class ThrowsExam2 {//메인에 findClass();을 호출 하고 또 옆에 오류를 알려 주면 위에 throws Exception를 추가 함으로써 예외 처리 코드를 대응 할 수 있다. 
	public static void main(String[] args) throws Exception {
		findClass();
		
	}
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
