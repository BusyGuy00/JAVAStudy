package day05.Exam01;

public class ArrayCopyExam {

	public static void main(String[] args) {
		int[] oldIntArray = {10, 20, 30};
		int[] newIntArray = new int[3];
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		//배열 복사가 아닌 배얄의 참조 번지 복사
		int[] newIntArray2 = oldIntArray;
		oldIntArray[0] = 100;
		for(int i=0; i<newIntArray2.length; i++) {
			System.out.println(newIntArray2 [i]);
		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray [i]);
			//string 배열
			String[] oldstrArray = {"java", "array", "copy"};
			String[] newstrArray1 = oldstrArray ;
			oldstrArray[2] ="copycopy";
			System.out.println(newstrArray1[2]);
			String [] newstrArray2 = new String[5];
		
			//{null, null. null, null}
			for(int j=0; j<oldstrArray.length; j++) {
				//newstrArray2[0] = "java"
				//newstrArray2[1] = "java"
				//newstrArray2[2] = "java"
				 newstrArray2[j] = oldstrArray[j];
			}
   			for (int j=0; j<newstrArray2.length; j++) {
				 System.out.println(newstrArray2[j]);
			}
   			System.out.println("--------------------------------");
   			int[] oldnums = {10,20,30};
   			int[] newnums = new int[5];
   			System.arraycopy(oldnums, 1, newnums, 1, 2);
//   			for(int f=0; f<newnums.length; f++) {
//   				System.out.println(newnums[f] + " ");
   			for(int f:newnums) {
   				System.out.println(f + " ");
   			}
   			String[] str2 = {"a", "b", "c", "d", "e"};
   			for(String s: str2) {
   				System.out.println(s);
   			}
   			int [] scores = {95, 71, 84, 93, 87};
   			int sum = 0;
   			for (int q:scores) {
   				sum = sum +q;
   			}
   			System.out.println("합게는 :" + sum);
		}
	}
}

