package day15.Book;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair <String, Integer> childpair = new ChildPair<>("홍길원" , 35);
		Integer childAge = util.getValue(childpair, "홍삼원");
		System.out.println(childAge);
	}
	
}
