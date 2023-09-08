package day13.Exam02;

public class RecordExam {
	
public static void main(String[] args) {
	Member m = new Member ("winter", "눈송이", 25);
	Member m2 = new Member ("winter", "눈송이", 25);
		// Getter메소드 호출 
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println(m.toString());
	
	
		System.out.println(m.hashCode() == m2.hashCode());
		System.out.println(m.equals(m2));
}
}
