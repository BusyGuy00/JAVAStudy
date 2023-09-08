package day15.Exam01;

public class GetResourceExam {
	
	public static void main(String[] args) {
		Class clazz = Car.class;
		
//		getPath() url 객체의 메소드로 절대 경로를 리턴
		String img1path = clazz.getResource("img1.jpg").getPath();
		String img2path = clazz.getResource("image/img2.jpg").getPath();
		System.out.println(img1path);
		System.out.println(img2path);
		
	}
}
