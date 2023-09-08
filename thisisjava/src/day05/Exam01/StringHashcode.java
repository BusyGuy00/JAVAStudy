package day05.Exam01;

public class StringHashcode {

	public static void main(String[] args) {
		String str1 = "김그린";
		String str2 = "김그린";
		String str3 = new String("김그린");
		String str4 = new String("김그린");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}

}
