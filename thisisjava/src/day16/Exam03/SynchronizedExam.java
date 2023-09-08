package day16.Exam03;

public class SynchronizedExam {

	public static void main(String[] args) {
		//공유 객체 
		Calculator calculator = new Calculator ();
		
		User1Thread user1Thread = new User1Thread ();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		
		User2Thread user2Thread = new User2Thread ();
		user2Thread.setCalculator(calculator);
		user2Thread.start();

	}

}
