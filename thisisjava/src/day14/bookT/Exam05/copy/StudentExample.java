package day14.bookT.Exam05.copy;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {
		//Student 객체를 저장할 HashSet 생성
	HashSet<Student> hashset = new HashSet<Student>();
		//Student 저장 
		// 원래 필드 선언시 같은 형식이라도 번지가 다르게 생성 되더라도 같지 않다 H`ashset을 틍해
		//필드의 값이 같으면 같게 인식 하도록 재정의 한 과정이다.
	hashset.add(new Student("1"));
	hashset.add(new Student("1"));
	hashset.add(new Student("3"));
	
	System.out.println("저장된 Student 수 :" + hashset.size());
	
	}

}
