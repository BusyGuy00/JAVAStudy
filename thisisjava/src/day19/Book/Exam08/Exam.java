package day19.Book.Exam08;

public class Exam {
	private static Student[] students = {
			new Student ("홍길동",90,96),
			new Student ("신용권",95,93)
	};
	public static double avg(Function <Student> function) {
		int sum = 0;
		for (Student stu:students) {
			sum += function.apply(stu);
		}
		double avg = (double) sum / students.length;
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s->s.getEnglishScore());
		System.out.println("영어 평균 점수 : " + englishAvg);
		
//		double englishAvg2 = avg( Student :: getEnglishScore());
//		System.out.println("영어 평균 점수 : " + englishScore);
		
		double mathAvg = avg(s ->s.getMathScore());
		System.out.println("수학 편균 점수 : " + mathAvg);
		
		double englishAvg3 = avg(new Function <Student>() {

			@Override
			public double apply(Student s) {
				return s.getEnglishScore();
			}
			
		});
	}
}
