package day09.Exam05;

public class PhoneExam {
	public static void main(String[] args) {
//		Phone phone = new Phone(); 추상 클래스여서 객체 생성이 불가능 하다 
		SmartPhone smartPhone = new SmartPhone("김그린");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();
	}

}
