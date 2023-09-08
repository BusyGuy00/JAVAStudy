package day03;

public class javabookex04 {

	public static void main(String[] args) {
		while(true) {		
		int num1 = (int)(Math.random()*6)+1; //1~6
		int num2 = (int)(Math.random()*6)+1; // 1~6
		System.out.println(("("+num1+","+num2+")")); //결합 연산자
//		System.out.println("(%d,%d)" num1,num2)
		if(num1+num2==5){
		break;
		}
	}
		

}
}