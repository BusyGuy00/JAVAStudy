package dayoff;

import java.util.Scanner;

public class ArrayMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[5]; 
		System.out.println("숫자 5개 : ");
		
		for(int i = 0; i<num.length; i++) {
			num[i]= scan.nextInt();
			
			
		}
		int max = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("최대값 : " + max);
		
	}

}
