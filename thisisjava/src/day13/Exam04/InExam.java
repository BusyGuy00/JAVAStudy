package day13.Exam04;

import java.io.IOException;

public class InExam {

	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keyCode = 0;
		while(true) {
			if(keyCode != 13&& keyCode != 10) {				
			}if(keyCode == 49) { //숫자 1키를 읽었을때
				speed++;
			}else if (keyCode == 50) { // 숫자 2키를 읽었을때
				speed--;
			}else if(keyCode == 51) { // 숫자 3키를 읽었을때
				break;
			}
			
			System.out.println("---------------------------------");
			System.out.println(" 1.증속 | 2.감속 | 3.중지 " );
			System.out.println("---------------------------------");
			System.out.println(" 현재 속도 : " + speed);
			System.out.println("---------------------------------");
			System.out.println(" 선택 : ");
			//키를 하나씩 읽음  //사용 하려면 throws IOException를 추가해야 한다
			keyCode = System.in.read();
		}
		System.out.println("프로그램 종료");

	}

}
