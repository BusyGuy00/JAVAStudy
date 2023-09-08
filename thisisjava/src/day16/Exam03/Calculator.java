package day16.Exam03;

//공유 클래스
public class  Calculator {
	private int memory;
	
	public int getMemory() {
		return memory; 
	}
	
	public void setMemory(int memory) {
		 synchronized (this) {
		this.memory = memory;
		try {
			Thread.sleep(2000); //sleep은 예외 처리를 해주어야 한다. 
		}
		catch (InterruptedException e) {						
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
				+ " : " + this.memory);}
	}
}
