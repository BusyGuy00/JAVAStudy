package day09.Exam07T;
// 타이어의 회전수에 따른 펑크 
// 타이오 최대 회전수 ,누적 회전수 현 상태를 알아야 한다
public class Tire {
	public int maxRotation; //타이어 수명
	public int rotation; //누적 회전수
	public String location; //타이어 위치
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++rotation;
		if (rotation < maxRotation) {
			System.out.println(location +"tire 수명 : "+(maxRotation - rotation));
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크"+"***");
			return false;
		}
	}
}
