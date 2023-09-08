package day05.Exam01;

import java.util.Scanner;

public class updownExamT {

	public static void main(String[] args) {
//5개의 정수를 일렵받아서 내림차순 정렬후 출력
		System.out.println("5개의 정수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		//내림차순 정렬
		int tmp; 
		//10 20 30 40 50 ----> 50 40 30 20 10 
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] < nums[j]) {
					tmp = nums[i];
					nums[i] = nums[j];
					nums [j] = tmp;
				}
			}
		}
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
		
		
}
}
		
		
	


