package day16.Exam07;

public class DaemonExam {

	public static void main(String[] args) {
		AtuoSaveTread autosave = new AtuoSaveTread();
		//데몬스레드 지정 
		autosave.setDaemon(true); //데몬 스레드 지정을 하지 않으면 메인스레드가 종료 되고 나서도 
								  //서브 스레드가 작업을 수행 하기 때문에 데몬 스레드 지정으로 같이 종료 되게 만드는게 좋다.
		autosave.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");

	}

}
