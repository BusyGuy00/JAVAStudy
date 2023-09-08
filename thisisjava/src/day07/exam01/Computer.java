package day07.exam01;

public class Computer {
	 // 메소드 선언  //매개 변수 갯수를 모르고 미지정 할때 사용 할 수 있다. 
		int sum(int ...values) {
			//sumnum 변수 선언 
			int sumNum = 0; 
			for(int i=0; i<values.length; i++) {
				sumNum +=values[i];
			}
			return sumNum;
		}  
		// add 메소드 오버로딩 예시 (다양한 매개 값을 처리 하기 위해 사용)
		int add(int x, int y) {
			return x+y;
		}
		double add(double x, double y) {
			return x+y;
		}
		 //정사각형의 넓이 
		 double areaRectangle(double width) {
			 return width*width;
		 }
		 //직사각형의 넓이
		 double areaRectangle(double width, double height) {
			 return width*height;
		 }
	} 


