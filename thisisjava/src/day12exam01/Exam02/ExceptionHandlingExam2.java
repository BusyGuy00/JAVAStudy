package day12exam01.Exam02;

public class ExceptionHandlingExam2 {

	public static void main(String[] args) {
		// class.forName("패키지...클래스 이름")은 classPath위치에서 주어진 클래스를 찾는 코드
		// 클래스를 찾지 못하면 classNotfoundException예외를 발생 
		try {
			Class.forName("jana.lang.String");
			System.out.println("jana.lang.String 클래스가 존재 합니다.");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Class.forName("jana.lang.String");
			System.out.println("jana.lang.String2 클래스가 존재 합니다.");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
//		class.forName("jana.lang.String");

	}

}
