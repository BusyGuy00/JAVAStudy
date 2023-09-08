package day15.Exam04;

public class Course {

	//모든 사람이 등록 가능 
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이가 Course1 을 등록 함");
	}
	
	//학생만 등록 가능 
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이가 Course2 을 등록 함");
	}
	
	//직장인 일반인 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이가 Course3 을 등록 함");
	}

	
	
}
