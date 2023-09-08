package day18.Exam01;

public class Fruit implements Comparable <Fruit> {
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit o) {
		if( price < o.price) {
			return  -1;
		} else if (price == o.price){
			return 0;
		} else {
			return 1;
		}
	}

}
