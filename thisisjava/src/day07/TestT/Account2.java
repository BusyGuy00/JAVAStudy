package day07.TestT;

public class Account2 {
	private String accountNum;		//계좌번호
	private String accountName;		//계좌주	
	private int balance;			//잔고
	
//	public Account2 () {
//		//하나하나 입력 받아야 해서 3개가 다 있는 객체가 아닌 하나 있는것으로 써야 한다 디폴트 생성자여서 안만들어도 만들어 진걸로 인식돼있지만 밑에 만들어둔 것떄문에 새로 하나 생성한 것
//	}
//	public Account2 (String accountNum, String accountName, int balance) {
//		this.accountName = accountName;
//		this.accountNum = accountNum;
//		this.balance = balance;
//	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
