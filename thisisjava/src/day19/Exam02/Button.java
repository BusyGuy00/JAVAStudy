package day19.Exam02;

public class Button {
	// 정적 중첩 인터페이스 (클래스 안에 인터페이스를 넣었기에 중첩 인터페이스라 한다 )
	@FunctionalInterface //  추상메소드 2개 이상인지 검사 
	public static interface ClickListener{
		//추상 메소드 1개 !!!
		void onClick();
	}
	//필드 
	private ClickListener clickListener;
	
	//메소드 
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}

}
