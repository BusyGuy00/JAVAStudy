package day08.Flower;

public class Flower {
	public String name;
	public String cost;
	
	public Flower (String name, String cost ) {
		this.name=name;
		this.cost=cost;
	}
	
	
	public void flowerInformation () {
		System.out.println(name+"1송이는"+cost+"입니다.");
	}
	

}
