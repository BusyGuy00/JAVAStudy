package day10.Exam02;
//다중 상속 상속 받은 것의 메서드만 사용 가능 하다 
public class SmartTelevision implements RemotConttol, Searchable {
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "검색 합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("티비를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume>RemotConttol.MAX_VOLUME) {
			this.volume = RemotConttol.MAX_VOLUME;
		}else if (volume< RemotConttol.MIN_VOLUME) {
			this.volume = RemotConttol.MIN_VOLUME; //
		}else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨 :" + this.volume);
	}
		
	}


