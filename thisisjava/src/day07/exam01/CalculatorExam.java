package day07.exam01;

public class CalculatorExam {

	public static void main(String[] args) {
		
//		정적 멤버는 클래스로 접근 해야 한다.
		System.out.println(Calculator.pi);
		Calculator calc = new Calculator();
		int result = calc.divide(50, 5);
		int result2 = calc.plus (10,20); //클래스 명으로 사용 하라는 경고가 뜬다.
//		int result3 = Calculator.divide(20,2);
		
		System.out.println(result);
//		인스턴스 멤버는 클래스로 접근이 안돼지만 정적멤버는 둘다 가능 
		System.out.println(result2);
		System.out.println(Calculator.info);
	}

}
