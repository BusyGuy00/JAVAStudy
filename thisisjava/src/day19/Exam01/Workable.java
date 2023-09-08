package day19.Exam01;

//컴파일 과정에서 추상 메소드가 하나인지 검사를 하도록 함 
//정확한 함수형 인터페이스를 작성 하도록 도와줌 
@FunctionalInterface //람다식이 틀렸는지 체크 해준다
public interface Workable {
	void work();
//	void run(); //메소드가 두개 이상일 수 없어서 구현 불가능을 @FunctionalInterface을 통해 체크 할 수있다
	

}
