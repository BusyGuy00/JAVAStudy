package day10.Exam01;

public class OOPEx01 {
	
//	//attack 오버로딩
//	
//	//질럿이 질럿을 공격 하는 메소드 
//	 static void attack (Zealot u1, Zealot u2) {
//		 u2.hp = u2.hp - u1.attack;
//		 System.out.println(u2.name + "의 체력은"+ u2.hp + "입니다.");
//	 }
//	 //질럿이 드라군 공격 
//	 static void attack ( Zealot u1 ,Dragoon u2) {
//		 u2.hp = u2.hp - u1.attack;
//		 System.out.println(u2.name + "의 체력은"+ u2.hp + "입니다.");
//	 }
//	//질럿이 히드라을 공격 하는 메소드 
//		 static void attack (Zealot u1, Hydra u2) {
//			 u2.hp = u2.hp - u1.attack;
//			 System.out.println(u2.name + "의 체력은"+ u2.hp + "입니다.");
//		 }
////		----------------------------------------------------------------
//		 //드라군이 질럿을 공격 하는 메소드 
//		 static void attack (Dragoon u1, Zealot u2) {
//			 u2.hp = u2.hp - u1.attack;
//			 System.out.println(u2.name + "의 체력은"+ u2.hp + "입니다.");
//		 }
//		 //드라군이 드라군 공격 
//		 static void attack (Dragoon u1 ,Dragoon u2) {
//			 u2.hp = u2.hp - u1.attack;
//			 System.out.println(u2.name + "의 체력은"+ u2.hp + "입니다.");
//		 }
//		 //드라군이 히드라을 공격 하는 메소드 
//		 static void attack (Dragoon u1, Hydra u2) {
//			 u2.hp = u2.hp - u1.attack;
//			 System.out.println(u2.name + "의 체력은"+ u2.hp + "입니다.");
//		 }
////		----------------------------------------------------------------
//		 //히드라가 질럿 공격 하는 메소드 
//		 static void attack (Hydra u1, Zealot u2) {
//			 u2.hp = u2.hp - u1.attack;
//			 System.out.println(u2.name + "의 체력은"+ u2.hp + "입니다.");
//		 }
//		 //히드라가 드라군을 공격 
//		 static void attack ( Hydra u1 ,Dragoon u2) {
//			 u2.hp = u2.hp - u1.attack;
//			 System.out.println(u2.name + "의 체력은"+ u2.hp + "입니다.");
//		 }
//		 //히드라가 히드라를 공격 하는 메소드 
//		 static void attack (Hydra u1, Hydra u2) {
//			 u2.hp = u2.hp - u1.attack;
//			 System.out.println(u2.name + "의 체력은"+ u2.hp + "입니다.");
//		 }
//		----------------------------------------------------------------
	 static void attack (Unit01 u1, Unit01 u2) {
		 u1.setHp(u1.getHp()-u2.getAttack());
		 System.out.println(u1.getName()+"이 "+ u2.getName()+"에게 공격당해서 체력이"+u1.getHp()+"가 되었습니다.");
	 }
	
 public static void main(String[] args) {
	 Zealot z1 = new Zealot ("질럿 1");
	 Dragoon d1 = new Dragoon("드라군 1");
	 Hydra h1 = new Hydra("히드라 1");
	 attack(z1,d1);
	 attack(z1,h1);
	 attack(z1,z1);
	 attack(d1,d1);
	 attack(d1,h1);
	 attack(d1,z1);
	 attack(h1,d1);
	 attack(h1,h1);
	 attack(h1,z1);

	

	}
	 
	 
}

