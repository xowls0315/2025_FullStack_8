package Day03.rpg;

class Mage extends Character {
	public Mage() {
		super(80, 100);
	}
	
	@Override
	public void attack() {
		System.out.println("마법사: 지팡이 공격! (데미지 5)");
	}
	
	@Override
	public void specialAttack() {
		if (mp >= 20) {
			mp -= 20;
			System.out.println("마법사: 파이어볼! (특수 데미지 40)");
		} else {
			System.out.println("마법사: MP 부족!");
		}
	}
}
