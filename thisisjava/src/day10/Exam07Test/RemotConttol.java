package day10.Exam07Test;
//티비를 켜고 끄고 볼륨이 나오게끔 설정 하라 
public interface RemotConttol {
	int MAX_VOLUME = 10;
	int MINE_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 입니다");
			setVolume (MINE_VOLUME);
		}else {
			System.out.println("무음이 아닙니다.");
		}
	}
		
	}
	
	
	
	
	


