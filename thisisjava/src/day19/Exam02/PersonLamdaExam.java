package day19.Exam02;

public class PersonLamdaExam {

	public static void main(String[] args) {
		Person person = new Person();
		person.action1((name, job)->{
			System.out.println(name + "이");
			System.out.println(job + "을 합니다.");
		});
		///홀길동이 프로그래밍 합니다.
		person.action2((content)->System.out.println(content));
		//안녕하세요 라고 말합니다.

	}

}
