package dayoff;

public class Single {
	
	//정적필드
	private static Single single1 = new Single();
	//생성자
	private Single(){};
	//정적메소드
	static Single getInstanceof(){
	return single1;
		}
	

}
