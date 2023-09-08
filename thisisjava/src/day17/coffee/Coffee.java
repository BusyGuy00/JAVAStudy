package day17.coffee;

public class Coffee {

	private String name;
	private int price;
	
	public Coffee(MenuItem menuitem) {
		this.name = menuitem.getName();	
		this.price = menuitem.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
