package day16.Exam08;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableexecuteExam {

	public static void main(String[] args) {
		//1000개 매일 생성
		
		String[][] mails = new String[1000][3];
		for (int  i = 0; i<mails.length; i++) {
			mails[i][0] = "admi@my.com";
			mails[i][1] = "memver" +i+ "@my.com";
			mails[i][2] = "신상품 입고";
		}
		
		//스레드풀 생성 ExecutorService --> 최대 스레드 수는 5
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		//이메일을 보내는 작업 생성및 처리 요청 
		//스레드풀.execute(Runnable구현 객체)
		for (int i=0; i<1000; i++) {
			final int idx = i;
			executorService.execute(new Runnable() {

				@Override
				public void run() {
					//실행중인 스레드 반환
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("["+thread.getName()+"]"
										+ from + "==>" +to+" : " + content);
				}
				
			});
		}
		//ExecutorService
		executorService.shutdown();
		
	}

}
