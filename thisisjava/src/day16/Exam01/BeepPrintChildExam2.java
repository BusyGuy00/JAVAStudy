package day16.Exam01;

import java.awt.Toolkit;

public class BeepPrintChildExam2 {
	
	public static void main(String[] args) {
		//스레드 생성 
		Thread thread = new Thread() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					//동작을 잠시 일시정지 시킨다 . sleep(500); 1000이 1초 일시 정지 이다.
					try {
						Thread.sleep(500); //sleep은 예외 처리를 해주어야 한다. 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			
		};
		thread.start();
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			//메인스레드 처리 
			try {
				Thread.sleep(500); //sleep은 예외 처리를 해주어야 한다. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
