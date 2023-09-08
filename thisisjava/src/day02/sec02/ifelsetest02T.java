package day02.sec02;

import java.util.Scanner;

public class ifelsetest02T {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("년도를 입력 하세요");
		int year = scan.nextInt();
		if(year%4 == 0) {
			if(year%100 == 0) {
				if (year%400 == 0) {System.out.println("윤년입니다.");
					}else {System.out.println("평년입니다.");}
			}
			else {System.out.println("윤년입니다.");}
		}
		else {System.out.println("평년입니다.");}
		
	}

}
