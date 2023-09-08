package day10.Exam02;

public interface RemotConttol {
	//상수 필드 static final생략됨!!
	int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0;
	//추상 메소드 abstract샏각
	void turnOn();
	void turnoff();
	void setVolume (int volume);
	
	//디폴트 메소드 
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
			setVolume(MIN_VOLUME);
			
		}else {
			System.out.println("무음 해지 합니다.");
		}
		
		
		}
	static void changeBattery() {
		System.out.println("리모트 건전지를 교체 합니다");
	}
	
}
