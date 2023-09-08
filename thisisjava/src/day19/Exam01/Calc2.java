package day19.Exam01;

public class Calc2 implements Calculable {

	@Override
	public void calculable(int x, int y) {
		System.out.println("calc2 실행!!!");
		System.out.println("덧셈 : " + ( x + y ));
	}
	

}
