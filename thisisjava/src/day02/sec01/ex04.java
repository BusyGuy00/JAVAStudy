package day02.sec01;

public class ex04 {

	public static void main(String[] args) {
			int x = 10;
			int y = 20;
			int z = (++x) + (y--);
			System.out.println(z);	

			int score = 85;
			String result = (!(score>90)? "가" : "나");
			System.out.println(result);
			
			int x2 = 10; int y2 = 5;
			System.out.println((x2>7)&&(y2<=5));
			System.out.println((x2%3 ==2) || (y%2 != 1));
			
	}

}
	