package day12exam01;

public class Burger {
	//필드 가격, 설명, 
	private int price;
	private String desc;
	//생성자 
	public Burger() {
		this(2000,"기본버거");
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
	public Burger(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc+ "가 만들어 졌습니다.");
	}
	
	
}
