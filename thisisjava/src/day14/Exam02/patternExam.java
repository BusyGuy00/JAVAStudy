package day14.Exam02;

import java.util.regex.Pattern;

public class patternExam {

	public static void main(String[] args) {
		//숫자 02또는 010-123-1234, 010-1234-1234
		//(02|010)-|w{3,4}-|w{4}
		String regExp = "(02 | 010) - \\d{3,4} - \\d{4}"; //"\\단어\\" \단어\을 출력 하기 위해서 \(역 슬러쉬)를 앞뒤로 붙여 주면 된다 
		String date = "010 - 123 - 1234";
		boolean result = Pattern.matches(regExp, date);
		if(result) {
			System.out.println("정규식과 일치 합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}			
		//이메일 green@naver.com green@aaa.co.kr 
		//\w+@\w+\.\w+(\.\w+)?
		String emailRegExp = "\\W+@\\.\\W+(\\.\\W+)?";
		String emailstr = "green@naver.com";
		boolean result2 = Pattern.matches( emailRegExp, emailstr);
		if(result2) {
			System.out.println("이메일 정규식이 일치 합니다.");
		}else {
			System.out.println("이메일 정규식이 일치 하지 않습니다.");
		}
	
	}

}
