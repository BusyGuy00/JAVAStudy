package day20.Exam05;

import java.util.Arrays;

public class MatchIntExam {

	public static void main(String[] args) {
		int[] intArr = {2,4,5};
		//intArr의 모든 요소가 2의 배수인가?
		boolean result = Arrays.stream(intArr)
				.allMatch(num-> num%2==0);
		System.out.println("모두 2의 배수인가? " + result);
		
		boolean result2 = Arrays.stream(intArr)
				.anyMatch(num -> num%3== 0);
		System.out.println("3의 배수가 하나라도 있나요 ? " + result2);
		
		boolean result3 = Arrays.stream(intArr)
				.noneMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 없나요 ? " + result3);

	}

}
