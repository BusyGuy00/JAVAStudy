package day13.Exam05;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder data = new StringBuilder();
		data = data.append("green");
		data = data.insert(2, "ABC");		
		String str = data.toString();
		System.out.println(str);
		
		data = data.delete(2, 4);
		String str2 = data.toString();
		System.out.println(str2);
		
		data = data.replace(0, 3, "aaaaa");
		String str3 = data.toString();
		System.out.println(str3);

	}

}
