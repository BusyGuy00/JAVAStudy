package day12exam01;

public class Lotte {
 public static void main(String[] args) {
	System.out.println("햄버거 세트를 만들어 봅시다.");
	System.out.println("===============================================");
	
	Bigburger b1 = new Bigburger (5000, "맛있는 빅버거");
	Coke c1 = new Coke(1500,"콜라");
	FrenchFried f1 = new FrenchFried (1000, "튀김");
	
	BigburgerSet set1 = new BigburgerSet(b1, c1, f1);
	BigburgerSet set2 = new BigburgerSet(
			new Bigburger(5000, "불고기 빅버거"),
			new Coke(2000,"제로콜라"),
			new FrenchFried(1500,"양념감자")
			);
	int setprice1 = set1.getBigburger().getPrice()+set1.getCoke().getPrice()+set1.getFrenchFried().getPrice();
	int setprice2 = set2.getBigburger().getPrice()+set2.getCoke().getPrice()+set2.getFrenchFried().getPrice();
	System.out.println("set1의 합계는 " +setprice1+ "입니다.");
	System.out.println("set1의 합계는 " +setprice2+ "입니다.");
}
}
