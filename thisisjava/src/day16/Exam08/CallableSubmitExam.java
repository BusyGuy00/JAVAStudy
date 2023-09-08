package day16.Exam08;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExam {

		public static void main(String[] args) {
			//스레드풀 생성 하기 
			ExecutorService executorService = Executors.newFixedThreadPool(5);
			//계산 작업및 처리 요청 
			for(int i=1; i<=100; i++) {
				final int idx=i;
				Future<Integer> future = executorService.submit(new Callable<Integer>() {

					@Override
					public Integer call() throws Exception {
						int sum = 0; 
						for (int i=1; i<=idx; i++) {
							sum += i;
						}
						Thread thread = Thread.currentThread();
						System.out.println("["+thread.getName()+"]1~" + idx + "합계산");
						return sum;
					}
					
				});
				//출력하기
				try {
					int result = future.get();
					System.out.println("리턴값 : "+ result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//ExecutorService 삭제 
			executorService.shutdown();
			
		}
}
