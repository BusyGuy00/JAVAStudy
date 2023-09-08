package day02.sec01;

import java.util.Scanner;

public class OperatorExam002 {

	public static void main(String[] args) {
		
		System.out.print("짝수를 입력 하시오");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		if (num%2==1) {
			System.out.println("짝수 입니다.");			
		}else {
			System.out.println("홀수 입니다.");
				
		}
	}
}

