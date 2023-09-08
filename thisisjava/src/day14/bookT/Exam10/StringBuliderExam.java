package day14.bookT.Exam10;

public class StringBuliderExam {

	public static void main(String[] args) {
		String str = "";
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i);// StringBuilder sb = new StringBuilder();를 재정의 한 후에  str += i;를 지우고 append를 추가 해서 모드 더하게끔 한다 
		}
		str = sb.toString();
		System.out.println(str);

	}

}
