package day05.Exam01;

public class multiArayExam {

	public static void main(String[] args) {
//		각반의 학생수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열
		int[][] mathScore = new int[2][3];
		 mathScore[0][0] = 80;
		 mathScore[0][1] = 83;
		 mathScore[0][2] = 85;
		 mathScore[1][0] = 86;
		 mathScore[1][1] = 90;
		 mathScore[1][2] = 92;
		 
		 int[][] engScore = {
				 {80,83,85},
				 {86,90,92}
				 
		 };
		 int mathSum = 0;
		 for(int i=0; i<2; i++) {
			 for(int j=0; j<3; j++) {
				 mathSum = mathSum + mathScore [i][j];
			 }
		 }
		 System.out.println("수학점수의 합은 :" + mathSum);
		 
		 int[][] engScorees = {
				 {80,83,85},
				 {86,90,}
		 };
		 System.out.println("engScores의 배열길이는 : " + engScorees.length);
		 System.out.println("engScores[0]의 배열길이는 : " + engScorees[0].length);
		 System.out.println("engScores[1]의 배열길이는 : " + engScorees[1].length);
		 
	}

}
