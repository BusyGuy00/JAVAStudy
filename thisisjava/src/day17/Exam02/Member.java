package day17.Exam02;

public class Member {

	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}

	@Override
	public int hashCode() { //객체의 번지 비교가 아닌 객체의 필드 값을 비교 하게끔 재정의 한 것이다. 
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) &&(target.age==age);
		}
		return false;
	}
	
}
