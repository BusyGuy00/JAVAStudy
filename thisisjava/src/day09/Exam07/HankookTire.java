package day09.Exam07;

public class HankookTire extends Tire {
	public HankookTire(String location,int maxRotation) {
		super(location,maxRotation );
	}

	@Override
	public boolean roll() {
//		누적 회전수 1 증가
		++accumulatedrotation;
//		누적 회전수가 최대 회전수보다 작으면 true리턴 아니면 false 리턴
		if(accumulatedrotation < maxRotation) {
			System.out.println(location + "한국 Tire수명 : " + (maxRotation-accumulatedrotation));
			return true;
		}else {
			System.out.println("***" + location + "한국 Tire 펑크 ***");
			return false;
		}
	}
	
}
