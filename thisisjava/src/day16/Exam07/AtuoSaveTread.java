package day16.Exam07;

public class AtuoSaveTread extends Thread {
	
	public void save() {
		System.out.println("작업 내용을 저장함");
	}

	@Override
	public void run() { //무한 반복하며 1초마다 위의 내용을 출력한다
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
			save();
		}
	}
	

}
