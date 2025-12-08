package Day03.rpg;

class Golem extends Monster {
	public Golem() {
		super(120);
	}
	
	@Override
	public void attack() {
		System.out.println("골렘: 돌주먹 강타! (데미지 15)");
	}
}
