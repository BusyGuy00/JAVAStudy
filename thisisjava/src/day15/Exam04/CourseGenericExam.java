package day15.Exam04;

public class CourseGenericExam {

	public static void main(String[] args) {
	//	Person person1 = new Person();
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("--------------------------------------------------");

		//학생만 신청 가능 Course에서 접근 제한을 두었다
	//	Course.registerCourse2(new Applicant<Person>(new Person()));
	//	Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("--------------------------------------------------");


		//직장인 및 일반인만 신청가능  Course에서 접근 제한을 두었다 
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
	//	Course.registerCourse3(new Applicant<Student>(new Student()));
	//	Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
	//	Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));

		
		
	}

}
