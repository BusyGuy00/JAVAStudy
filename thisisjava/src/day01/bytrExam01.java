package day01;

public class bytrExam01 {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = 127;
	//	byte var3 = 128; byte의 허용 범위가 -128~ 127이다 
		char var3 = 'a';  //문자 하나만 유니코드로 가능 하다 
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		//string은 문자열을 저장 하는 참조 타입이다 ""로 감싸서 저장 해야 한다 
		String str1 = "김그린";
		System.out.println(str1 + "입니다");
	}

}
