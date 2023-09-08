package day15.Exam03;

public class BoxObject<T> {
	//필드
	public T content;

	
	public boolean compare(BoxObject<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
}
