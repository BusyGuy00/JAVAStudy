package day14.Exam02;

import java.text.DecimalFormat;

public class DecimalFormatExam {
	//형식 객체를 생성 
	//형식객체 .format(숫자)  ----> 형식화된 문자열을 리턴 
	
	
public static void main(String[] args) {
	double num = 123456.789;
	DecimalFormat df = new DecimalFormat("#,###"); // ,은 단위구분 .을 빼면 소수자리를 뺄수 있다.
	//DecimalFormat df = new DecimalFormat("#,###.##");  //(마지막 .뒤에 ##이 붙는 만큼 있는 소수 자리가 표시 된다,)
	//DecimalFormat df = new DecimalFormat("0000,000.0000"); //빈자리를 0으로 채운다
	//DecimalFormat df = new DecimalFormat("#,###.##%"); // 퍼센트가 붙는다
	//DecimalFormat df = new DecimalFormat("\u00A4#,###.##"); // 통화 표시가 같이 붙는다 
	System.out.println(df.format(num));
}
}
