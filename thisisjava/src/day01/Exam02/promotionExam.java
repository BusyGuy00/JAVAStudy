package day01.Exam02;

public class promotionExam {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
				
		char charValue = 'A' ;
		int intValue2 = charValue;
		System.out.println(intValue2);

		
		int intValue3 = 100;
		long longvalue = intValue3;
		System.out.println(longvalue);
		
		float floatValue = 1.123f;
		System.out.println(floatValue);
		double doubleValue = floatValue;
		System.out.println(doubleValue);
//		float 과 double의 차이는 비트와 정확도 차이다.


		
		//캐스팅 44032의 유니코드가 가로 바뀌는것 정해진 문자가 정해져 있다 65=A라고 표기 된다.
		int intValue4 = (int) floatValue;
	    System.out.println(intValue4);
	    
	    int intValue5 = 44032;
	    char charValue2 = (char) intValue5;
	    System.out.println(charValue2);
	    
	    int intValue6 = (int) 3.14;
	    System.out.println(intValue6);
	}

}
