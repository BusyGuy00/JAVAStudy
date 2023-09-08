package day13.Exma01;

public class Member {
	public String id; 
	
	public Member(String id) {
		this.id = id;
		
	}

	@Override  // 오브젝트에 받는 equals를 여기서 변환 해준다
	public boolean equals(Object obj) {
		//Object 타입이 Member타입인지 검사하고 
		// 타입 변환 후 target에 대입
		if(obj instanceof Member target) {
			//Member m = (Member) obj;  위에 target를 Member 뒤에 적어줘서 옆에와 같이 안해도 괜찮다 // Member타입 강제 형뱐환
			//id 문자열이 일치하는지 비교 
			if(id.equals(target.id)) {
				return true;
			}
			
		
		}
		return false;
	}	

	
}

	
