package day05.Exam01;

public class BookTT02 {
public static void main(String[] args) {
//	전체 합과 평균을 구해라 
	int [][] array= {
			{95,85},
			{83,92,96},
			{78,83,93,87,88}
	};
		int sum = 0; 
		double avg = 0.0;
		int leng = 0;
		for (int[] arr : array) { // 향상된 포문이라서 index로 가져 오는게 아니라 값을 바로 가져 온다
			for(int a: arr) {
				sum += a;
			}
			leng += arr.length;	
		}
		avg = sum / (double) leng;
		
		System.out.println("총합은 : " + sum);
		System.out.println("평균 : " + avg);	

	}

}
