package day09.Exam;

public class ChildExam {

	public static void main(String[] args) {
//		클래스 타입의 자동 타입 변환과 강제 타입변화
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Parent parent3 = new Child();
		
		Child child1 = new Child();
		
//		parent2는 Parent 타입으로 필드와 메소드 사용 가능 
		parent2.field1 = "안녕";
//		parent2.field2 = "안녕"; 자식 클래스의 field2는 사용이 불가능 하다 
		
//		강제 타입 변환 
		Child child2 =(Child) parent2;
//		Parent child3 = (Child) parent1 ; 자식 클래스로 자동 타입 변환된 parent1이 아니여서 불가능하다
		child2.method3();
		child2.field2 = "하이";
		

		typeChange(parent3);
		
		
		
//		instanceof 연산자 
//		객체 instanceof 클래스 타입 
		System.out.println(parent1 instanceof Child);
		System.out.println(parent2 instanceof Parent);
		System.out.println(parent2 instanceof Child);
		
	
		
	}
	//parent 타입 객체를 매개변수 전달받아 Child타입으로 강제 타입 변환 한다
	public static void typeChange(Parent parent) {
//		모든 parent 타입을 강자 타입 변환 할 수 없음 
//		Child타입의 객체가 자동 타입 변환된 경우에만 강제타입변환 할수 있으며
//		child타입 인지 확일을 instanceof로 할 수 있다.
		if(parent instanceof Child ) {
		Child child = (Child) parent; //캐스팅 하는 (차일드 클래스)로 변환 하는 것 
		System.out.println("강제 타입 변환 됨");
		}
	}

}
