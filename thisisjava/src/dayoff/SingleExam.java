package dayoff;

public class SingleExam {
	
	public static void main(String[] args) {
		Single si1 = Single.getInstanceof();
		Single si2 = Single.getInstanceof();
		if(si1 == si2) {
			System.out.println("참조하는 객체가 같다");
		}
	}
}
