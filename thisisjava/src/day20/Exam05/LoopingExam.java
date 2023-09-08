package day20.Exam05;

import java.util.Arrays;

public class LoopingExam {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
//		
//		Arrays.stream(intArr)
//		.filter(a-> a%2 == 0)//양수만 리턴 하게 한다.  당연히 {}와 return을 생략한 상태 (a -> {return a%2 == 0 ;})
//		.peek(n-> System.out.println("peek" + n)); // 중간처리 최종처리 메소드가 없으므로 잘못 작성 됐다. 
		
			
//		int total = Arrays.stream(intArr)
//		.filter(a-> a%2 == 0)
//		.peek(n-> System.out.println(n))
//		.sum();
		
		//최종 처리 메소드 forEach() 사용하기
		Arrays.stream(intArr)
		.filter(a-> a%2 == 0)
		.forEach(n-> System.out.println("forEach" +n));
		
	}

}
