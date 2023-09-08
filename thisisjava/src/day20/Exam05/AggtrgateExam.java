package day20.Exam05;

import java.util.Arrays;

public class AggtrgateExam {

	public static void main(String[] args) {
		// 정수 배열 
		int[] arr = {1,2,3,4,5};
		//카운팅
		//오리지널 스트림
		long count = Arrays.stream(arr)
				.filter(n-> n%2 ==1) //필터처리 해야할 일이 있는 경우 편하게 사용 가능하다는 장점이 있다. 
				.count(); //개수를 돌려준다.
		System.out.println("요소의 개수는 : " + count);
		
		//총합 
		long sum = Arrays.stream(arr)
				.filter(n-> n%2==1)
				.sum();
		System.out.println("홀수의 총합 : " + sum);
		
		//평균 
		double avg = Arrays.stream(arr)
				.filter(n-> n%2==1)
				.average()
				.getAsDouble();
		System.out.println("홀수의 평균 : " +avg);
		
		//최대값
		int max = Arrays.stream(arr)
				.filter(n-> n%2==1)
				.max()
				.getAsInt();
		System.out.println("최대값 : " + max);
		
		//최소값
		int min = Arrays.stream(arr)
				.filter(n-> n%2==1)
				.min()
				.getAsInt();
		System.out.println("최소값 : " + min);
		
		//첫번째 요소 
		int first = Arrays.stream(arr)
				.filter(n -> n%2 ==1)
				.findFirst()
				.getAsInt();
		System.out.println("first");

				
		

	}

}
