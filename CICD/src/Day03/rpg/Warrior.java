package Day03.rpg;

public class Warrior extends Character {
	public Warrior() {
		super(120, 50);
	}
	
	@Override
	public void attack() {
		System.out.println("전사: 강력한 칼 공격! (데미지 10)");
	}
	
	@Override
	public void specialAttack() {
		if (mp >= 10) {
			mp -= 10;
			System.out.println("전사: 파워 스트라이크! (특수 데미지 25)");
		} else {
			System.out.println("전사: MP가 부족합니다!");
		}
	}
}
