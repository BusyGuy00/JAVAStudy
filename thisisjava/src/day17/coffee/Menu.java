package day17.coffee;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	//싱글톤 패턴 : 객체는 하나만 만든다.
	private static Menu instance = new Menu();
	private List<MenuItem> items; //메뉴 아이템 타입에 넣을 리스트 아이템을 만들어 준다.
	
	public static Menu getInstance() {
		return instance; //프라이빗 Menu여서 다른 곳에서도 사용 가능하게 만들어준다.
	}
	private Menu() {
		items = new ArrayList<MenuItem>();
		items.add(new MenuItem("아메리카노", 1500 ));
		items.add(new MenuItem("카페모카", 2000 ));
		items.add(new MenuItem("허니자몽블랙티", 2500 ));
		items.add(new MenuItem("바닐라라테", 2500 ));
		items.add(new MenuItem("녹차", 2000 ));
		items.add(new MenuItem("홍차", 2000 ));
	}
	public MenuItem choose(String menuName) {
		for(MenuItem menuitem : items){
			if(menuitem.getName().equals(menuName)) {
				return menuitem;
			}
		}
		return null;
	}
	
	
	
	
}
