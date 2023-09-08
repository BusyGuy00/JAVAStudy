package day15.Exam03;

public class BoxObjectExam {

	public static void main(String[] args) {
		//타입 파라미터는 기본적으로 Object로 간주됨
		//Object클래스가 가지고 있는 equals()메소드를 호출함
		BoxObject box1 = new BoxObject();  //지정 하지 않으면 Object 타입이다.
		box1.content = "100";
		
		BoxObject box2 = new BoxObject();  
		box2.content = "100";
		
		BoxObject box3 = new BoxObject();  
		box3.content = 100;
		
		boolean result1 = box1.compare(box2);
		System.out.println("result1 : " + result1);
		
		boolean result2 = box1.compare(box3);
		System.out.println("result2 : " + result2);

	}

}
