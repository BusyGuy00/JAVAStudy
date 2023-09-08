package day12exam01.Exam02;

public class ThrowsExam {
	public static void main(String[] args) {
		try {
			findclass();
		}catch(ClassNotFoundException e) {
			System.out.println("예외 처리 : "+ e.toString());
		}
		
	}// 위에 findclass()을 호출한 위에 try{findclass()}에서 처리 하게끔 넘긴다.
	public static void findclass() throws ClassNotFoundException { 
		Class.forName ("java.lang.string2");
	}

}
