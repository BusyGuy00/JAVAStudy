package day15.Exam02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExam {
	
	public static void main(String[] args) throws Exception,  IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		클래스 객체 만들고 메소드 정보 받기 ( 메소드 배열 받기 )
	    Method[] methods = Service.class.getDeclaredMethods();
		
		for(Method m: methods) {
			//PrintAnnotation 얻기
			//지정한 어노테이션이 적용되어 있으면 어노테이션 리턴 정용되지 않으면 null리턴 
			PrintAnnotation printannotation = m.getAnnotation(PrintAnnotation.class);
			//메소드 호출 - 인스턴스 메소드라서 객체가 필요 하다
			
			m.invoke(new Service());
			if(printannotation!=null) {
				//number 속성값 반환 
				int number = printannotation.number();
				for(int i=0; i<number; i++) {
					String value = printannotation.value();
					System.out.print(value);
				}
				System.out.println(
						);
			}
			
			
			
		}
		
		
	}
}
