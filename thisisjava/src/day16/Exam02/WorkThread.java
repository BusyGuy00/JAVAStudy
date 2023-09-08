package day16.Exam02;

public class WorkThread extends Thread {
	//필드 
	public boolean work = true;
	
	//생성자 
	public WorkThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName()+ " : 작업처리");
			}else {
				//실행대기 상태가 되고 실행을 다른 스레드에게 넘
				Thread.yield();
			}
		}
	}
	

}
