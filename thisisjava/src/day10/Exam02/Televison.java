package day10.Exam02;

public class Televison implements RemotConttol {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("티비 전원을 켭니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("티비 전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume>RemotConttol.MAX_VOLUME) {
			this.volume = RemotConttol.MAX_VOLUME;
		}else if (volume< RemotConttol.MIN_VOLUME) {
			this.volume = RemotConttol.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨 :" + this.volume);
	}
	
		
	
	

}
