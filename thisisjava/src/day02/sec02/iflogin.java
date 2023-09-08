package day02.sec02;

import java.util.Scanner;

public class iflogin {

	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner (System.in);
			System.out.println("아이디를 입력 하시오");
			String userId = scan.nextLine();
			System.out.println();
			System.out.println("패스워드를 입력 하시오");
			String userPass = scan.nextLine();
			System.out.println();
			
			if(userId.equals("green") && userPass.equals("1234")) {
				System.out.println("로그인이 되었습니다.");
			}else {
				System.out.println("아이디나 패스워드가 잘못 되었습니다.");
			

		

			}
		}
	}
}
