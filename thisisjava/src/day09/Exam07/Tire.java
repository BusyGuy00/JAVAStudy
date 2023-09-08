package day09.Exam07;

public class Tire {
	//필드 
	public int maxRotation; 			//최대 회전수 (타이어 수명)
	public int accumulatedrotation;		//누적 회전수 (누적 회전수가 수명을 넘어가면 타이어어 수명이 끝난거다.)
	public String location;				//타이어 위치

	
	//생성자
	public Tire(String location,int maxRotation) {
		this.location = location;
		this.maxRotation =  maxRotation ;
	}
	//메소드 
	public boolean roll() {
		++accumulatedrotation;
//		누적 회전수가 최대 회전수보다 작으면 true리턴 아니면 false 리턴
		if(accumulatedrotation < maxRotation) {
			System.out.println(location + "Tire수명 : " + (maxRotation-accumulatedrotation));
			return true;
		}else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
		
		
	}
	
	
	
}
