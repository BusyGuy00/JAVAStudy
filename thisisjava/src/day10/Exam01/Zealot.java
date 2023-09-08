package day10.Exam01;
 //extends Unit
public class Zealot implements Unit01 {

	String name  ; 
	int hp;
	int attack;
	
	public Zealot (String name) {
		this(name, 100, 10);
	}
	public Zealot (String name, int hp,int attack ) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	@Override // 인터페이스로 바꿀시 기본이 디폴트로 되는데 클래스가 퍼블릭으로 설정 돼있어서 퍼블릭 보다 낮은 것은 사용 할 수 없다 그래서 퍼블릭을 붙여 준다
	public int getAttack() {
		
		return attack;
	}
	@Override
	public int getHp() {
		
		return hp;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
		
	}
}
	