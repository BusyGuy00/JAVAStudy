package day05.Exam01;

import java.util.Scanner;

public class BookTT03 {
	public static void main(String[] args) {
		//점수를 분석하는 프로그램 
		Scanner scan = new Scanner(System.in);
//		null값으로 초기화 
		int[] scores = null;
		int students = 0;
		while (true) {
			String choice;
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택>");
//			입력받아서 choice에 할당
			choice=scan.nextLine();
			if(choice.equals("1")) {
				System.out.println("학생수>");
//				입력 받은 String 타입을 int 타입으로 형변환 해서 할당
				students = Integer.parseInt(scan.nextLine()); //인트 타입으로 변환
				//배열 초기화
				scores = new int[students];
			}else if (choice.equals("2")) {
				if(scores!=null) { //1번 값이 등록 안돼어 있을때 break 값
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores{"+i+"]>");
					scores[i] = scan.nextInt();
				}
				}else {
					System.out.println("학생 수를 먼저 입력 하세요");//1번 값이 등록 안돼어 있을때 break 값
				}
			}else if(choice.equals("3")) {
				if(scores!=null) {
					int j = 0;
					for(int i: scores) {
//						점수 입력전이면 반복문 종료
						if(i==0) {
							System.out.println("점수를 먼저 입력 하세요");
							break;
						}
						System.out.println("scores["+j+"]" + i);
						j++;
					}
				}else {
					System.out.println("학생 수를 먼저 입력 하세요");
				}
			}else if(choice.equals("4")) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i: scores) {
					max = (max<i) ? i : max;
					sum = sum +i;
				}
				avg = (double) sum / students;;
				System.out.println("최고 점수 :" + max);
				System.out.println("평균 점수 :" + avg);
			}else if (choice.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("1,2,3,4,5,중에서만 입력하세요");
			}
		}
	
}
}
