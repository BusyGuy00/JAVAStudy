package day05.Exam01;

public class ArrayExam {

	public static void main(String[] args) {
//		배열 선언과 배열 생성 
		String[] fruits = {"🥝","🍓","🍑","🍉","🍋"};
//		System.out.println(fruits[3]);
		for(int i=0; i<5; i++) {
			System.out.println(fruits[i]);
		}
//		배열 항목에 값 변경 
		fruits[1] = "🍎";
		System.out.println(fruits[1]);

	}

}
