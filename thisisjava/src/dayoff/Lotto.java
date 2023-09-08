package dayoff;

public class Lotto {

	public static void main(String[] args) {
		//숫자 45개를 넣을 배열 생성 
		int[] nums = new int[45];
		//1~45까지 넣으시오
		for(int i=0; i<45; i++) {
			nums[i] = i+1;
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " , ");
		}
		//숫자 섞기 스와핑 - 기준은 0번째 숫자 부터 하여 섞기
		for(int i=1; i<=100; i++) {
			int temp = nums[0];
			int rand = (int)(Math.random()*44)+1;
			nums[0] = nums[rand];
			nums[rand] = temp;
		}
		System.out.println();
		for (int i=0; i<6; i++) {
			System.out.print(nums[i] + " , ");
		}
		int[] scores = new int[5];
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		for (int score : scores) {
			System.out.println(score);
		}
	}

}
