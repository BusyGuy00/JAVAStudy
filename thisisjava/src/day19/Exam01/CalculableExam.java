package day19.Exam01;

public class CalculableExam {

	public static void main(String[] args) {
//		Calculable calc = new Calculable() {
//			//익명 구현 객체 
//			@Override
//			public void calculable(int x, int y) {
//				System.out.println(x + "-" + y);
//				
//			}
//			
//			
//		};
//		calc.calculable(10,20);
		Calculable calculable1 = new Calc1();
		action(calculable1);
		Calculable calculable2 = new Calc2();
		action(calculable2);
		action(new Calculable() {

			@Override
			public void calculable(int x, int y) {
				System.out.println("익명 구현 객체 사용 : " + x );
				
			}
		});
		action((x,y)-> {
			System.out.println("람다식 출력 곱셈 : " + (x*y));
		});
	}
	public static void action(Calculable calc) {
		int x = 10;
		int y = 20;
		calc.calculable(x, y); // 위에 action((x,y)-> { 실행 된다.
	}

}
