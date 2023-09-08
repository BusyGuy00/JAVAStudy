package day18.Exam01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메세지 넣기 
		messageQueue.offer(new Message("send","a"));
		messageQueue.offer(new Message("send","곧주말"));
		messageQueue.offer(new Message("send","c"));
		
		while(messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			System.out.println(message.to);
		}
			
		

	}

}
