package day09.Exam02;

public class AnimalExam {
public static void main(String[] args) {
	Animal anicat = new Cat();
	Animal anidog = new Dog();
	
	anicat.sound(); 
	anidog.sound(); 
	typeChange(anidog);
	typeChange(anicat);
	
}
	public static void typeChange(Animal ani) {
		if (ani instanceof Dog) {
		Dog dog = (Dog) ani;
		}
		
	}
}
