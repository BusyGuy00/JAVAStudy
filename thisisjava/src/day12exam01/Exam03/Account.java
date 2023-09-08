package day12exam01.Exam03;

public class Account {
	//필드
	private long balance;
	
	
	//생성자
	public Account () {}
	
	public long getBalance () {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws InsufficientException { 
		if(balance < money) {
			throw new InsufficientException ("잔고 부족 : " + (money - balance) +"모자람" ); // 예외를 발생 시켰다 
		}
		balance -= money;
	}
	
}
