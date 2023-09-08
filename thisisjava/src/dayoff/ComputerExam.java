package dayoff;

public class ComputerExam {

	public static void main(String[] args) {
		Computer com = new Computer();
		int result1 = com.sum(new int[] {1,2,3,4,5,6});
		int[] arr = {1,2,3,4,5,6};
		int result2 = com.sum(arr);
		//에러남 int result = com.sum(1,2,3);
		int result3 = com.sum2(1,2,3,4,5);
		int result4 = com.sum2(arr);
		int result5 = com.sum2(new int[] {1,2,3,4});
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	}

}
