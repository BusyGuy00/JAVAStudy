package day13.Exam04;

public class Exit {

	public static void main(String[] args) {
		// exit()메소드는 프세스를 종료 시킴
		// 종료 선택값을 전달하는데 정상중일떄는 0, 비정상종료일때는 1, -1 을 쓰는게 관례다 
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if( i == 5 ) {
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}
			
		
	}

}
