package day07.TestT;

public class Printerexam {
public static void main(String[] args) {
	 Printer printer = new Printer(); //라이브러리 클래스에 스태틱을 붙여 둬서 클래스명으로 호출 가능해졌다
//	 printer.println(10);
//	 printer.println(true);
//	 printer.println(5.7);
//	 printer.println("홍길동");
	 Printer.println(10);
	 Printer.println(true);
	 Printer.println(5.7);
	 Printer.println("홍길동");
}
}
