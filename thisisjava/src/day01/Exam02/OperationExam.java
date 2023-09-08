package day01.Exam02;

public class OperationExam {

	public static void main(String[] args) {
		// int 이하의 데이터타입의 산술연산결과는 int 타입으로 자동 변한 되어서 int이상로 결과를 받아야 한다.
		byte byteValue1 = 10;
		byte byteValue2 = 30;
		int result = byteValue1 + byteValue2;
		System.out.println(result);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int charResult = charValue1 + charValue2;
		
//		연산을 하고 리터널로 값을 줄때는 int로 변환 하지 않아도 괜찮다
		byte byteResult = 10 +20;
		System.out.println(byteResult);
		long value1 = 1000L;
		int value2 = 200;
		// 롱과 인트의 연산에 롱이 더 크기에 롱으로 받아줘야 한다 
		long result2 = value1 + value2;

		System.out.println(result2);
		
		
		double doubleValue = 31.12345;
		int intValue4 = 30; 
		double doubleResult = doubleValue + intValue4 ;
		
		double d = 5 / 3.0;
		//5 / 3 = 1.6666 ---> 1  실수 연산을 하기 위해선 위와 같이 둘중 하나를 실수로 표기해 줘야 한다
		System.out.println(d);
		
		
		
		//단위 절삭
		int money =1238;
		money = money / 10 * 10 ;
		System.out.println(money);
		
		int money1 =1234;
		money1 = money1 / 100 * 100;
		System.out.println(money1);
		
		int money2 =1234;
		money2 = money2 / 1000 * 1000;
		System.out.println(money2);
		
		int x = 1;
		int y = 2;
		//둘다 정수의 연산이여서 밑에 double인 실수 타입으로 캐스팅 하면 값이 실수로 나온다 .
		double result3 = x / (double) y ;
		System.out.println(result3);
		
	}

}
