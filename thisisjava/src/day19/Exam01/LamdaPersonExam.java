package day19.Exam01;

public class LamdaPersonExam {

	public static void main(String[] args) {
		Person p = new Person();
		//Person에 있는 Workable workabled을 전달 해야 한다 
		p.action(new Workable() {
			@Override
			public void work() {
				System.out.println("익명 구현 객체 오버라이딩 메소드 실행");			
			}
			
		});
		//람다식  위와 같은 효과이다. 
		p.action(()-> {
			System.out.println("람다 오버라이딩 메소드 실행");
			System.out.println("람다 오버라이딩 메소드 실행2");
			
		});
		p.action(()-> System.out.println("람다 오버라이딩 메소드 실행3")); //이렇게 실행문이 한개 일때는 {}를 생략이 가능 하다 
		
		
	}

}
