package day16.Exam01;

import java.awt.Toolkit;

public class BeepPrintRunnableExam {
	
	public static void main(String[] args) {
		//스레드 생성하기  -Runnable 타입을 익명구현 객체로 기정 
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					//동작을 잠시 일시정지 시킨다 . sleep(500); 1000이 1초 일시 정지 이다.
					try {
						Thread.sleep(500); //sleep은 예외 처리를 해주어야 한다. 
					}
					catch (InterruptedException e) {						
						e.printStackTrace();
					}
				}
				
			}
			
		}); 
		thread.start();
		
		// 작업 2 메인스레드 작업
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
