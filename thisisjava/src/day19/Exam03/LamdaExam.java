package day19.Exam03;

public class LamdaExam {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x,y)-> {
			double result = x + y;
			return result;
		});
//		person.action((x,y)->return x+y);
		person.action((x,y)-> x+y);
		
		//리턴문이 하나일 경우 (메소드 호출)
//		person.action((x,y)->{
//			return sum(x,y);
//		});
		person.action((x,y)->sum(x,y)); // 위에 와 같은 실행문이 하나인데 값을 나타낼때는 리턴을 생략하고 람다식으로 이렇게 단축이 가능 하다 
	
		}
	
	public static double sum(double x, double y) {
		return x+y;
	}
	
}
