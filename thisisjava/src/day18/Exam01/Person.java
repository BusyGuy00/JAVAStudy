package day18.Exam01;

import java.util.TreeSet;

//Person 타입이 for문으로 비교를 하려면 implements Comparable<Person> 가 필요하고 compareTo라는 오버라이드 설정을 해줘야 한다.
public class Person{ //implements Comparable<Person>{ 왼쪽과 같이 하지 않고
					// PersonComparator을 새로 만들어 비교군을 만들어 주고
					//TreeSet<Person> treeset = new TreeSet<>();안에  new PersonComparator() 추가 해도 된다
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int compareTo(Person o) {
//		if(age < o.age) {
//			return -1;
//		}else if (age == o.age) {
//			return 0;
//		}else {
//			return 1;
//		}
//	}
	
	
	
}
