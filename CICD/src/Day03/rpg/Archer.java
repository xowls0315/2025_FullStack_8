package Day03.rpg;

class Archer extends Character {
	public Archer() {
		super(90, 75);
	}
	
	@Override
	public void attack() {
		System.out.println("궁수: 화살 발사! (데미지 8)");
	}
	
	@Override
	public void specialAttack() {
		if (mp >= 15) {
			mp -= 15;
			System.out.println("궁수: 연속 사격! (특수 데미지 30)");
		} else {
			System.out.println("궁수: MP 부족!");
		}
	}
}
