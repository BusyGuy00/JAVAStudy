package day12exam01.Exam02;

public class ExceptionHandlingExam3 {

	public static void main(String[] args) {
			//배열의 길이는 2 마지막 index 1
			//ArrayIndexOutOfBoundsException 배열의 반복문 조건이 값의 배열의 길이가 길떄 발생 하는 오류 
		String[] array = {"100", "가"};
		for(int i=0; i<=array.length; i++) {		
			//	System.out.println("array{"+i+"]"+array[i]);
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array{"+i+"]"+value);
				}
//				catch(ArrayIndexOutOfBoundsException e) {
//					System.out.println("배열 인덱스(길이가) 초과됨 :" + e.getMessage());
//				}
				//Exception 가 상위 클래스여서 맨 밑에 두거나 하나로 사용 하면 된다.
				//Exception 가장 상위 클래스 여서 다른 오류에 대한 대입을 전부 포함 시키고 싶을때 사용 하면 된다.
				catch(Exception e) { //NumberFormatException 글을 숫자로 바꿀 수 없을떄 나오는 오류 문구
					System.out.println("숫자로 변환 할 수 없음 :" + e.getMessage());
				}
			
		}
		System.out.println("프로그램");
	}

}
