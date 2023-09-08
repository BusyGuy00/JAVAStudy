package day02.sec01;

import java.util.Scanner;

public class OperatorExam04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int charcode = 'A'; 
		if((charcode >= 65) && (charcode <= 90)) {
			System.out.println("대문자 이다");
		}
		if((charcode >= 97) && (charcode <= 122)) {
			System.out.println("소문자 이다");	
		}
		//while (true) {
		System.out.println("숫자를 입력 하세요 ");
		int num = Integer.parseInt(scan.nextLine()); 
	
		
		if((num%2== 0) || (num%3== 0)) {
			System.out.println("2의 배수 또는 3의 배수이다");
		
		}
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		
		int score = 85;
		//삼항 연산자
		char grade = (score > 90) ? 'A' : (score > 80)? 'B' : 'c' ;
		System.out.println(grade);
		}
	
	}

	
