package day01.exam03;

public class PrintExam {

	public static void main(String[] args) {
		// System. out 표준 출력 장치 
		System.out.print("안녕");
		System.out.print("안녕");
		System.out.print("안녕");
		
		
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");
		
		System.out.printf("내 이름은 %1$s이다 나이는 %3$d이다.", "그린김", "김그린", 50,25);
		System.out.printf("이름 : %10s , 나이: %05d" , "abc",  20);
//		숫자 전에 0을 붙여서 여백을 0으로 채워준다
		
		//System.out.printf("%10.4f", 12.123456);
		//System.out.printf("%010.4f", 12.123456);
		
	}

}
