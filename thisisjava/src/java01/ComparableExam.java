package java01;

import java.util.TreeSet;

public class ComparableExam {
	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<>();
		treeset.add(new Person("홍길동", 22));
		treeset.add(new Person("김그린", 26));
		treeset.add(new Person("이블루", 21));
		for(Person p : treeset) {
			System.out.println(p.name + " : " + p.age);
		
	}
	
	TreeSet<Fruit> treeset2 = new TreeSet<>(new FruitComparator());
	treeset2.add(new Fruit("포도",10000));
	treeset2.add(new Fruit("사과",7000));
	treeset2.add(new Fruit("딸기",5000));
	for(Fruit f : treeset2) {
		System.out.println(f.name +" : "+f.price);
	}
	
	
	}
}
