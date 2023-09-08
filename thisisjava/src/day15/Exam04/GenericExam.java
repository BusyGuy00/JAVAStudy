package day15.Exam04;

public class GenericExam {
	
	//제네릭메소드 : 타입 파라미터를 가지고 있는 메소드

	public static <T> Box<T> boxing (T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	public static void main(String[] args) {
		//제네릭 메소드 호출 
		Box<Integer> box1 = boxing(100);
		Box<String> box2 = boxing("green");
		
	}

}
