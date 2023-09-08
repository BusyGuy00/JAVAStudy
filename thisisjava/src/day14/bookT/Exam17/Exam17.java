package day14.bookT.Exam17;

import java.util.regex.Pattern;
//첫번째는 알파벳으로 시작하고 두 번째 부터 숫자와 알파벳으로 구성된 8~12자리의 id 값인지 검사 
public class Exam17 {
public static void main(String[] args) {
	String id = "5Angel1004";
	String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}" ;
	boolean isMatch = Pattern.matches (regExp,id);
	if(isMatch) {
		System.out.println("ID로 사용할 수 있습니다.");
	}else {
		System.out.println("ID로 사용할 수 없습니다.");
	}
}
}
