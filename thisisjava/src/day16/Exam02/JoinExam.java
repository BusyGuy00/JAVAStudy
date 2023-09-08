package day16.Exam02;

public class JoinExam {

	public static void main(String[] args) {
		SumThread thread = new SumThread();
		thread.start();// 조인 상태에서 호출메소드가 정지 상태가 되고 조인 메소드가 실행 상태가 된다.  thread.start(); 에서 메인 스레드는 thread이다.
		try {
			thread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("1~100까지의 합 : " + thread.getSum());

	}

}
