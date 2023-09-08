package day20.Exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExam {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best devoloper");
		
		list1.stream()
		//Arrays.stream (배열) --> Stream<String> 리턴 해준다
//		.flatMap(data -> Arrays.stream(data.split(""))) //하나씩 출력하게 해준다
		.forEach(word -> System.out.println(word));
		
		
		//문자열 숫자 스트림을 수자 스트림 반환
		List<String> list = Arrays.asList("10","20","30","40","50");
		
		//오리지널 스트림 
		list.stream()
		.flatMapToInt(data -> {
			//String[] 배열을 int[]배열로 변경 
			String[] strArr = data.split(",");
			//int[]배열 생성 
			int[] intArr = new int[strArr.length];
			for (int i=0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		})
		.forEach(number -> System.out.println(number));
		
		
	}
}
