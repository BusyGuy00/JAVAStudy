package day04;

public class StringMethod {

	public static void main(String[] args) {

//		01.length() 문자열 길이를 갯수 반환
		String str = "그린컴퓨터아카데미";
 		int strNum = str.length();
		System.out.println(strNum);
		
//		02. chrAt index 0번 부터 카운팅 
		char ch = str.charAt(0);
		System.out.println(ch);	
		
//		03.replace (특정문자 , 변경될 문자)
		String str2 = "파이썬는 재미있다.";
		String str3 = str2.replace("파이썬", "자바");
		System.out.println(str3);

		//04 substring(startindex, endindex) 문자열 추출
		String str4 = "javascript";
		String str5 = str4.substring(0,4);
		System.out.println(str5);
		String str6 = str4.substring(5);
		System.out.println(str6);
		//05. indexOf("찾는 문자열")
//		contains("찾는 문자열") ---> 문자열이 있으면 true, 없으면 false리턴
		int charnum = str4.indexOf("o");
		System.out.println(charnum);
		String str7 = "자바 프로그래밍";
		boolean isjava = str7.contains("자바");
		System.out.println(isjava);
		//06. split(구분자)
		String names = "그린, 블루, 오렌지";
		String[] names2 = names.split(",");
		System.out.println(names2[2]);
		

	}

}
