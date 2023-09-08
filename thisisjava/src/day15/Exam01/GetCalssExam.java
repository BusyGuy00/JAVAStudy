package day15.Exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetCalssExam {
public static void main(String[] args) {
	Class clazz = Car.class;
//	
//	Class clazz2 = Class.forName("day15.exam01.car");
//	Car car = new Car();
//	Class clazz3 = car.getClass();
	
	System.out.println("패키지 : " + clazz.getPackage().getName());
	System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
	System.out.println("클래스 전체 이름 : "+ clazz.getName());
	
	
	System.out.println("생성자 정보");
	Constructor[] Constructors = clazz.getDeclaredConstructors();
	for(Constructor con : Constructors) { //for안에 Constructors 배열을 넣어서 배열 만큼 돌린다.
		System.out.print(con.getName()+"(");
		Class[] parameters = con.getParameterTypes();
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<parameters.length-1) {
				System.out.print(",");
			}
		}
		System.out.println(")"); //생성자 마다 줄을 바꾸라는 언어
		
		
	}
	System.out.println("필드 정보 ");
	Field[] fields = clazz.getDeclaredFields();
	for(Field f: fields) {
		System.out.println(f.getType().getName() + " " + f.getName());
		
	}
	System.out.println("메소드 정보");
	Method[] methods = clazz.getDeclaredMethods();
	for(Method m : methods) {
		System.out.print(m.getName()+"(");
		Class[] parameters = m.getParameterTypes();
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<parameters.length-1) {
				System.out.print(",");
			}
		}
		
		System.out.println(")");
	}
	
}
}
