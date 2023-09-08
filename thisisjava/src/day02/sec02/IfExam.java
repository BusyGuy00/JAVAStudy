package day02.sec02;

import java.util.Scanner;

public class IfExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("숫자를 입력 하세요 ");
		//nextLine() string 
		int number = scan.nextInt();
		if (number%3 ==0 ) {
			System.out.println(number + "는 3의 배수 입니다.");
		}
		if (number%5 ==0 ) {
			System.out.println(number + "는 5의 배수 입니다.");
		}
		String str1 = "김그린";
		String str2 = "김그린";
		System.out.println(str1 == str2);
		//참조변수를 비교시 ===연산자는 잠조번지를 비교 한다.
		//문자열 내용의 비교는 문자열.eauals("문자열")
		//문자는 같은 문자일 경우 주소끼리 값을 비교하는데 
		//새로운 주소를 만들지 않기 때문에 new를 써야 새로운 주소를 만든다
		String str3 = new String("김그린");
		String str4 = new String("김그린");
		System.out.println(str3.equals(str4));
		
		
	}

}
