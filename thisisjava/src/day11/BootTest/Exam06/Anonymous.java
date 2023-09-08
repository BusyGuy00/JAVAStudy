package day11.BootTest.Exam06;

public class Anonymous {
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("달립니다.");
			
		}
		
	};
	
	
}
