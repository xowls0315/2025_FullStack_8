package Day03.rpg;

public class RPGApp {
	public static void main(String[] args) {
		Character warrior = new Warrior();
		Monster wolf = new Wolf();
		
		System.out.println("== 전투 시작 ==");
		warrior.attack();
		warrior.specialAttack();
		wolf.attack();
		
		System.out.println("\n== 다른 캐릭터 테스트 ==");
		Character mage = new Mage();
		Character archer = new Archer();
		
		mage.attack();
		mage.specialAttack();
		archer.attack();
		archer.specialAttack();
		
		System.out.println("\n== 골렘 등장 ==");
		Monster golem = new Golem();
		golem.attack();
	}
}
