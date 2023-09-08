package day03;

import java.util.Scanner;

public class javabookex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 0;
		while(true) {
			System.out.println("____________________________");
			System.out.println("1.예금 | 2.출금 | 3.잔고 |4,종료");
			System.out.println("____________________________");
			System.out.println("선택>");
			String str = scan.nextLine();
			if(str.equals("1")) {
				System.out.println("예금액>");
				int addMoney = Integer.parseInt(scan.nextLine());
				money += addMoney;
			}else if(str.equals("2")) {
				System.out.println("출금액>");
				int minusMoney = Integer.parseInt(scan.nextLine());
				money -= minusMoney;
			}else if(str.equals("3")) {
				System.out.println("잔고>");
				System.out.println(money);
				System.out.println();
			}else if(str.equals("4")) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}

}
