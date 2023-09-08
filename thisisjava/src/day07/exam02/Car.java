package day07.exam02;

public class Car {
//	필드 선언
	private int speed;
	private boolean stop;
//	private 값들의 캡슐화 해준 과정 
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed <0) {
			this.speed = 0;
		}else {	
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	
}
