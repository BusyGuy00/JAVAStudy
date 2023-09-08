package day07.exam01;

public class ComputerExam {
	// static 정적멤버		void main 리턴이 없는 메소드 이다 
public static void main(String[] args) {
	// Computer 객체 생성
	 Computer mycom = new  Computer();
	 // sum() 메소드 호출시 합산결과를 리턴 받아서 result에 할당
	 int result1 = mycom.sum(1,2,3);
	 int result2 = mycom.sum(5,6,7,8,9,10);
	 int[] nums = {1,2,3,4,5};  //매개 변수 여로개를 전부 더할때 사용 가능한 방법 중에 배열로 전달 하는 방법
	 int result3 = mycom.sum(nums);
	 int result4 = mycom.add(2, 10);
	 double result5 = mycom.add(2.56, 3.45);
	 double result6 = mycom.areaRectangle(10.5);
	 double result7 = mycom.areaRectangle(10.5,2.5);
 
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	System.out.println(result5);
	System.out.println(result6);
	System.out.println(result7);
	
	
}
}
