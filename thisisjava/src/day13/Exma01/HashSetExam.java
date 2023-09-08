package day13.Exma01;

import java.util.HashSet;

public class HashSetExam {
	
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1,"green");
		hashSet.add(s1);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s2 = new Student(1, "green");
		hashSet.add(s2);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s3 = new Student(2, "blue");
		hashSet.add(s3);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
	
}
}
