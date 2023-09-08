package day11.exam03;

public class ButtonExam   {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setonClickListener(new callListener());
		btn.touch();
		
		btn.setonClickListener(new MessageListener());
		btn.touch();

	}

}
