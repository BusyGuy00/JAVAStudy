package day06Exam02;

public class CalculatorExam {

	public static void main(String[] args) {
//			써큘레이터 메서드의 인스턴스 maCalc
		Calculator myCalc = new Calculator();
//			리턴 값이 없는 메소드 호출
		myCalc.poweron();
//			리턴 값이 있는 메소드 호출 결과는 re변수에 저장
		int re = myCalc.plus(10,20);
		System.out.println(re);
		String str = "김그린";
		int leng = str.length();
		System.out.println(leng);
		myCalc.poweroff();

	}

}
