package day20.Exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam {

		public static void main(String[] args) {
			
//			Product pro = new Product(1,"제품","그림",10000);
//			System.out.println(pro); //객체의 이름과 해시코드 번지수가 나온다
			//List 컬렉션 생성 
			List<Product> list = new ArrayList<>();
			for(int i=1; i<=5; i++) {
				Product product = new Product(i, "상품"+i, "그린", (int) (10000*Math.random()));
				list.add(product);
			}
			Stream<Product> stream = list.stream();
			stream.forEach(p ->System.out.println(p));
			
		}
}
