package day14.bookT.Exam05.copy;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override //hashCode()가 일치하는지 비교 하고  equals가 일치하는지 비교 한다 
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();	
	}

	@Override
	public boolean equals(Object obj) {
		//Student 클래스의 인스턴스인지 확인 
		//강제 타입 변환 Student타입으로 
		if (obj instanceof Student stu) { //java11 부터는 밑에 생략하고 마지막에 stu룰 함으로써 같은 효력이 있다
		//	Student stu = (Student) obj;
			if(studentNum.equals(stu.studentNum)) { // equals를 통해서 번지 객체를 비교 하여 동등 객체인지 확인 하는데 
				return true;
			}
		}
		return false;
		
	}

	//obj.equals(obj2) obj 클래스이 equals 메소드 사용 (객체 번지 비교 
	//Student 클래스에서 equals 메소드 재정의 
	//studentNum 필드의 값을 비교 하도록 해시 코드를 통해서 재정의 한다.

	
}
