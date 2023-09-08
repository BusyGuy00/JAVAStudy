package day10.Exam02;

public class SmartTelevisionExam {

	public static void main(String[] args) {
		//인터페이스 변수 
		RemotConttol rc = new SmartTelevision();
		Searchable sc = new SmartTelevision();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnoff();
		
		//sc.turnOn();
		sc.search("naver.com");
		rc.setMute(true);
		rc.setMute(false);
		RemotConttol.changeBattery();
		
	}
	
}
