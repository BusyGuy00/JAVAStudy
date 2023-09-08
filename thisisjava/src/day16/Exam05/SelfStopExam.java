package day16.Exam05;

public class SelfStopExam {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000); //3초 동안 실행후 실행이 종료 된다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printThread.setStop(true);
	}

}
