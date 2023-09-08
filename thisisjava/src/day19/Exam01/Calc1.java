package day19.Exam01;

public class Calc1 implements Calculable  {

	@Override
	public void calculable(int x, int y) { 
		// - 람다식으로 할시 public void calculable는 화살 표로 대체 된다. 그 후에  - 매개변수가 앞에 오고 구현부가 뒤에 온다 
		//action((x,y)-> {
		//					System.out.println("람다식 출력 곱셈 : " + (x*y));
		System.out.println("calc1 실행!!!");
		System.out.println("뺄셈 : " + ( x - y ));
		
	}

}
