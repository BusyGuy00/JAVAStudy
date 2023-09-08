package day16.Exam07;

public class MyThread extends Thread {

	

	private char[] i;

	@Override
	public void run() {
		
		for (int i=10; i>0; i--);{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}

}
