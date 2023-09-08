package day19.Book.Exam04;

public class Example {

	public static void main(String[] args) {
		Thread thread = new Thread (
				()->{
					for(int i=0; i<3;i++) {
						System.out.println("작업 스레드가 실행됩니다.");
					}
				}
		);
		thread.start();
//		Thread thread2 = new Thread (new Runnable() { //Runnable로 월래는 사용 가능 하나 람다식으로 줄여 쓸수 있다.
//			 run(){
//				for(int j=0; j<3; j++) {
//					System.out.println("작업 스레드가 실행 됩니다.");
//				}
//			}
//		});
	}

}
