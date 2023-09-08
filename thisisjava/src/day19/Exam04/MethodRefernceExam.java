package day19.Exam04;

public class MethodRefernceExam {

	public static void main(String[] args) {
		Person person = new Person();
		//정적 메소드일 경우 
		//람다식
		person.action((x,y) -> {
			return Computer.staticMethod(x, y);
		});
		
		//람다식 메소드 참조 
		person.action( Computer :: staticMethod);
		
		person.action(new Calculable() {

			@Override
			public double calc(double x, double y) {
				// TODO Auto-generated method stub
				return Computer.staticMethod(x, y);
			}
			
		});
		
		//인스턴스 메소드일 경우 
		
		Computer com = new Computer();
		//람다식
		person.action((x,y) -> {
			return com.instanceMethod(x, y);
		});
		
		person.action(new Calculable() {

			@Override
			public double calc(double x, double y) {
				// TODO Auto-generated method stub
				return com.instanceMethod(x, y);
			}
			
		});
		
		
		//람다식 메소드 참조 
		person.action(com :: instanceMethod);
		
	}

}
