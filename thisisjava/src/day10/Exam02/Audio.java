package day10.Exam02;

public class Audio implements RemotConttol {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("오디오를 끕니다");
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
		System.out.println("현재 오디오 볼륨 :" + this.volume);
	}
	
}
