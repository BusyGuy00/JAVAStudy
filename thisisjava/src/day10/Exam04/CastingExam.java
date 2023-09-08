package day10.Exam04;

public class CastingExam {
public static void main(String[] args) {
	Bus bus1 = new Bus();
	bus1.checkFare();
	bus1.run();
	// 버스 타입으로 강제 타입 변환 
	Vehicle bus2 = new Bus();
	bus2.run();
	Bus bus3 = (Bus) bus2;
	bus3.checkFare();
	bus3.run();
}
}
