package day12exam01.Exam4;

public class TrywithExam1  {
	
public static void main(String[] args) throws Exception {
	MyResource res1 = null;
	
	try {
		//리소스 열기 
		res1 = new MyResource("res1");
		//리소스 읽기 
			System.out.println(res1.read1());
			System.out.println(res1.read2());		
				
	}
	catch (Exception e) {
		e.printStackTrace();
		
	}
	finally {
		res1.close();
	}
	
	
}
}

