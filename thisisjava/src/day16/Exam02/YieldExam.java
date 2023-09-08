package day16.Exam02;

public class YieldExam {

	public static void main(String[] args) {
		WorkThread workthreadA = new WorkThread("wokrThreadA");
		WorkThread workthreadB = new WorkThread("wokrThreadB");
		workthreadA.start();
		workthreadB.start(); //실행 대기 상태가 된다. 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		workthreadA.work = false;
		workthreadB.work = false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		workthreadA.work = true;
	}

}
