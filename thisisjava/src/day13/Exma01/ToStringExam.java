package day13.Exma01;

public class ToStringExam {
	public static void main(String[] args) {
		Object obj = new Object();
		//Object (객체)의 toString()메소드는 객체의 문자 정보를 리턴 
		//클래스명@16진수 해시코드
		//println 메소드는 매개값이 기본타입이 오거나 
		//문자열일 경우에는 해당 값을 그대로 출력 
		//매개값이 객체가 되면 객체의 toString() 메소드를 호출해서 
		//리턴값을 출력 
		System.out.println(obj.toString()); // obj.toString은 .toString이 없어도 나오게끔 정의가 됭 있어서 그렇다
		String str = "green";
		System.out.println(str.toString());
		
		
		
		
		
		
		
		
		
}
}
