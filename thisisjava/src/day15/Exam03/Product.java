package day15.Exam03;

//제네릭 타입
public class Product<K,M> {
	
	//필드 
	private K kind;  // 원래 타입 지정을 String라고 지정을 해주어야 하지만 어떤게 올지 몰라서 K로 지정해서 편하게 타입을 지정 가능 하다 
	private M model;
	
	//메소드 
	public K getKind() { 
		return this.kind; 
		}
	public M getModel( ) {
		return this.model; 
		}
	public void setkind(K kind) {
		this.kind=kind;
		}
	public void setModel (M model) {
		this.model = model;
		}

}
