package day14.bookT.Exam09;

public class DecodingExam {

	public static void main(String[] args) throws Exception {
		byte[] bytes = {-20, -107,-120,-21,-123,-107};
		String str = new String(bytes,"utf-8"); // utf-8로 했다고 재정의 해주는 과정 
		System.out.println("str : " + str);

	}

}
