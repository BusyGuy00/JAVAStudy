package day16.Exam01;

public class MainTreadExam {
	public static void main(String[] args) {
		System.out.println("시작");
		Thread currThread = Thread.currentThread();
		System.out.println(currThread.getName());
		
		System.out.println("종료");
	}
}
