package day04;

public class RefExam {

	public static void main(String[] args) {
		String str1 = "김그린";
		String str2 = str1 ;
		String str3 = new String("김그린");
		String str4 = new String("김그린");
		String str5 = null;
		
		
		System.out.println(str1 ==  str5);
		System.out.println(str2 == "김그린");
		System.out.println((str3).equals(str4));
		System.out.println(str3.length());
		

	}

}
