package day05.Exam01;

import java.util.Scanner;

public class arrayT {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] num = new int[10];
		System.out.println("숫자 10개를 입력 하시오");
		for(int i=0; i<num.length; i++) {
			num[i]= scan.nextInt();
		}
		int num1 = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i] % 2 ==0) {
				if(num[i] > num1) {
					num1 = num[i];
				}
			}
		} 	
		System.out.println("짝수값 : " +  num1 );
		
		int num2 = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i] % 2 == 1) {
				if(num[i] < num2) {
					num2 = num[i];
				}
			}
		} 
		System.out.println("홀수값 : " +  num2 );
		
		int[] number;
		number = new int[] {95, 75, 85, 100, 50};
		System.out.println("오름차순 숫자");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j--){
				//if()
			}
		}
	}

}
