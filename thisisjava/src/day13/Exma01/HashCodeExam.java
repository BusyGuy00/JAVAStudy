package day13.Exma01;

public class HashCodeExam {

	public static void main(String[] args) {
		Student s1 = new Student(1, "green");
		Student s2 = new Student(1, "green");
		
//		System.out.println(s1.hashCode() == s2.hashCode());
		if ( s1.hashCode() == s2.hashCode() ){
			if (s1.equals(s2)) {
				System.out.println("동등 객체 입니다");
			}else {
				System.out.println("데이터가 다릅니다.");
			}
		} else {
			System.out.println("해시코드가 다릅니다.");
		}
	}
	
	
}
