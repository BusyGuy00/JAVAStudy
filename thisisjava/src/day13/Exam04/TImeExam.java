package day13.Exam04;

public class TImeExam {

	public static void main(String[] args) {
		//currentTimeMillis() 1/1000초 단위  
		//1970년 1월 1일 0시 부터 현재까지의 시간을 밀리초로 리턴 
		//nanoTime() 1/10^9 초 단위
		//1970년 1월 1일 0시 부터 현재까지의 시간을 밀리초로 리턴 		
		long time1 = System.currentTimeMillis();
		int sum = 0; 
		for (int i=0; i<=1000000000; i++) {
			sum += i;
		}
		for (int i=0; i<=1000000000; i++) {
			sum += i;
		}
		for (int i=0; i<=1000000000; i++) {
			sum += i;
		}
		for (int i=0; i<=1000000000; i++) {
			sum += i;
		}

		long time2= System.currentTimeMillis();
		System.out.println("계산에"+ (time2-time1)+ "나노초가 소요 됐습니다.");

	}

}
