package day09.Exam06;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		animalSound(cat);
		animalSound(dog);
		
		
		
	}
	public static void animalSound(Animal animal) {
			animal.sound();
	}
	
	

}
