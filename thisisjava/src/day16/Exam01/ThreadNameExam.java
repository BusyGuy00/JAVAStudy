package day16.Exam01;

public class ThreadNameExam {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //현재 진행준인 객체의 번지를 받을 수 있다 
		System.out.println(mainThread.getName());
		
		for(int i=0; i<3; i++) {
			Thread threadA = new Thread() {

				@Override
				public void run() {
					System.out.println(getName()+"실행");
				}
				
			};
			
			threadA.start(); 
		}
		Thread chatThread = new Thread () {

			@Override
			public void run() {
				System.out.println(getName()+"실행");
			}
			
		};
		chatThread.setName("chat-Thread");
		chatThread.start();

	}

}
