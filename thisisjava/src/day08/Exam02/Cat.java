package day08.Exam02;

public class Cat extends Animal {
	String name;
	int age;
	
	public Cat(String name, int age ) {
		this.name=name;
		this.age = age;
		this.kind = "고양이";
	}
//	@Override
//	public void sound() {
//		System.out.println("냐옹냐옹");

	@Override
	public void sound() {
		super.sound();
		System.out.println("냐옹냐옹");

	}
	
	
}
