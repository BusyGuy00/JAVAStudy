package day02.sec02;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("아이디를 입력 하세요");
		String userId = scan.nextLine();
		System.out.println();
		System.out.println("비밀번호를 입력하세요");
		String userPass = scan.nextLine();
		System.out.println();
		
		if(userId.equals("green")&& userPass.equals("1234")) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("잘못 입력 되었습니다.");
		}
	}
	

}
