package day20.Exam02;

public class Product {

	private int pno;
	private String name;
	private String company;
	private int price;
	
	public Product(int pno, String name, String company, int price) {
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	public int getpno() { return pno;}
	public String getname() {return name;}
	public int getPrice() { return price;}
	public String getCompant() {return company;}
	
	@Override
	public String toString() {
		
		return new StringBuilder()
				.append("{")
				.append("pno: " + pno + ", ")
				.append("name: " + name + ", ")
				.append("company: " + company + ", ")
				.append("price:" + price)
				.append("}")
				.toString(); // toString로 받는다 
	}
	
}
