package day07.Test;

public class MemberserviceExam {

	public static void main(String[] args) {
		Memberservice myMember = new Memberservice();
		boolean result = myMember.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다");
			myMember.logout("hong");
		}else {
			System.out.println("id 또는 pass가 올바르지 않습니다.");
		}
	}

}
