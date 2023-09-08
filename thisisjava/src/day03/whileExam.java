package day03;

import java.util.Scanner;

public class whileExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
//		int i = 1;
//		while (i<11) {
//			System.out.println(i);
//		i++;
//		}
		while(true) {
			System.out.println("단어를 입력 하세요 :");
			String text = scan.nextLine();
			System.out.println(text);
			if(text.equals("end")){
				break;
			}
		}
		int num2 = 10;
		while(num2 > 11) {
			System.out.println("a")	;
		}
		do {
			 System.out.println("하하하");
		}while(num2 > 11);
	
		
		
		

	}

}
