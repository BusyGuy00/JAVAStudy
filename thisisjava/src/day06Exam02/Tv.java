package day06Exam02;

public class Tv {
//	필드
	String brand; // 브랜드 
	boolean power = false; // 전원
	int channel = 0; // 채널
	int volume = 10; // 음량
	public Tv() {
		
	}
	//생성자
	public Tv(String brand) {
		this.brand = brand;
	}
	//메소드
	//1.전원을 켜다 
	void powerOn() {
		System.out.println("전원이 켜집니다.");
		this.power = true;
	}
	//2.전원을 끄다 
	void poweroff() {
		System.out.println("전원이 꺼집니다.");
		this.power = false;
	}
	//3. 채널 이동 위로 
	void channelUp() {
		if(this.power) {
		this.channel++;
		System.out.println("채널은 : " + this.channel);
		}else {
			System.out.println("전원을 켜시오");
		}
	}
	//3. 채널 이동 아래 
	void channelDown() {
		this.channel--;
		System.out.println("채널은 : " + this.channel);
	}
	//4.음량 높이기
	void volumeUp() {
		this.volume++;
		System.out.println("음량은 : " + this.volume);
	}
	//5.음량 높이기
	void volumeDown() {
		this.volume--;
		System.out.println("음량은 : " + this.volume);
	}
	
	
	
	
}
