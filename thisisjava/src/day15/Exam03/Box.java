package day15.Exam03;

public class Box<T> {
	//타입이 결정 되지 않은
	public T content;

	
	//메소드 
	public T getContent() {
		return content;
	}
	public void setContent (T content) {
		this.content = content;
	}
	
	
}
