package day12exam01.Exam02;

public class ExceptionHandlingExam4 {

	public static void main(String[] args) {
		String[] array = {"100", "100", null, "200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array{"+i+"]" + value);
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("배열 인덱스가 초과됨 :" + e.getMessage());
				}//두개 이상의 예외를 하나의 catch블럭에서 처리 하고 싶을때
				catch(NullPointerException | NumberFormatException e) {
					System.out.println("데이터에 문제 있음"+ e.getMessage());
				}finally { //finally는 예외 상황 발생 유무와 상관 없이 무조건 출력 시키고 싶을때 쓴다.
					System.out.println("ooooo");
				}
			
		}

	}

}
