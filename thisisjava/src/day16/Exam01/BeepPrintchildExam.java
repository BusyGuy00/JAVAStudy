package day16.Exam01;

public class BeepPrintchildExam {
	
	public static void main(String[] args) {
		//작업 스레드 생성 
		Thread thread = new ThreadChild();
		thread.start();
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			
	
			try {
				Thread.sleep(500); //sleep은 예외 처리를 해주어야 한다. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
