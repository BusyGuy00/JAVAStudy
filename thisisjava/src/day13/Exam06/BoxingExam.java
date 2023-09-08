package day13.Exam06;

public class BoxingExam {
	
	 public static void main(String[] args) {
		//Boxing
		 Integer obj1 = 200;
		 Integer obj2 = 300;
		 Integer obj3 = new Integer(600);
		 
		 //Unboxing
		 int value1 = obj1.intValue();
		 int value2 = obj2.intValue();
		 int value3 = obj3.intValue();
		 
		 //기본 타입 변수에 포장 타입 변수 대입시 언박싱 된다.
		 int value4 = obj1;
		 int value5 = obj2;
		 int value6 = obj3;
		 
		 System.out.println(obj1);
		 System.out.println(obj2);
		 System.out.println(obj3);
		 
		 Integer num1 = 200;
		 Integer num2 = 200;
		 //-128~127
		 Integer num3 = 120;
		 Integer num4 = 120;
		 
		 
		 System.out.println(num1==num2);  //false 객체기 떄문에 번지를 비교 해서 같지 않다고 나온다
		 System.out.println(num1.equals(num2)); //true 객체기 때문에 .equals로 비교 하면 된다.
		 System.out.println(num3==num4);
		
		 int a = Integer.parseInt("1220");
		 float f = Float.parseFloat("2.456f"); 
		 boolean b = Boolean.parseBoolean("true");
		 
		 
		 
		 
}
}
