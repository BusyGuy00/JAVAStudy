package day06Exam02;

public class Tv2 {
// 필드 값 초기화 
	String brand;
	public Tv2(String brand) {
		this.brand=brand;
	}
	boolean power = false;
	int channel = 0;
	int volume = 10;
	//메소드
	void powerOn() {
		System.out.println("전원음킴");
		this.power=true;
	}
	void powerOff() {
		System.out.println("전원끔");
		this.power=false;
	}
	void channelUp() {
		if(this.power) {
		this.channel++;
		System.out.println("채널은 :" + this.channel);
		}else {
			System.out.println("tv를 켜시오");
		}
	}
	void channelDown() {
		this.channel--;
		System.out.println("채널은 : " + this.channel);
	}
	
}

