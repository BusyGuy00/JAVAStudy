package day02.sec02;

import java.util.Scanner;

public class GameExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
//		컴퓨터는 랜덤하게 가위, 바위, 보를 지정 
//		사용자는 입력 받기 
//		비교 해서 결과 
//		랜덤 값에 고정으로 가위 바위 보의 값을 준다
		String computer = Math.random()<0.3333 ? "가위" : Math.random()< 0.6666 ? "바위" : "보";
		System.out.println("가위, 바위, 보중 하나를 입력 하세요");
		String user = scan.nextLine();
//		내가 이기는 경우 user "가위" computer : "보"
//		 user "바위" computer : "가위"  user "보" computer : "바위"
		if(computer.equals(user)) {
			System.out.println("user는" + user + "computer는" + computer + ", 비겼습니다");			
		}else if ((user.equals("가위")&& computer.equals("보")) 
				|| (user.equals("바위")&& computer.equals("가위")) 
				|| (user.equals("보")&& computer.equals("바위")) 
				) {
			System.out.println("user는" + user + "computer는" + computer + ", 이겼습니다");			
				} else {
					System.out.println("user는" + user + "computer는" + computer + ", 졌습니다");	
				}
			
				
		
		
		
		
		

	}

}
