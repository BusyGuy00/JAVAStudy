package day01.exam03;

import java.io.IOException;

public class KeyCodeExam {                 // System.in.read(); 예외 처리가 필요해서  throws Exception 추가 되었다

	public static void main(String[] args) throws Exception  {
		// system.out 표준 출력 장치
        // system.in 표준 입력 장치 
		int keycode;
		// while 문은 true일시에 반복 작업이 가능 하다 
		while(true) {
		keycode = System.in.read();
		System.out.println("keyCode" + keycode);
		}
		
		//keycode = System.in.read();
		//System.out.println("keyCode" + keycode);
		//keycode = System.in.read();
		//System.out.println("keyCode" + keycode);
		
	}

}
