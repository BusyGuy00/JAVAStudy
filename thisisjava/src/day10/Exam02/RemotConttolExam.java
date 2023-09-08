package day10.Exam02;

public class RemotConttolExam {
 public static void main(String[] args) {
	//인터페이스 변수 선언 
	 RemotConttol rc = new Televison();
	 
	 //rc에 Televition 객체 대입 
//	 rc = new Televison();
	 rc.turnOn();
	 rc.setVolume(6);
	 rc.turnoff();
	 
	 rc = new Audio();
	 rc.turnOn();
	 rc.setVolume(4);
	 rc.turnoff();
}
}
