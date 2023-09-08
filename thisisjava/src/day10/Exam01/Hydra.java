package day10.Exam01;

public class Hydra implements Unit01 {
	String name  ;
	int hp ;
	int attack ;
	
	public Hydra (String name) {
		this(name, 100, 30);
	}
	public Hydra (String name, int hp,int attack ) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	@Override
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
	public void setHp(int hp) { //세터 메서드 이다.
		this.hp = hp;
		
	}
}
