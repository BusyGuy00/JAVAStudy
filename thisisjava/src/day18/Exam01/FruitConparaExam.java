package day18.Exam01;

import java.util.TreeSet;

public class FruitConparaExam {
	
		public static void main(String[] args) {
			TreeSet<Fruit> treeSet = new TreeSet<>();//new  FruitComparator());
			
			treeSet.add(new Fruit("포도",5000));
			treeSet.add(new Fruit("수박",8000));
			treeSet.add(new Fruit("딸기",10000));
			
			for(Fruit f : treeSet) {
				System.out.println(f.name + " " + f.price);
			}
			
		}

}
