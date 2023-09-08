package day05.Exam01;

import java.util.Scanner;

public class dowhileExam {
	
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세여");
		System.out.println("프로그램을 ㅇ종료 하려면 q를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while  (!inputString.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
	
	}	
}
