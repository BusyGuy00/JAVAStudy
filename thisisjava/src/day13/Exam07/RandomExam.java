package day13.Exam07;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		int randomNum = (int) (Math.random() *5) +1; //0~4까지의 정수를 받는다 1~5까지를 원한다면 +1를 해주면 된다.
//		double randomNum = Math.random(); // 실수로 랜덤하게 받는다.
		System.out.println(randomNum);

		Random ra = new Random();
		int randomNum2 = ra.nextInt(5); //0~4
		System.out.println(randomNum2);
		
		Random ra1 = new Random(3);
//		int randomNum3 = ra1.nextInt(5); //0~4
//		System.out.println("랜덤값은 : " + randomNum3);
		int[] randomNum3 = new int [5];
		for(int i=0; i<5; i++) {
			randomNum3[i] = ra1.nextInt(10);
		}
		for(int a: randomNum3) {
			System.out.println("배열요소의 값은 : " + a);
		}
		
		System.out.println("------------------------------");
		
		Random ra2 = new Random(3); // 랜덤 값 3을 주어서 같은 값을 지정한 객체끼리는 같은 값이 나온다. 
//		int randomNum4 = ra2.nextInt(5); //0~4
//		System.out.println("랜덤값은 : " + randomNum4);
		int[] randomNum4 = new int [5];
		for(int i=0; i<5; i++) {
			randomNum4[i] = ra2.nextInt(10);
		}
		for(int a: randomNum4) {
			System.out.println("배열요소의 값은 : " + a);
		}
		
		
		
		

	}

}
