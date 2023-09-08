package day11.exam03;



public class ButtonExam2 {
public static void main(String[] args) {
	Button btnOk = new Button();
	
	btnOk.setonClickListener(new Button.onClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("OK 버튼을 클릭 했습니다.");
			
		}
	});
	btnOk.touch();
	Button btnCancel = new Button();
	btnCancel.setonClickListener(new Button.onClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("Cancel버튼을 클릭 헀습니다.");
			
		}
	});
	btnCancel.touch();
}
		
}
