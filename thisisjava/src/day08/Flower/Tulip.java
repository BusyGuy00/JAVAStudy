package day08.Flower;

public class Tulip extends Flower {

	String color;

	public Tulip(String name, String cost, String color) {
		super(name, cost);
		this.color=color;
	}

	@Override
	public void flowerInformation() {
		System.out.println(color+name+"1송이는"+cost+"입니다.");
	}

}
