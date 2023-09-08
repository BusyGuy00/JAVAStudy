package day05.Exam01;

import java.util.Scanner;

public class ArrayTT {
	public static void main(String[] args) {
//		4자리 이하의 10개의 정수를 입력 받아 짝수중 가장 큰 값과 홀 수중 가장 작은 값을 출력
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[10];
		int max = 0; 		//가장 작은수 보다 더 작은수 입력 1보다 작은 0
		int min = 10000;	//가장 큰수 보다 더 큰수 입력 9999보다 큰 1만
		for(int i=0; i<10; i++) {
			nums[i] = scan.nextInt();
			// 짝수의 값이 max보다 크면 max에 값 할당
			if(nums[i]%2==0) {
				if(nums[i]>max) {
					max = nums[i];
				}
			} // 홀수 일때
			else {
				//홀슈의 값이 min값보다 작으면 min에 그값을 할당 
				if(nums[i]<min) {
					min = nums[i];
				}
			}	
			
		}
			System.out.println("홀수 중에 최소값은 :" + min);
			System.out.println("짝수 중에 최대값은 :" + max);
		
//		5개의 정수를 {95, 75, 85, 100, 50}로 초기화 하고 오름차순으로 정렬 하시오 
			int[] nums2 = {95, 75, 85, 100, 50};
			//{75 95 85 100 50}
			//{50 95 85 100 75}  --비교를 통해 오름차순으로 만든다--
			//{50 75 95 100 85}
			int tmp=0;
			for(int i=0; i<nums2.length-1; i++) { // 마지막 것을 계산 하지 않아도 돼서 -1이 들어갔다
				for (int j=i+1; j<nums2.length; j++) {
					//nums2[i]보다 nums2[j] 적으면 바꾸기
					if(nums2[i] > nums2[j]) {
						tmp = nums2[i]; //95를 tmp에 담기
						nums2[i] = nums2[j]; // 75를 0번쨰에 담기 
						nums2[j] = tmp;	//95를 nums2[1]
					}
				}
			}
				for(int i=0; i<nums2.length; i++) {
					System.out.println(nums2[i]);
				}
}
}
