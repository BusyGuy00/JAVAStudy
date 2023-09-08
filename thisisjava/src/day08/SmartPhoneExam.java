package day08;

public class SmartPhoneExam {

	public static void main(String[] args) {
		Smartphone myPhone = new Smartphone ("아이폰","흰색");
		
		System.out.println(myPhone.color);
		System.out.println(myPhone.model);
		System.out.println(myPhone.wifi);
		
		myPhone.bell();
		myPhone.sednVoice("여보세요");
		myPhone.receiveVoice("안녕하세요");
		myPhone.sednVoice("네 반갑습니다.");
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
