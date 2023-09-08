package day16.Exam05;

public class InterruptPrintThread extends Thread{

	@Override
	public void run() {
//		try {
			while(true) {
			System.out.println("실행중");
//			Thread.sleep(1); //계속 true상태여서 sleep을 주었따 
			if(Thread.interrupted()) { //break로 변경 가능 하다 
				break; 
			}
//		}
//		}catch (InterruptedException e) {						
//			e.printStackTrace();
//		}
		
		System.out.println("리소스 닫기");
		System.out.println("종료");
		}
	}
}


//while(true) {
//	System.out.println("실행중");
//	Thread.sleep(1); //계속 true상태여서 sleep을 주었따 