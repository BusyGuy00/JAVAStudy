package day13.Exam05;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String data1 = "홍길동&박수홍,박연수";
		String[] arr = data1.split("&|,");
		for(String a : arr) {
			System.out.println(a);
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
				
				
	}

}
