package day10.veify;

public class SoundableExam {
	public static void printsound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
		
	public static void main(String[] args) {
		printsound (new Cat());
		printsound (new Dog());
	}
}
