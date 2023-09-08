package day20.Book.Exam05;

import java.util.Arrays;
import java.util.List;



public class Eample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expressions",
			"Java8 supports lambda expressions"
			);
		//대소문자 구분 없이 java 찾기 
		//str.contains("java") 대소문자를 전부 포함 해서 찾아야 해서 str이 toLowerCase()로 소문자로 반환한 값을 받게 한다
		list.stream()
		.filter(str-> str.toLowerCase().contains("java"))
		.forEach(str -> System.out.println(str));
	}
}
