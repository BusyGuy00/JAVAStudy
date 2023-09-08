package day07.TestT;

public class ShopService {
	private static ShopService shopService = new ShopService(); // static 정적 필드 , private는 클래스만 이용 가능
//	 ShopService.shopService 
	private ShopService(){
		
	}
//	메소드
//	리턴 타입
	static ShopService getInstance() { // static을 넣어 따로 객체 생성을 하지 않아도 된다.
		return shopService;
	}
	
}
