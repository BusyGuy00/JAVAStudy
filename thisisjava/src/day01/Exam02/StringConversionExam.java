package day01.Exam02;

public class StringConversionExam {

	public static void main(String[] args) {
		// 문자열을 기본 타입으로 변환 기본 타입 클래스. parseint("문자열")
		int value = Integer.parseInt("1010");
		double value2 = Double.parseDouble("1.235");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 은 " + value);
		System.out.println("value2 은 " + value2);
		System.out.println("value3 은 " + value3);
		
//		기본타입을 문자열로 변환  ( 값 뒤애 "" 이걸로 계산할때도 ""이 반영되어 문자열로 변환 된다. 
		String str1 = 100 + "" ;
		String str2 = 3.14 + "";
		String str3 = String.valueOf(true);
		
		System.out.println("str1 은 " + str1);
		System.out.println("str2 은 " + str2);
		System.out.println("str3 은 " + str3);
		
//		문제 실수로 계산 후에 정수로 바꾸는 방법 
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int) (var1 + var2 );		
		System.out.println(result);
		
		
	}

}
