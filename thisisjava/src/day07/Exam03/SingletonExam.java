package day07.Exam03;

public class SingletonExam {
	public static void main(String[] args) {
		Singleton obj1 =Singleton.getInstacne();
		Singleton obj2 =Singleton.getInstacne();
//		동일한 객체인지 참조 확인 
		if(obj1 == obj2) {
		System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
	}
	
}
