package day19.Exam06;

public class ConstructorReferenceExam {

	public static void main(String[] args) {
		Person person = new Person();		
										// 인터페이스 매개 변수
		Member m1 = person.getMember1(new Creatable1 () {
			@Override
			public Member create(String id) {
				return new Member(id);
			}
			
		});
//		Member m2 = person.getMember1((id)->{
//			return new Member(id);
//		});
		//람다식
		Member m2 = person.getMember1(id-> new Member(id));
		//메소드 참조
		Member m3 = person.getMember1(Member::new);
		
		//익명 구현 객체
		Member m4 = person.getMember2(new Creatable2() {
			@Override
			public Member create(String id, String name) {
				return new Member(id,name);
			}
		});
		// 람다식
		Member m5 =person.getMember2((id,name)->new Member(id,name));
		//메소드 매개 변수 
		Member m6 = person.getMember2(Member::new);
		System.out.println(m6);
		System.out.println(m3);

	}

}
