package day03;

public class StarExam {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {    
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for(int i=4; i>=0; i--) {
//			for(int j=0; j<=i; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=0; i<5; i++) {  
			for(int j=5; j>i; j--) {

				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++) {  //i=0
			for(int j=4; j>0; j--) { //4,3,2,1,0
				if(i < j) {
					System.out.print(" ");
				}else {
				System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
