package day03;

import java.util.Scanner;

public class keyconrtrolExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		while(run) {
			System.out.println("_______________________");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("_______________________");
			System.out.print("선택 : ");
			String strNum = scan.nextLine();
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 : "+speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 : "+speed);
			}else if(strNum.equals("3")) {
				run = false;
			}else {
				System.out.println("1,2,3,중 하나만 입력하세요");
			}
		}
		System.out.println("프로그램 종료");

	}

}
