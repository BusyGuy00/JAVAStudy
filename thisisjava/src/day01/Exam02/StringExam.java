package day01.Exam02;

public class StringExam {

	public static void main(String[] args) {
		int value = 10 + 2 + 8 ;
		System.out.println("value : " + value);
		
		String str1 = 10 + 2 + "8"; // 12 + "8" = "128"
		System.out.println(str1);
				
		String str2 = "10" + (2 + 8); //1010
		System.out.println(str2);
	}

}
