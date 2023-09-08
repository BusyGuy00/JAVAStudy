package day05.Exam01;

public class SwitchExpression {

	public static void main(String[] args) {
		char charvar= 'c';
//		switch 표현식
//		switch(charvar) {
//		case 'a','A' -> {
//			System.out.println("a입니다");
//		}
//		case 'b','B' -> {
//			System.out.println("B입니다");
//		}
//		default -> {
//			System.out.println("해당되지 않습니다.");
//		}
//		}
		switch(charvar) {
		case 'a':
		case 'A':
			System.out.println("a입니다");
			break;
		case 'b':
		case 'B':
			System.out.println("b입니다");
			break;
			default:
				System.out.println("해당되지 않습니다.");
		}

	}

}
