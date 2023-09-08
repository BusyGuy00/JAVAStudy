package day12exam01.Exam4;

public class TrywithExam2 {
	public static void main(String[] args) {
		
//		try( MyResource res1 = new MyResource("res2");
//			 MyResource res2 = new MyResource("res2")){
//			System.out.println(res1.read2());
//			System.out.println(res1.read2());
		//java8 이전 버전은 try괄호에 리소스 변수를 선언해야 하지만 
		//java9 이후 버전은 외부 리소스 변수를 사용 할 수 있어졌다. 그래서 밑에와 같이 사용 할 수도 있다. 
		MyResource res1 = new MyResource("res2");
		MyResource res2 = new MyResource("res2");
			try( res1; res2 ){
				//리소스 읽기 
				System.out.println(res1.read2());
				System.out.println(res1.read2());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
