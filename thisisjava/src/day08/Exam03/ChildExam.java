package day08.Exam03;

public class ChildExam {

	public static void main(String[] args) {
//		자식 객체 생성 
		Child child = new Child();
		
//		자동 타입 변환
		Parent parent = child;
		Parent parent2 = new Parent();
		parent.method1();
		parent2.method1();
		child.method3();
//		parent.method3(); 자식 타입 객체는 부모타입으로 자동 변환 했을때 
//		부모 타입의 메소드와 필드만 사용 가능 하다
//		이떄 부모 클래스에 있는 것 자식 클래스에서 오버 라이드한 메소드는 자식 메소드가 적용됨
	}

}
