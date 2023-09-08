package day02.sec02;

public class IfelseExam {

	public static void main(String[] args) {
			int score = 75;
			
			if (score>=90) {
				System.out.println("A");
			} else if (score >=80){
				System.out.println("B");
			} else if (score >=70){
				System.out.println("C");
			} else {
				System.out.println("D");
			}
			
		//	int iRandom = (int) Math.random()*3;
		//	System.out.println(iRandom);
			int iRandom = (int) (Math.random()*6) +1;
			switch(iRandom) {
			case 1:
				System.out.println("1입니다");
				break;
			case 2:
				System.out.println("2입니다");
				break;
			case 3:
				System.out.println("3입니다");
				break;
			case 4:
				System.out.println("4입니다");
				break;
			case 5:
				System.out.println("5입니다");
				break;
			default:
				System.out.println("오류");
			}
//			if(iRandom==1) {
//				System.out.println("1입니다.");
//			}
//			if(iRandom==2) {
//				System.out.println("2입니다.");
//			}
//			if(iRandom==3) {
//				System.out.println("3입니다.");
//			}
//			if(iRandom==4) {
//				System.out.println("4입니다.");
//			}
//			if(iRandom==5) {
//				System.out.println("5입니다.");
//			}
	}
	
}
