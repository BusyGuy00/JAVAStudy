package Lv0;

public class Exam01 { //문자열 겹처쓰기
public static void main(String[] args) {
//	my_string.substring는 문자열 자르는 명령어?
	String re = solution ("Helloworld" , "lloworl", 2);
	System.out.println(re);
}
public static String solution(String my_string, String overwrite_string, int s){
	//빈 문자열을 만든 후에 answer = answer + my_string.substring(0,s); 로 설정 해서 서브 스트링을 대입 시킨다
	String answer = "";
	// 그 후에 문자열을 자르는 것을 만들고 int s를 준다 문자열 0~s까지 대입 시킨다 +=이라고 표기 해도 된다
	answer = answer + my_string.substring(0,s);
	//뒤에 나머지 부분을 더해 준다 그러면 Helloworl이 출력 된다
	answer = answer + overwrite_string;
	//부족한 문자열 만큼 뒤에 글을 마저 붙이 겠다? 
	answer = answer + my_string.substring(s+overwrite_string.length());
	return answer;
}



}
