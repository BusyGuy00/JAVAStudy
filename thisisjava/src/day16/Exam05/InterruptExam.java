package day16.Exam05;

public class InterruptExam {
	public static void main(String[] args) {
		InterruptPrintThread thread = new InterruptPrintThread();
		thread.start();
		try {
			thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
	}
}
