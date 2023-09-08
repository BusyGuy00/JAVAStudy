package day19.Exam05;

public class MethodReferenceExam {
	public static void main(String[] args) {
		//글자의 순서를 자동으로 알려주는 것 
		Person person = new Person();
		//익명 구현 객체
		person.ordering(new Comparable () {

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return a.compareToIgnoreCase(b);
			}
			
		});
			//람다식
//		person.ordering((a,b)->{
//			return a.compareToIgnoreCase(b);
//		});
		person.ordering((a,b)->a.compareToIgnoreCase(b));
		
			//참조 변수
		person.ordering(String ::compareToIgnoreCase);
			
		
	}
	
	
	
}
