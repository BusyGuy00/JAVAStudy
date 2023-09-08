package day16.Exam01;

public class BeepRunnableExam {

	public static void main(String[] args) {
		//메인스레드
		//스레드 생성 
		//멀티 스레드를 만듦으로써 순차적으로 일을  진행 시키는 것이 아니라 병렬로 같이 처리 가능 하게 해주는다 
		//알림음과 문자가 따로 출력이 됬었으나 멀티 쓰레드를 함으로써 알림과 문자가 같이 출력된다.
//		RunnableChild runchild  = new RunnableChild(); 밑에와 같은 의미이다
		Thread thread = new Thread(new RunnableChild());
		thread.start();
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
