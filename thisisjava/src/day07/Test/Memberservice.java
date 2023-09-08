package day07.Test;

public class Memberservice {
// boolean && true && true을 이용해서 트루 상황을 만들라
	boolean login(String id, String password){
		if(id.equals("hong") && (password.equals("12345"))) {
			return true;
		}else {
			return false;
		}
	}
	String id = "hong";
	void logout(String id) {
		System.out.println( id +"님이 로그아웃 하셨습니다.");
	}
}
