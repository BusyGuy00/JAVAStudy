package day18.Book.Exam08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
		
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) { // num값 끼리 비교 하면 된다. 
		if (obj instanceof Student stu) {
			if (studentNum == stu.studentNum) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	

}
