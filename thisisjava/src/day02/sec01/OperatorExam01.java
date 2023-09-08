package day02.sec01;

public class OperatorExam01 {

	public static void main(String[] args) {
		//단항 연산자 
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result2 : " + result1);
		System.out.println("result2 : " + result2);
		
		// int 보다 작은 타입의 변수는 부호 연산시 int로 자동 타입변환 
		byte b = 100;
		int result3 = -b;
		System.out.println("result3: " + result3);
		
		//증강 연산자
		int num1 = 10;
		int num2 = 20;
		int num3;
		int num4;
		
	
		System.out.println("------------------------");
		num1++; //11
		++num1; //1+11 12
		System.out.println("num1은" + num1);
		//20
		num3 = num2++; // 뒤에 있는(후위) ++는 할당 될떄는 ++가 사용 되지 않는다 num3 20 num2 21
		num4 = ++num2; // num4 22 앞에 있는(전위) ++가 할당 되어 대입 된다.
		System.out.println("num3는" + num3);
		System.out.println("num4는" + num4);
		
//		int x = 1;
//		x++;		//2
//		++x;		//3
//		int z = x++ //z=3 x=4
//		int y + ++x// t=5 x=5
		
	}

}
