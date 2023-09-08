package day17.Exam03;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) throws IOException {
		//Properties컬렉션 생성 
		Properties properties = new Properties();
		
		properties.load(PropertiesExam.class.getResourceAsStream("database.Properties"));

		
		//주어진 키에 대한 값
	
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		
		//값 출력 
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("admin : " + admin);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
