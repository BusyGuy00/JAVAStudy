package day13.Exma01;

public class Student {
	
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no; 
		this.name = name;
	}
	//필드 선언을 private로 했기 때문에 퍼블릭으로 게터 선언? 
	public int getNo() { return no; }
	public String getName() { return name;}
	
	
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		//Object 타입의 Student클래스의 인스턴스이면 
		//student 타입의 형변환후 target에 대입 
		if (obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}

}
