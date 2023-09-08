package day12exam01;

public class FrenchFried {
	private int price;
	private String desc;
	public FrenchFried() {
		
	}
	public FrenchFried(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc+"입니다");
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
