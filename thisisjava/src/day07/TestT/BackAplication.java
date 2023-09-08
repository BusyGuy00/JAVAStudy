package day07.TestT;

import java.util.Scanner;

public class BackAplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//길이가 100인 Account2[] 배열로 관리 
		//String[] strs = new String[10]
		Account2[] accounts = new Account2[100];
		while(true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록보기 | 3.예금 |  4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택>");
			String selectNum = scan.nextLine(); //입력값을 selectNum에 할당
			//입력값이 1 이라면 실행
			if(selectNum.equals("1")) {
				System.out.println("---------------");
				System.out.println("계좌생성");
				System.out.println("---------------");
				//계좌 생성
				Account2 account = new Account2();
				// account. accountNum = null
				// account. accountName = null
				// account. balance = 0
				
				System.out.println("계좌 번호 :");
				//account 객체의 accountNum필드 값을 입력 값을 변경이 된다. 
				account.setAccountNum(scan.nextLine());
				System.out.println("계좌주 :");
				account.setAccountName(scan.nextLine());
				System.out.println("초기 입금액 :");
				account.setBalance(Integer.parseInt(scan.nextLine())); //받는 값을 int로 바꿔줘야 해서 바꾼다
				for(int i=0; i<accounts.length; i++) {//accounts 안에 100개의 배열은 전부 null인 상태 인데 그걸 확인 하고
					if(accounts[i] == null) {			 //i는 0부터 계산 해서 null 안에 차례차례 넣는다 그리고 다 넣은후에 for문이 끝나게 한다.
						accounts[i] = account ;
						System.out.println("계좌가 생성 됐습니다.");
						break;
					}
				}				
			}else if (selectNum.equals("2")) {
				System.out.println("---------------");
				System.out.println("계좌목록");
				System.out.println("---------------");
				for(Account2 a: accounts) {
					if(a==null) {
						break;
					}
					System.out.println(a.getAccountNum()+"  "+a.getAccountName()+ "  "+a.getBalance());
				}
			}else if (selectNum.equals("3")) {
				System.out.println("---------------");
				System.out.println("예금");
				System.out.println("---------------");
				System.out.print("계좌번호 :");
				String accountN = scan.nextLine();
				System.out.println("예금액 : ");
				int price = Integer.parseInt(scan.nextLine());
				//boolean isAccount = false;
				//계좌 번호에 해당 하는 계좌가 있을 경우 잔고에서 금액을 더 해준다
				for(Account2 a: accounts) {
					// 각 계좌의 계좌번호와 입력한 계좌번호가 일치 하는지
				    // 일치하면 그 계좌에 있는 잔고에서 입력한 금액을 더해서 변경
					if(a.getAccountNum().equals(accountN)) {
						// 셋 발란스에 넣어 주라는 얘기다.{겟발란스와 price를 더한 값을 }
						a.setBalance(a.getBalance() + price);
						System.out.println("예금 성공 되었습니다.");//isAccount = true;
						break;
					}else {
					System.out.println("없는 계좌 입니다.");
					
					}
				}
			}
				else if (selectNum.equals("4")) {
					System.out.println("---------------");
					System.out.println("출금");
					System.out.println("---------------");
					System.out.print("계좌번호 :");
					String accountN = scan.nextLine();
					System.out.println("출금액 : ");
					int price = Integer.parseInt(scan.nextLine());
					
					//계좌 번호에 해당 하는 계좌가 있을 경우 잔고에서 금액을 더 해준다
					for(Account2 a: accounts) {
						// 각 계좌의 계좌번호와 입력한 계좌번호가 일치 하는지
					    // 일치하면 그 계좌에 있는 잔고에서 입력한 금액을 더해서 변경
						if(a.getAccountNum().equals(accountN)) {
							// 셋 발란스에 넣어 주라는 얘기다.{겟발란스와 price를 더한 값을 }
							a.setBalance(a.getBalance() - price);
							System.out.println("결과 : 출금이 성공 입니다.");
							break;
					}else {
						System.out.println("없는 계좌 입니다.");
					}
					}
				}
					else if (selectNum.equals("5")) {
						System.out.println("프로그램 종료");
						break;
					}else {
						System.out.println("선택 숫자만 입력 하세요");
					}
		}// while문 블럭 끝

	}// main 메소드 블럭 끝
	

}
