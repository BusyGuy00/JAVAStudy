package day20.Exam03;

import java.util.ArrayList;
import java.util.stream.Stream;

//50,80,90,100,70,60,90 → 리스트 컬렉션
//중복제거 후 70점 이상만 평균을 구해서 출력


public class List {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add(50);
	list.add(80);
	list.add(90);
	list.add(100);
	list.add(70);
	list.add(60);
	list.add(90);
	double avg = list.stream() 	//list.stream() // 평균을 구하기 위해서 double 타입으로 받아준다.
	.distinct()
	.filter(num -> num>=70)
	.mapToInt(num -> (int)num) // int타입은 average가 안돼서 매핑을 한 후 평균을 구한다
	.average().getAsDouble();
	
	System.out.println(avg);
	System.out.println("======================");
	list.stream()
	.distinct()
	.filter(num -> num>= 70)
	.forEach(num->System.out.println(num));
	
	System.out.println("======================");
	
	//스트림 생성 
	Stream<Integer> stream = list.stream();
	stream.forEach( num -> System.out.println(num));
	
	System.out.println("======================");
	
	//중복제거 
	list.stream().distinct()
	.forEach(num -> System.out.println(num));
	
	System.out.println("======================");
	
	//평균 구하기 
	 int sum = 0;
	 for (int num : list) {
		 sum += num;
	 }
	 System.out.println(sum);

}
}
