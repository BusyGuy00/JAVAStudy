package day18.Book.Exam10;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
	
		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student("blue",96));
		treeSet.add(new Student("hong",86));
		treeSet.add(new Student("white",92));
		
		Student student = treeSet.last();
		System.out.println("최고 점수 : " + student.score);
		System.out.println("최고 점수 아이디 : " + student.id);
		
		
	}
}
