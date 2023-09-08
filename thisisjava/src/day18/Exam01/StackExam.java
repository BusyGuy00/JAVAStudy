package day18.Exam01;

import java.util.Stack;

public class StackExam {
	
	public static void main(String[] args) {
		//Stack클래스는 LIFO자료 구조를 구현한 클래스 이다.
		
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(40));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(80));
		coinBox.push(new Coin(20));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼낸 동전 : " + coin.getValue());
		}
	}
}
