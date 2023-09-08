package day15.Book;

public class util {

	//정적 메소드 메소드 이름 getvalue 리턴 타입 객체의 key 값을 리턴 하거나 null을 ㄹㅣ턴
	
	public static <K, V> V getValue(Pair<K, V> p,K k) {
		if(p.getkey() == k) {
			return p.getValue();
		}else {
			return null;
		}
		
	} 
	
	
	
}
