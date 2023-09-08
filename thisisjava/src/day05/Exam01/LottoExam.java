package day05.Exam01;

public class LottoExam {
	public static void main(String[] args) {
		//1~45번 까지 중복 없이 6개의 숫자를 출력하기
		int[] lotto = new int[6];
		//번호 생성 하기 
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) +1; //1~45중 랜덤
			//중복 번호 제거 
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
			
		}
		System.out.println("로또 번호 : ");
		for(int i=0; i<6; i++) {
			System.out.println(lotto[i] + "");
		}
		
		
		
		
	
}
}
