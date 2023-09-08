package day07.TestT;

import java.util.Scanner;

public class BankApplicationRe {
	static Scanner scan = new Scanner(System.in);
	//길이가 100인 Account2[] 배열로 관리 
			//String[] strs = new String[10]
	static Account2[] accounts = new Account2[100];
	public static void main(String[] args) {
		while(true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록보기 | 3.예금 |  4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택>");
			String selectNum = scan.nextLine(); //입력값을 selectNum에 할당
			//입력값이 1 이라면 실행
			if(selectNum.equals("1")) {
				printTitle("계좌 생성");
				createAccount();
			}else if (selectNum.equals("2")) {
				printTitle("계좌목록보기");
				accountList();				
			}else if (selectNum.equals("3")) {
				printTitle("예금");
				addBalnace("예금 이다");
			}else if (selectNum.equals("4")) {
					printTitle("출금");
					addBalnace("출금 이다");
					
			}else if (selectNum.equals("5")) {
					System.out.println("프로그램 종료");
					break;
			}else {
					System.out.println("선택 숫자만 입력 하세요");
				}
	}	// while문 블럭 끝
	
}// main 메소드 블럭 끝
	//출력 메소드 
	public static void printTitle(String str) { // 만들어 두고 필요 할떄 마다 쓴다.메소드 호출
		System.out.println("---------------");
		System.out.println(str);
		System.out.println("---------------");
		
	}
	// 계좌 생성 메소드
	private static void createAccount() {
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
		
	}
	//계좌 목록 보기 
	private static void accountList() {
		for(Account2 a: accounts) {//향상된 for문 이여서 null (없는) 값은 계산 자동으로 하지 않는다
			if(a==null) { break;}
			System.out.println(a.getAccountNum()
					+"  "+a.getAccountName()+
					"  "+a.getBalance());
		}
		
	}
	//예금,출금 하기 
	private static void addBalnace(String text) {
		System.out.print("계좌번호 :");
		String accountN = scan.nextLine();
		System.out.println(text+"액 : ");
		int price = Integer.parseInt(scan.nextLine());
		//boolean isAccount = false;
		//계좌 번호에 해당 하는 계좌가 있을 경우 잔고에서 금액을 더 해준다
		Account2 account = findAccount(accountN);
		if(account == null) {
			System.out.println("없는 계좌 입니다.");
			return;
		}
		int balance = text.equals("예금") ? 
					account.getBalance()+price : 
					account.getBalance()-price;
		account.setBalance(balance);
		System.out.println("결과 :"+ text+ "이 성공 되었씁니다.");
	}
		
	
	//accounts 배열에서 일치하는 계좌번호가 있으면 해단하는 account객채를 리턴해주는 메소드
	//findAccount의 리턴 값이 null이면 없는 계좌 
	//null이 아니면 있는 계좌
	private static Account2 findAccount (String accountNum) {
		Account2 account = null;
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				if(accounts[i].getAccountNum().equals(accountNum)){
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}
}


