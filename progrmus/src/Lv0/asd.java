package Lv0;

import java.util.Scanner;
//toLowerCase(), toUpperCase()
//객체 instanceof Bus true, false
//65~90 대문자
//Character.
public class asd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String input = "";
		String output = "";
		char tmp = 0;
		
		for(int i = 0; i<a.length(); i++) {
			tmp = a.charAt(i);
		if((65<=tmp) && (90>=tmp)) {
			output += a.valueOf(tmp).toLowerCase();
			
		}else if ( (97 <= tmp) && (tmp <= 122)) {
			output += a.valueOf(tmp).toUpperCase();
		}else {
			output += (char)tmp;
		}
		}System.out.println(output); 
		      
	} 
}
		


