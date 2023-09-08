package day12exam01;

public class BigburgerSet {
	private Bigburger bigburger;
	private Coke coke;
	private FrenchFried FrenchFried;
	
	public BigburgerSet (Bigburger bigburger, Coke coke, FrenchFried frenchFried ) {
		this.bigburger = bigburger;
		this.coke= coke;
		this.FrenchFried = frenchFried;
	}

	public Bigburger getBigburger() {
		return bigburger;
	}

	public void setBigburger(Bigburger bigburger) {
		this.bigburger = bigburger;
	}

	public Coke getCoke() {
		return coke;
	}

	public void setCoke(Coke coke) {
		this.coke = coke;
	}

	public FrenchFried getFrenchFried() {
		return FrenchFried;
	}

	public void setFrenchFried(FrenchFried frenchFried) {
		this.FrenchFried = frenchFried;
	}

}
