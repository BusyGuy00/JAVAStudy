package day18.Exam01;

import java.util.TreeSet;

public class PersonTreeSetExam {

	public static void main(String[] args) {
		//Person은 정렬 기준이 없어서 for문으로 구현 할 수가 없다.
		//정렬이 되려면 Comparable인터페이스 가 구현 되어 있어야 가능 하다
		TreeSet<Person> treeset = new TreeSet<>(new PersonComparator() ); // 여기에 추가 
		treeset.add(new Person("김그린", 30));
		treeset.add(new Person("이기른", 20));
		treeset.add(new Person("박그린", 10));
		for(Person p : treeset) {
			System.out.println(p.name+ " , " + p.age);
		}
		
	}

}
