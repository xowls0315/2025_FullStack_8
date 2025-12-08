package Day03.rpg;

class Wolf extends Monster {
	public Wolf() {
		super(50);
	}
	
	@Override
	public void attack() {
		System.out.println("울프: 이빨 물기 공격! (데미지 7)");
	}
}
