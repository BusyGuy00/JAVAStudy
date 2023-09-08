package day05.Exam01;

import java.util.Scanner;

public class ArrayExam03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		제일 큰 수 구하기 
//		숫자 3개를 입력 받고 배열에 넣고 그중 큰수 구하기
		int[] nums = new int[5]; //{0,0,0,0,0}
		System.err.println("숫자 5개 :");
		for(int i=0; i<nums.length; i++) {
			nums[i]= scan.nextInt();
		}
		//큰수를 담을 변수에 0번 
		int maxNum = nums[0];
		//nums[1]숫자가 maxnum 보다 크나요? 크면 maxNum에 nums[1] 할당
		//nums[2] maxNum보다 크나요
		for(int i=1; i<nums.length; i++) {
			if(nums[i] > maxNum) {
				maxNum = nums[i];
			}
		}
		System.out.println("최대값 :" + maxNum);
		
		scan.close();
		int maxNum1 = nums[0];
		//nums[1]숫자가 maxnum 보다 크나요? 크면 maxNum에 nums[1] 할당
		//nums[2] maxNum보다 크나요
		for(int i=1; i<nums.length; i++) {
			if(nums[i] < maxNum1) {
				maxNum1 = nums[i];
			}
		}
		System.out.println("최소값 :" + maxNum1);
		scan.close();
		
	}

}
