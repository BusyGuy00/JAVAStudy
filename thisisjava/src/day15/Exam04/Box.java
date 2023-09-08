package day15.Exam04;

//제네릭타입 선언

public class Box<T> {
	//필드
	private T t;
	
	//getter
	public T get () {
		return t;
	}
	//Setter 
	public void set (T t) {
		this.t = t;
	}
	
	
}
