package day05.Exam01;

public class ArrayExam02 {

	public static void main(String[] args) {
		String[] fruits = {"🥝","🍓","🍑","🍉","🍋"};
		fruits[1] = "🥝";
		for(int i=1; i<5; i++);{
			System.out.println(fruits);
//			배열 변수 선언과 배열 생성
		
		int[] intArr = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;
		for(int i=1; i<5; i++){
			System.out.println(intArr[i]);
		}
		String[] strArr = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println(strArr[i]);
		}
		strArr[0] = "그린";
		strArr[1] = "블루";
		strArr[2] = "레드";
		for(int i=1; i<3; i++){
			System.out.println(strArr[i]);
		}
		int[] numberArr = new int[10];
		
		for(int i=0; i<10; i++){
			numberArr[i] = i+1;
		}
		for(int i=0; i<10; i++){
			System.out.println(numberArr[i]);
		}	
//		 배열 변수 선언 
		int[] scores;
//		 배열 변수에 배열을 대입 
//		scores = {83,09,98}; 에러 발생
		scores = new int[] {83,90,98};
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
			}
		System.out.println("종합 :" + sum);
	}
		
//		배열길이 배열 변수. length (배열 길이 만큼 자동으로 계산 한다) 
	}
}
