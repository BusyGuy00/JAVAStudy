package day20.Exam03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExam02 {
	
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		
		IntStream intstream = Arrays.stream(intArray);
		intstream
		.asDoubleStream()
		.forEach(d -> System.out.println(d));
		
		//기본타입을 래퍼 스트림으로 변환 
		IntStream intstream2 = Arrays.stream(intArray);
		intstream2.boxed()
		.forEach(obj -> System.out.println(obj.intValue()));
		
		
		
		
	}

}
