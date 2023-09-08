package day13.Exam04;

import java.util.Properties;
import java.util.Set;

public class GetpropertyExam {
	
	public static void main(String[] args) {
//		운영체제와 사용자 정보 출력 
//		user.dir 현대 디텍토리 경로
//		user.home 사용자 홈 디렉토리 경로 
//		java.home JDK디렉토리 경로 
//		java.specification.version 자바스펙버전
//		os.name 운영체제
		
		
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String dir = System.getProperty("user.dir");
		String home = System.getProperty("user.home");
		String javaversion = System.getProperty("java.specification.version");
				
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(dir);
		System.out.println(home);
		System.out.println(javaversion);
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objkey: keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.println(key + " , " + value);
		}
		
	}

}
