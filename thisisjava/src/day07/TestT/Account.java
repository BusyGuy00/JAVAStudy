package day07.TestT;

public class Account {
//	인스턴스 필드 : 잔고 
	private int balance;
	//상수 변할수 없는  static final이 상수 선언
	static final int MIN_BALABCE = 0;
	static final int MAX_BALABCE = 1000000;
	
	public int getBalance () { //이것으로 잔고 확인 가능 
		return this.balance;
	}  //잔고 값을 수정할떄 수정값이 0보다 작은 음수 이거나
	   //10000보다 크면 원래 있던 잔고값으로 지정
	public void setBalance(int balance) {
		if(balance >= Account.MIN_BALABCE && balance <= Account.MAX_BALABCE) {
			this.balance = balance;
		}
//		String str = 조건 ? (맞으면) a(트루 일떄) : b(아닐때)
//		this.balance = balance >= Account.MIN_BALABCE
//				&& balance <= Account.MAX_BALABCE
//				? balance : this.balance;
	}
}
