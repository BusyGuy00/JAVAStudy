package day20.Exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysStreamExam {

	public static void main(String[] args) {
		String[] strArray = {"김미나" , "이그린", "김블루"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item->System.out.println(item));
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.println(item*2));
		
		IntStream intStream2 = IntStream.range(1, 10);
		intStream2.forEach(a -> System.out.println(a));
		
		IntStream intStream3 = IntStream.rangeClosed(1, 10);
		intStream3.forEach(b -> System.out.println(b));
		
		
		
	}

}
