package day12exam01.Exam03;

public class AccountExam {
	
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
	
	//출금 하기 
	try {
		account.withdraw(3000);
	}
	catch(InsufficientException e) {
		System.out.println(e.getMessage());
	}

}
}
