package day17.coffee;

public class App {

	public static void main(String[] args) {
		//손님
		Customer customer = new Customer();
		//바리스타 
		Barista barista = new Barista();
		//메뉴
		Menu menu = Menu.getInstance();
		
		//order실행
		customer.order( "아메리카노", menu, barista);
		customer.order( "딸기라떼", menu, barista);
		

	}

}
