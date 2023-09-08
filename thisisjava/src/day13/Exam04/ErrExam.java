package day13.Exam04;

public class ErrExam {
	public static void main(String[] args) {
	try {
		int value = Integer.parseInt("1oo");
	}catch(NumberFormatException e) {
		System.out.println("[에러 내용]");
		System.err.println(e.getMessage());//out가 아닌 err이라고 하면 붉은내용을 출력 된다.
	}
		
		
		
	}

}
