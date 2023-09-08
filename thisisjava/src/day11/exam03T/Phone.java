package day11.exam03T;

public class Phone {

	Button Bt = new Button() {

		@Override
		public void call() {
			System.out.println("전화를 겁니다");
			
		}

		@Override
		public void Message() {
			System.out.println("메세지를 보냅니다.");
			
		}

		
		
	};
	
	public void user1() {
		Bt.call();
		Bt.Message();
	}
}
