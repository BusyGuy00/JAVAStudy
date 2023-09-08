package day11.exam03;

public class Button {
	onClickListener listener;
	void setonClickListener(onClickListener listener) {
		this.listener = listener;
	}
	
	
	void touch() { // void onClick();을 실행 하기 위한 메소드 
		listener.onClick();
	}
	// 중첩 인터페이스 (정적 멤버 인터페이스)
	static interface onClickListener{
		//추상 메소드 
		void onClick();
		
	}
	

}
