package day05.Exam01;

public class arrayBookTest {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}
		};
		System.out.println(array.length);
		System.out.println(array[2].length);
		System.out.println("------------------------------------------");
	
		
		
		int[] array2= new int[] {1, 5, 3, 8, 2};
		int max = array2[0];
		
		for(int i=1; i<array2.length; i++) {
			if(array2[i]>max) {
				max = array2[i];
			}
		}
		System.out.println(max);
		
		System.out.println("------------------------------------------");
//		{95,86},
//		{83,92,96},
//		{78,83,93,87,88}
	
		int[][] array3 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};
		int sum = 0;
		double avg = 0.0;
		 int count = 0;
		
		for(int i=0; i<array3.length; i++) {
			for(int j=0; j<array3[i].length; j++) {
				count++;
				sum += array3[i][j];
		 avg =(double) sum / count;
		 	
			}
		}
		System.out.println("총합 : " + sum);
	 	System.out.println("평균 : " + avg);
	
			
	}
		
	
}

