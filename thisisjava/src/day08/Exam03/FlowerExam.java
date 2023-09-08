package day08.Exam03;

public class FlowerExam {
		public static void main(String[] args) {
			Rose rose = new Rose("장미", 1500,"핑크");
			Tulip tulip = new Tulip("튤립", 1300);
			
			Flower flower = new Flower("수선화",1000);
			Flower flower2 = rose;
			rose.flowerInformation();
			tulip.flowerInformation();
			flower.flowerInformation();
			flower.overMethod();
			flower2.overMethod();
//			flower2. 로즈 타입에 있는 메소드는 사용이 안됀다 플라워 타입 이다. 플라워 타입에서 오버로딩이 된 값만 로즈에서 바꿔 쓸수 있다.
		}
}
