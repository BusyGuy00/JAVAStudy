package day15.Exam04;

public class ExtendsGenericExam {

	//제한된 타입 파라미터를 갖는 제네릭 메소드 
	//T 클래스에 숫잠나 오도록 제한을  주었다 
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare("
		+t1.getClass().getSimpleName() + ","
		+t2.getClass().getSimpleName()+")");
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return (v1==v2);
		
		
		
	}
	
	public static void main(String[] args) {
		//제네릭 메소드 호출 
		boolean result = compare(10,20); // T를 Integer타입으로 대체
		System.out.println(result);
		
		boolean result2 = compare(4.5f,4.5f); //T를 Double타입으로 대체
		System.out.println(result2);
		
		//compare("a",4); 는 안돼다.
		
	}
	
	
	
}
